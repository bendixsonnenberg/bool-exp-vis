class NodeTree {
    /*
     * first we will have to remove all space, because they
     * will only get in the way.
     */
    public static void main(String args[]){
    } 
    static Node evaluate_right(String exp){
        /* will evaluate an expression to the right of an opperand
         * example:
         * x && (y || z) && a && b
         * this function would get the string "(y || z) && a && b"
         * and return the node that combines y and z with OR
         * right because it is on the RIGHT sie of the first AND
         * and therefore has to start evaluating from the left
         */
    }
    static Node evaluate_left(String exp){
        // anlog to evaluate_right, just on the other side of the expression.
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
