public class AST {
    ASTnode root;
    SymbolTable table;
    ASTnode currentRoot; // uppermost assignment node, or operator
    int register; // use to keep track of which register to use next
    int tempRegister;

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
        }
    }
    private void mulInsert(ASTnode mulNode, String data) {
        System.out.println("in mulnode, node.type: " + mulNode.type);
        mulNode.data = data;

        if (data.equals("*")) mulNode.type = "mul";
        else mulNode.type = "div";

        if (this.root == this.currentRoot) {
            mulNode.parent = this.currentRoot;
            mulNode.lChild = this.currentRoot.rChild;
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
    public static void treePrint(ASTnode head) {
        if (head.lChild != null){
            treePrint(head.lChild);
        }
        if (head.rChild != null) {
            treePrint(head.rChild);
        }
        head.printNode();
    }
}
