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
            if (tokens.get(i).getType() >= 0) {
                System.out.println("Token Type: " + getName(tokens.get(i).getType()));
                System.out.println("Value: " + tokens.get(i).getText());
            }
            // System.out.println(tokens.get(i).getText() + ":" + getName(tokens.get(i).getType()) + " ");
        }
    }
    public static String getName(int tokenType) {
        switch (tokenType){
            case 4: return "IDENTIFIER";
            case 5: return "INTLITERAL";
            case 6: return "FLOATLITERAL";
            case 7: return "STRINGLITERAL";
            case 8: return "COMMENT";
            case 1: return "KEYWORD";
            case 2: return "OP";
            case 3: return "WS";
        }
        return "something went wrong";
    }
}
