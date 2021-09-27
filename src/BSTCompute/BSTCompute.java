package BSTCompute;
/* Ability to create a BST and add node in the tree
* Compute the size of BST
 */
public class BSTCompute {
    public static void main(String args[]){
        System.out.println("welcome to BST");
        BSTStructure a = new BSTStructure();
        Node root = null;
        root =  a.insertNode(root,56);
        root = a.insertNode(root,30);
        root = a.insertNode(root,70);
        root = a.insertNode(root,22);
        root = a.insertNode(root,40);
        root = a.insertNode(root,60);
        root = a.insertNode(root,95);
        root = a.insertNode(root,11);
        root = a.insertNode(root,3);
        root = a.insertNode(root,16);
        root = a.insertNode(root,65);
        root = a.insertNode(root,63);
        root = a.insertNode(root,67);
        System.out.println(root.left.data+"right data"+root.right.data);
        System.out.println("size of the BST "+a.size(root));
        a.search(root,63);
        System.out.println("node 63 present "+a.search(root,63));
    }
}
