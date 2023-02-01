import org.antlr.v4.runtime.*;
import java.io.FileWriter;
import java.io.File;
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
        //System.out.println(tokens.getNumberOfOnChannelTokens());
        File file = new File("output.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < tokens.getNumberOfOnChannelTokens(); i++){
                // correlates to the values in Little.tokens
                if (tokens.get(i).getType() >= 0) {
                    System.out.println("Token Type: " + getName(tokens.get(i).getType()));
                    System.out.println("Value: " + tokens.get(i).getText());
                    writer.write("Token Type: " + getName(tokens.get(i).getType()) + "\n");
                    writer.write("Value: " + tokens.get(i).getText() + "\n");
                }
                // System.out.println(tokens.get(i).getText() + ":" + getName(tokens.get(i).getType()) + " ");
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public static String getName(int tokenType) {
        return switch (tokenType) {
            case 1 -> "KEYWORD";
            case 2 -> "OPERATOR";
            case 3 -> "IDENTIFIER";
            case 4 -> "INTLITERAL";
            case 5 -> "FLOATLITERAL";
            case 6 -> "STRINGLITERAL";
            case 7 -> "COMMENT";
            case 8 -> "WHITESPACE";
            default -> "something went wrong";
        };
    }
}
