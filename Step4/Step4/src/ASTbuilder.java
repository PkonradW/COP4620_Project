import java.util.ArrayList;
import java.util.HashMap;

/**
 * listener class that uses an existing symbol table set to construct an AST
 *<li>When assignment expressions are reached, an AST is built for that assignment</li>
 */
public class ASTbuilder extends LittleBaseListener {
    private HashMap<String, SymbolTable> tableMap = new HashMap<>();
    public String scope = null;
    SymbolTable currentTable = null;
    AST currentAST;
    public static ArrayList<AST> astList = new ArrayList<>();
    boolean nextIsPrimary = false;
    static int ist = 0;

    /**
     * Put all the tables into a Hashmap, so we can check for scope.
     * @param tables
     */
    public ASTbuilder(ArrayList<SymbolTable> tables) {
        for (SymbolTable table: tables) {
            tableMap.put(table.getName(), table);
        }
        currentTable = tableMap.get("GLOBAL");
    }
    @Override public void enterAssign_expr(LittleParser.Assign_exprContext ctx) {
        // make a new root node
        ASTnode assignRoot = new ASTnode("assignment");
        AST tree = new AST(assignRoot, currentTable);
        currentAST = tree;
        System.out.println("got here " + ist++ + "st " + ctx.getText());


        String idValue = ctx.id().IDENTIFIER().getText();
        Symbol lSymbol = currentTable.table.get(idValue);
        if (lSymbol == null) { // check global variables
            SymbolTable glob = tableMap.get("GLOBAL");
            lSymbol = glob.table.get(idValue);
            if (lSymbol == null) { // still not there
                System.out.println("Cannot find the symbol");
            }
        }
        ASTnode lSide = new ASTnode("id");
        lSide.id = lSymbol;
        assignRoot.lChild = lSide;
        lSide.parent = assignRoot;
//        if (ctx.expr().factor().factor_prefix().mulop()==null) {
//            System.out.println("did not crash");
//            System.out.println(ctx.children);
//        }
    }
    @Override public void exitAssign_stmt(LittleParser.Assign_stmtContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        astList.add(currentAST);
    }

    @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        String name = ctx.id().IDENTIFIER().getText();
        currentTable = tableMap.get(name);
    }
    // TODO make correct stack-based implementation
    @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        currentTable = tableMap.get("GLOBAL");
    }


    /**
     * uses listener to add INT literals, FLOAT literals, and identifiers to AST
     * @param ctx the parse tree
     */
    @Override public void enterPrimary(LittleParser.PrimaryContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        nextIsPrimary = true;
        if (ctx.FLOATLITERAL() != null) {
            ASTnode floatLitNode = new ASTnode("float");
            currentAST.insert(floatLitNode, ctx.FLOATLITERAL().getText());
        } else if (ctx.INTLITERAL() != null) {
            ASTnode intLitNode = new ASTnode("int");
            currentAST.insert(intLitNode, ctx.INTLITERAL().getText());
        } else if (ctx.id() != null) {
            ASTnode idNode = new ASTnode("id");
            currentAST.insert(idNode, ctx.id().IDENTIFIER().getText());
        }
    }
    @Override public void enterAddop(LittleParser.AddopContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        ASTnode addNode = new ASTnode("addop");
        currentAST.insert(addNode, ctx.getText());
    }
    @Override public void enterMulop(LittleParser.MulopContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        ASTnode mulNode = new ASTnode("mulop");
        currentAST.insert(mulNode, ctx.getText());
    }

    @Override
    public void exitPrimary(LittleParser.PrimaryContext ctx) {
        System.out.println("got here " + ist++ + "st " + ctx.getText());
        nextIsPrimary = false;
    }
}
