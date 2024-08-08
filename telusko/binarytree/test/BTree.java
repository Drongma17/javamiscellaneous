package telusko.binarytree.test;

public class BTree {

    Node root;
    public void insertNode(int data){
        root = insertRec(root, data);
    }


    public Node insertRec(Node node, int data){
        if(node == null)
            node = new Node(data);
        else if(data < node.data)
            node.left = insertRec(node.left, data);
        else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }
        return node;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }


    public static void main(String[] args) {
        BTree bTree = new BTree();
        bTree.insertNode(10);
        bTree.insertNode(3);
        bTree.insertNode(5);
        bTree.insertNode(17);
        bTree.insertNode(8);
        bTree.insertNode(9);
        bTree.insertNode(11);

        bTree.inorder();




    }
}
