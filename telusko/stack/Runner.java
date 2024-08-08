package telusko.stack;

public class Runner {

    public static void main(String[] args) {
        Stack num = new Stack();

        System.out.println("current size is = "+num.size());
        System.out.println("stack is empty = "+num.isEmpty());
        num.push(8);
        num.push(2);
        num.push(6);
        num.push(4);
        num.push(9);

        num.show();
        System.out.println("current size is = "+num.size());
        System.out.println();

        System.out.println(num.pop());
        num.show();
        System.out.println(num.peek());
        System.out.println("current size is = "+num.size());
        System.out.println("stack is empty = "+num.isEmpty());
        num.show();
    }
}
