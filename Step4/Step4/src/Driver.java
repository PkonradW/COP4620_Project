import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;

public class Driver {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        LittleLexer lexer = new LittleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LittleParser parser = new LittleParser(tokens);
        parser.setBuildParseTree(true);

        parser.removeErrorListeners();
        myListener listener = new myListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker () ;
        SimpleTableBuilder stb = new SimpleTableBuilder ();
        //ASTbuilder atb = new ASTbuilder(stb.tableList);


        // Walk the tree created during the parse, trigger callbacks
        walker.walk(stb, tree);
        if (listener.getIsEmpty()){
            //System.out.println(stb.tableList.size());
            ASTbuilder atb = new ASTbuilder(stb.tableList);
            walker.walk(atb,tree);
            stb.prettyPrint();
            for (AST ast: ASTbuilder.astList) {
                AST.irPrint(ast.root);
            }
            for (String line :
                    AST.codelist) {
                System.out.println(";" + line);
            }
            IRtoTiny.symbolDump(stb.tableList);
            IRtoTiny.process(AST.codelist);
            IRtoTiny.makeTinyFile();
            for (String line :
                    IRtoTiny.tinyList) {
                System.out.println(line);
            }
            System.out.println("sys halt");
            //walker.walk(atb, tree);
        } else {
            System.out.println("uh oh" + listener.stack);

        }

    }
    public static class myListener extends BaseErrorListener {
        List<String> stack = new ArrayList<>();
        @Override

        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine, String msg,
                                RecognitionException e)
        {
            this.stack = ((Parser)recognizer).getRuleInvocationStack(); Collections.reverse(stack);
            //System.out.println("Error: " +line+":"+charPositionInLine);
//            if (!stack.isEmpty()) {
//                System.out.println("unacceptable");
//            } else {
//                System.out.println("acceptable");
//            }
        }
        public boolean getIsEmpty(){
            if (this.stack.isEmpty()){
                return true;
            }
            return false;
        }
    }

}