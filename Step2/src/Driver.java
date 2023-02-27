import org.antlr.runtime.tree.*;
import org.antlr.v4.runtime.*;

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

        parser.removeErrorListeners();
        myListener listener = new myListener();
        parser.addErrorListener(listener);
        parser.program();

//        if (listener.getIsEmpty()){
//            System.out.println("no errors");
//        } else {
//            System.out.println("errors");
//        }
        File file = new File("output.txt");
        try {
            FileWriter writer = new FileWriter(file);

            if (listener.getIsEmpty()) {
                //System.out.println("no errors");
                writer.write("Accepted");
            } else {
                //System.out.println("Not accepted");
                writer.write("Not accepted");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("uh oh");
            e.printStackTrace();
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
           /* if (!stack.isEmpty()) {
                System.out.println("unacceptable");
            } else {
                System.out.println("acceptable");
            }*/
        }
        public boolean getIsEmpty(){
            if (this.stack.isEmpty()){
                return true;
            }
            return false;
        }
    }

}