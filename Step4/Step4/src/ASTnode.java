/**
 * either l side, literal, operator (mul or add)
 */
public class ASTnode {
    public String type;
    public String data; //
    Symbol id = null;
    ASTnode parent = null;
    ASTnode lChild = null;
    ASTnode rChild = null;
    boolean isPrimary;
    public int intVal;

    /**
     *  float and int types are literals
     * @param type id, addop, mulop, assignment, float, int, add, sub, mul, div
     */
    public ASTnode(String type) {
        this.type = type;
    }
    public void printNode() {
        System.out.println("Type: " + this.type);
        System.out.println("Data: " + this.data);
        if (this.id != null) System.out.println("id: " + id.getName());
        System.out.println();
    }
}
