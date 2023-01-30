import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from standard input
        @SuppressWarnings("deprecation") ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        LittleLexer lexer = new LittleLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // LittleParser parser = new LittleParser(tokens);
        // ParseTree tree = parser.prog(); // begin parsing at prog rule
        // System.out.println(tree.toStringTree(parser));
        System.out.println(tokens.getNumberOfOnChannelTokens());
        for (int i = 0; i < tokens.getNumberOfOnChannelTokens(); i++){
            // correlates to the values in Little.tokens
            System.out.print(i + ":" + tokens.get(i).getType() + " ");
        }
    }
}
