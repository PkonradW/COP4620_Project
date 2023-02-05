import org.antlr.v4.runtime.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("deprecation") ANTLRInputStream input = new ANTLRInputStream(System.in);
        LittleLexer lexer = new LittleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
	
        for (int i = 0; i < tokens.getNumberOfOnChannelTokens(); i++){
            // correlates to the values in Little.tokens
            if (tokens.get(i).getType() >= 0) {
                System.out.println("Token Type: " + getName(tokens.get(i).getType()));
                System.out.println("Value: " + tokens.get(i).getText());
            }
        }
	
        /*
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
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       */ 
    }

    
    public static String getName(int tokenType) {
        switch (tokenType) {
            case 1: return "KEYWORD";
            case 2: return "OPERATOR";
            case 3: return "IDENTIFIER";
            case 4: return "INTLITERAL";
            case 5: return "FLOATLITERAL";
            case 6: return "STRINGLITERAL";
            case 7: return "COMMENT";
            case 8: return "WHITESPACE";
            default: return "something went wrong";
        }
    }
}
