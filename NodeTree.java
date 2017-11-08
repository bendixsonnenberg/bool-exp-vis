class NodeTree {
   public static void main(String args[]){
        Node a = new Node(null,null,null);
   } 
}
class Node{
    /*
     * This class models a node in the tree that has to be created
     * we could add some extra types for example operands for numbers, but
     * for now i won't bother
     * */
    static enum Operand {PLACEHOLDER,BITWISE_AND,BITWISE_XOR,BITWISE_OR,NOT,AND,OR};
    Operand type;
    Node input1,input2;
    String name;
    public Node(Operand nodeOp, Node input1, Node input2){
        type = nodeOp;
        this.input1 = input1;
        this.input2 = input2;
        if(type == Operand.PLACEHOLDER) name = "TODO";
    }
    
}
