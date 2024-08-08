package nickwhite;



public class PalindromeLinkedList {

    static Node head;

    // Function to check if the list is palindrome
    boolean isPalindromeUtil(Node left) {
        // Base case
        if (left == null) {
            return true;
        }

        // Recursively check if the sublist is palindrome
        boolean res = isPalindromeUtil(left.next);

        // If sublist is not palindrome, return false
        if (!res) {
            return false;
        }

        // Check if the data of left and right nodes are same
        if (left.data != head.data) {
            return false;
        }

        // Move head one node ahead
        head = head.next;

        return true;
    }

    boolean isPalindrome() {
        return isPalindromeUtil(head);
    }

    // Function to push a node at the beginning of the list
    void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);

        list.push(2);
        list.push(1);


        if (list.isPalindrome()) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}