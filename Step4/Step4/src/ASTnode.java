import java.util.ArrayList;

/**
 * either l side, literal, operator (mul or add)
 */
public class ASTnode {
    public String type;
    public String dataType;
    public String data;
    public ArrayList<ASTnode> list; // can be writelist or readlist
    public String resultVar; // result field of 3AC
    Symbol id = null;
    ASTnode parent = null;
    ASTnode lChild = null;
    ASTnode rChild = null;
    boolean isPrimary;
    public int intVal;

    /**
     *  float and int types are literals
     * @param type id, addop, mulop, assignment, float, int, add, sub, mul, div
     *             also writelist, readlist
     */
    public ASTnode(String type) {
        this.type = type;
    }
    public void printNode() {
        System.out.println("Type: " + this.type);
        System.out.println("Data: " + this.data);
        System.out.println("DataType: " + this.dataType);
        if (this.id != null) System.out.println("id: " + id.getName());
        System.out.println();
        if (this.list != null) {
            for (ASTnode node: this.list) {
                if (node != this){
                    node.printNode();
                } //end if
            } // end for
        } // end if
    } // end printNode
    /*public void getIrCode() {
        switch (this.type) {
            case "id", "float", "int": {
                this.irCode = this.data;
                break;
            }
            case "add": {
                String lCode = this.lChild.irCode;
                String rCode = this.rChild.irCode;

            }
        }
    }*/
}
