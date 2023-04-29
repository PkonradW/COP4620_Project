import java.util.ArrayList;
import java.util.StringJoiner;

public class CodeObject {
    // static counter for register vaules
    private static int registrar = 0;
    public String result;
    ArrayList<String> codeList; // all from left, followed by all from right
    String type; // type of result: int, float, string

    public CodeObject(ASTnode node) { // should only take operators and write/reads
        this.type = node.dataType;
        switch (node.type) {
            case "add": {
                if (this.type.equals("FLOAT")) {
                    makeAddfNode(this, node);
                } else {
                    makeAddiNode(this, node);
                }
                break;
            }
            case "sub" : {
                if (this.type.equals("FLOAT")) {
                    makeSubfNode(this, node);
                } else {
                    makeSubiNode(this, node);
                }
                break;
            }
            case "mul": {
                if (this.type.equals("FLOAT")) {
                    makeMulfNode(this, node);
                } else {
                    makeMuliNode(this, node);
                }
                break;
            }
            case "div": {
                if (this.type.equals("FLOAT")) {
                    makeDivfNode(this, node);
                } else {
                    makeDiviNode(this, node);
                }
                break;
            }
            case "assignment": {
                if (this.type.equals("FLOAT")) {
                    makeStorfNode(this, node);
                } else {
                    makeStoriNode(this, node);
                }
                break;
            }
            case "readlist" : {
                dealWithReadList(this, node);
                break;
            }
            case "writelist" :{
                dealWithWriteList(this, node);
            }

        }
    }
    private static void dealWithReadList(CodeObject obj, ASTnode readlist) {
        // result is gonna be a giant string with a bunch of newlines
        StringJoiner stj = new StringJoiner("\n");
        for (ASTnode result: readlist.list) {
            switch(result.dataType) {
                case "INT": {
                    stj.add("READI " + result.data);
                    break;
                }
                case "FLOAT": {
                    stj.add("READF " + result.data);
                }
            }
        }
        obj.result = stj.toString();
    }
    private static void dealWithWriteList(CodeObject obj, ASTnode writelist) {
        // result is gonna be a giant string with a bunch of newlines
        StringJoiner stj = new StringJoiner("\n");
        for (ASTnode op: writelist.list) {
            switch(op.dataType) {
                case "INT": {
                    String rest = "WRITEI " + op.data;
                    stj.add(rest);
                    break;
                }
                case "FLOAT": {
                    String rest = "WRITEF " + op.data;
                    stj.add(rest);
                    break;
                }
                case "STRING": {
                    stj.add("WRITES " + op.data);
                }
            }
        }
        obj.result = stj.toString();
    }
    private static void makeStoriNode(CodeObject obj, ASTnode node) {
        String resultVar = node.lChild.data;
        String operand = new String(); // this might look dumb, but that's because it is
        if (node.rChild.resultVar != null) {
            operand = node.rChild.resultVar;
        } else {
            operand = node.rChild.data;
        }
        node.resultVar = resultVar;
        obj.result = "STORI " + operand + " " + resultVar;
    }
    private static void makeStorfNode(CodeObject obj, ASTnode node) {
        String resultVar = node.lChild.data;
        String operand = new String(); // this might look dumb, but that's because it is
        if (node.rChild.resultVar != null) {
            operand = node.rChild.resultVar;
        } else {
            operand = node.rChild.data;
        }
        node.resultVar = resultVar;
        obj.result = "STORF " + operand + " " + resultVar;
    }
    private static void makeAddfNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "ADDF " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeAddiNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "ADDI " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeSubfNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "SUBF " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeSubiNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "SUBI " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeMulfNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "MULF " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeMuliNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "MULI " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeDivfNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "DIVF " + lCode + " " + rCode + " " + resultField;
    }
    private static void makeDiviNode(CodeObject obj, ASTnode node) {
        String lCode = node.lChild.data;
        String rCode = node.rChild.data;
        String resultField = getResultReg();
        node.resultVar = resultField;
        obj.result = "DIVI " + lCode + " " + rCode + " " + resultField;
    }
    private static String getResultReg(){
        return ("$T" + registrar++);
    }


}
