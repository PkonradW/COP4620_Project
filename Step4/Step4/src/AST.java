import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AST {
    ASTnode root;
    SymbolTable table;
    ASTnode currentRoot; // uppermost assignment node, or operator
    int register; // use to keep track of which register to use next
    int tempRegister;
    static ArrayList<String> codelist = new ArrayList<>();

    public AST(ASTnode root, SymbolTable table) {
        this.root = root;
        this.table = table;
        this.register = 0;
        this.tempRegister = 0;
        this.currentRoot = root;
    }
    public void insert(ASTnode node, String data) {
        switch(node.type) {
            case "float":
                floatInsert(node,data);
                break;
            case "int":
                intInsert(node,data);
                break;
            case "addop":
                addInsert(node, data);
                break;
                //
            case "id":
                idInsert(node, data);
                break;
            case "mulop":
                mulInsert(node, data);
                break;
        }
    }
    public void addInsert(ASTnode addNode, String data) {
        addNode.data = data;

        if (data.equals("+")) addNode.type = "add";
        else addNode.type = "sub";

        if (this.root == this.currentRoot
                || this.currentRoot.type.equals("add")
                || this.currentRoot.type.equals("sub")
        ) { // if root is still assignment
            addNode.parent = this.currentRoot; // hook up addnode
            addNode.lChild = this.currentRoot.rChild;
            this.currentRoot.rChild.parent = addNode; //put terminal on addnode
            this.currentRoot.rChild = addNode;
            this.currentRoot = addNode;
            addNode.dataType = addNode.lChild.dataType;
        }
    }
    private void mulInsert(ASTnode mulNode, String data) {
        mulNode.data = data;

        if (data.equals("*")) mulNode.type = "mul";
        else mulNode.type = "div";

        if (this.root == this.currentRoot
                || this.currentRoot.type.equals("mul")
                || this.currentRoot.type.equals("div")) {
            mulNode.parent = this.currentRoot;
            mulNode.lChild = this.currentRoot.rChild;
            this.currentRoot.rChild.parent = mulNode;
            this.currentRoot.rChild = mulNode;
            this.currentRoot = mulNode;
            mulNode.dataType = mulNode.lChild.dataType;
        }
    }
    // data is the variable name
    public void idInsert(ASTnode idNode, String data) {
        idNode.data = data;
        if (this.currentRoot.lChild == null) {
            this.currentRoot.lChild = idNode;
        } else {
            this.currentRoot.rChild = idNode;
        }
    }
    private void floatInsert(ASTnode floatNode, String floatAsString) {
        floatNode.data = floatAsString;
        if (this.currentRoot.lChild == null) {
            this.currentRoot.lChild = floatNode;
        } else {
            this.currentRoot.rChild = floatNode;
        }
    }
    private void intInsert(ASTnode intNode, String intString) {
        intNode.data = intString;
        intNode.intVal = Integer.parseInt(intString);
        if (this.currentRoot.lChild == null) {
            this.currentRoot.lChild = intNode;
        } else {
            this.currentRoot.rChild = intNode;
        }
    }
//    public static void treePrint(ASTnode head) {
//        if (head.lChild != null){
//            treePrint(head.lChild);
//        }
//        if (head.rChild != null) {
//            treePrint(head.rChild);
//        }
//        head.printNode();
//    }
    public static void lolPrint() {
        for (String code :
                codelist) {
            System.out.println(code);
        }
    }
public static void irPrint(ASTnode head) {
    try {
        FileWriter fileWriter = new FileWriter("testicle.out", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        if (head.lChild != null) {
            irPrint(head.lChild);
        }
        if (head.rChild != null) {
            irPrint(head.rChild);
        }
        String type = head.type;
        if (type.equals("assignment")
                || type.equals("writelist")
                || type.equals("readlist")
                || type.equals("add")
                || type.equals("sub")
                || type.equals("div")
                || type.equals("mul")) {
            CodeObject obj = new CodeObject(head);
            String codeBlock = obj.result;
            Scanner scan = new Scanner(codeBlock);
            while (scan.hasNextLine()) {
                String singleLine = scan.nextLine();
                codelist.add(singleLine);
                printWriter.println(singleLine);
            }
            //printWriter.println(obj.result);
        }
        printWriter.close();
        fileWriter.close();
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}

}
