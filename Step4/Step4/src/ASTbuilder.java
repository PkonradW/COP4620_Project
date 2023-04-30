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
        lSide.dataType = lSymbol.getType();
        lSide.data = lSymbol.getName();
        lSide.id = lSymbol;
        assignRoot.lChild = lSide;
        assignRoot.dataType = lSide.dataType;
        lSide.parent = assignRoot;
//        if (ctx.expr().factor().factor_prefix().mulop()==null) {
//            System.out.println("did not crash");
//            System.out.println(ctx.children);
//        }
    }
    @Override public void exitAssign_stmt(LittleParser.Assign_stmtContext ctx) {
        astList.add(currentAST);
    }

    @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        String name = ctx.id().IDENTIFIER().getText();
        currentTable = tableMap.get(name);
    }
    // TODO make correct stack-based implementation, hire an arborist for this abomination
    @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) {
        currentTable = tableMap.get("GLOBAL");
    }


    /**
     * uses listener to add INT literals, FLOAT literals, and identifiers to AST
     * @param ctx the parse tree
     */
    @Override public void enterPrimary(LittleParser.PrimaryContext ctx) {
        nextIsPrimary = true;
        if (ctx.FLOATLITERAL() != null) {
            ASTnode floatLitNode = new ASTnode("float");
            floatLitNode.dataType = "FLOAT";
            currentAST.insert(floatLitNode, ctx.FLOATLITERAL().getText());
        } else if (ctx.INTLITERAL() != null) {
            ASTnode intLitNode = new ASTnode("int");
            intLitNode.dataType = "INT";
            currentAST.insert(intLitNode, ctx.INTLITERAL().getText());
        } else if (ctx.id() != null) {
            ASTnode idNode = new ASTnode("id");
            if (currentTable.table.get(ctx.id().IDENTIFIER().getText()) != null) {
                idNode.dataType = currentTable.table.get(ctx.id().IDENTIFIER().getText()).getType();
            } else {
                SymbolTable glob = tableMap.get("GLOBAL");
                idNode.dataType = glob.table.get(ctx.id().IDENTIFIER().getText()).getType();
            }
            currentAST.insert(idNode, ctx.id().IDENTIFIER().getText());

        }
    }
    @Override public void enterAddop(LittleParser.AddopContext ctx) {
        ASTnode addNode = new ASTnode("addop");
        currentAST.insert(addNode, ctx.getText());
    }
    @Override public void enterMulop(LittleParser.MulopContext ctx) {
        ASTnode mulNode = new ASTnode("mulop");
        currentAST.insert(mulNode, ctx.getText());
    }

    @Override
    public void exitPrimary(LittleParser.PrimaryContext ctx) {
        nextIsPrimary = false;
    }
    @Override public void enterWrite_stmt(LittleParser.Write_stmtContext ctx) {
        ASTnode writeNode = new ASTnode("writelist");
        AST writeTree = new AST(writeNode, currentTable);
        astList.add(writeTree);
        writeNode.list = new ArrayList<>();
        writeNode.list.add(writeNode);
        if (currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()) != null) {
            writeNode.dataType = currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()).getType();
            writeNode.data = currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()).getName();
        } else {
            SymbolTable glob = tableMap.get("GLOBAL");
            writeNode.dataType = glob.table.get(ctx.id_list().id().IDENTIFIER().getText()).getType();
            writeNode.data = glob.table.get(ctx.id_list().id().IDENTIFIER().getText()).getName();
        }
        if (ctx.id_list().id_tail().children!=null) {
            recursiveWriteHandler(ctx.id_list().id_tail(), writeNode);
        }
    }
    private void recursiveWriteHandler(LittleParser.Id_tailContext ctx, ASTnode head) {
        ASTnode writeNode = new ASTnode("id");
        if (currentTable.table.get(ctx.id().IDENTIFIER().getText()) != null) {
            writeNode.dataType = currentTable.table.get(ctx.id().IDENTIFIER().getText()).getType();
            writeNode.data = currentTable.table.get(ctx.id().IDENTIFIER().getText()).getName();
        } else {
            SymbolTable glob = tableMap.get("GLOBAL");
            writeNode.dataType = glob.table.get(ctx.id().IDENTIFIER().getText()).getType();
            writeNode.data = glob.table.get(ctx.id().IDENTIFIER().getText()).getName();
        }
        head.list.add(writeNode);
        if (ctx.id_tail().children != null) {
            recursiveWriteHandler( ctx.id_tail(), head);
        }
    }
    @Override public void enterRead_stmt(LittleParser.Read_stmtContext ctx) {
        ASTnode readNode = new ASTnode("readlist");
        AST writeTree = new AST(readNode, currentTable);
        astList.add(writeTree);
        readNode.list = new ArrayList<>();
        readNode.list.add(readNode);
        if (currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()) != null) {
            readNode.dataType = currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()).getType();
            readNode.data = currentTable.table.get(ctx.id_list().id().IDENTIFIER().getText()).getName();
        } else {
            SymbolTable glob = tableMap.get("GLOBAL");
            readNode.dataType = glob.table.get(ctx.id_list().id().IDENTIFIER().getText()).getType();
            readNode.data = glob.table.get(ctx.id_list().id().IDENTIFIER().getText()).getName();
        }
        if (ctx.id_list().id_tail().children!=null) {
            recursiveWriteHandler(ctx.id_list().id_tail(), readNode);
        }
    }
}
