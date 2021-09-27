package BSTCompute;

public class BSTStructure <k extends Comparable<k>>{
    //create insertNode method to create a node
    public Node insertNode (Node node,int val){
        if(node == null){
            return createNode(val);
        }
        if(val < node.data){
           node.left = insertNode(node.left, val);   //recursive call of the insertNode method
       //    System.out.println(node.data);
        }
        else if(val > node.data){
            node.right = insertNode(node.right,val);   //recursive call of the insertNode method to inset the node
          //  System.out.println(node.data);
        }
        return node;
    }
    //create a node
    public Node createNode(int k) {
        Node node = new Node();
        node.data = k;
        node.left = null;
        node.right = null;
        return node;
    }
    /* computes number of nodes in tree */
   public int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
}
