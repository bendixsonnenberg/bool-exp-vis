class NodeTree {
   public static void main(String args[]){
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
    public Node(Operand nodeOp, Node input1, Node input2) throws Exception{
        type = nodeOp;
        //checking wether the operand allows for the count of inputs
        switch(type){
            case PLACEHOLDER:
                if(input1 != null || input2 != null)
                    throw new Exception("Wrong number of inputs.");
                break;
            case NOT:
                if(input1 == null || input2 != null)
                    throw new Exception("Wrong number of inputs.");
                break;
           default:
                if(input1 != null || input2 != null)
                    throw new Exception("Wrong number of inputs.");
                break;
        }
        this.input1 = input1;
        this.input2 = input2;
        if(type == Operand.PLACEHOLDER) name = "TODO";
    }
    
}
