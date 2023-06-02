import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class IRtoTiny {
    static int register = 0;
    static int savedReg;
    public static ArrayList<String> tinyList = new ArrayList<>(); // final product


    public static void process(ArrayList<String> codeList) {

        for (String line : codeList) {
            String[] splitLine = line.split(" ");
            if (splitLine.length == 4) { // is an operation
                operationHandler(splitLine);
            } else if (splitLine.length == 3) { // is a store
                if (splitLine[1].matches("\\$T[0-9]*")) {
                    tinyList.add("move r"  + savedReg + " " + splitLine[2]);
                } else {
                    tinyList.add("move " + splitLine[1] + " " + splitLine[2]);
                }
            } else if (splitLine.length == 2) { // is a read or write
                readWriteHandler(splitLine);
            }
        }
    } // end process
    private static void readWriteHandler(String[] codeLine) {
        String operator = codeLine[0];
        String operand = codeLine[1];

        switch (operator) {
            case "READI":
                tinyList.add("sys readi " + operand);
                break;
            case "READF":
                tinyList.add("sys readr " + operand);
                break;
            case "WRITEI":
                tinyList.add("sys writei " + operand);
                break;
            case "WRITEF":
                tinyList.add("sys writer " + operand);
                break;
            case "WRITES":
                tinyList.add("sys writes " + operand);
        }
    }

    /*
    operation[0] = operator
    operation[1] = OP1
    operation[2] = OP2
    operation[3] = RESULT
     */
    private static void operationHandler(String[] operation) {
        savedReg = register++;

        String opcode = operation[0];
        String arg1 = operation[1];
        String arg2 = operation[2];
        tinyList.add("move " + arg1 + " r" + savedReg);
        // SUBI x y $T0
        // STOREI $T0 z
        // move x r0
        // sub y r0
        switch (opcode) {
            case "ADDI":
                tinyList.add("addi " + arg2 + " r" + savedReg);
                break;
            case "ADDF":
                tinyList.add("addr " + arg2 + " r" + savedReg);
                break;
            case "SUBI":
                tinyList.add("subi " + arg2 + " r" + savedReg);
                break;
            case "SUBF":
                tinyList.add("subr " + arg2 + " r" + savedReg);
                break;
            case "MULI":
                tinyList.add("muli " + arg2 + " r" + savedReg);
                break;
            case "MULF":
                tinyList.add("mulr " + arg2 + " r" + savedReg);
                break;
            case "DIVI":
                tinyList.add("divi " + arg2 + " r" + savedReg);
                break;
            case "DIVF":
                tinyList.add("divr " + arg2 + " r" + savedReg);
                break;
            default:
                tinyList.add(";code's broken");
        }
    }
    public static void symbolDump(ArrayList<SymbolTable> allTehSymbols) {
        for (SymbolTable table : allTehSymbols) {
            Symbol symbol;
            Set symbolSet = table.table.entrySet();
            Iterator i = symbolSet.iterator();
            while (i.hasNext()) {
                Map.Entry entry = (Map.Entry) i.next();
                String key = (String) entry.getKey();
                symbol = table.table.get(key);
                if (symbol != null) {
                    if (symbol.getValue() != null) {
                        tinyList.add("str " + symbol.getName() + " " + symbol.getValue());
                    } else {
                        tinyList.add("var " + symbol.getName());
                    }
                }
            }
        }
    }
    public static void makeTinyFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("group23.out"));
            for (String str : tinyList) {
                writer.println(str);
            }
            writer.println("sys halt");
            writer.close();
            //System.out.println("Successfully wrote list to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the list to file: " + e.getMessage());
        }
    }
}