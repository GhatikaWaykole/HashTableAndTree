package BSTCompute;

public class BSTCompute {
    public static void main(String args[]){
        System.out.println("welcome to BST");
        BSTStructure a = new BSTStructure();
        Node root = null;
        root =  a.insertNode(root,56);
        System.out.println(root.data);
        root = a.insertNode(root,30);
   //   System.out.println(root.left.data);
        root = a.insertNode(root,70);

    }
}
