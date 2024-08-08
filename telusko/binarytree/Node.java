package telusko.binarytree;

public class Node {
    int data;
    Node left;
    Node right;

   public Node(int data){
       this.data = data;
       left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
