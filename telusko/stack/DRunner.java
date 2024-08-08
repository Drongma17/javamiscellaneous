package telusko.stack;

public class DRunner {

    public static void main(String[] args) {
        Dstack num = new Dstack();

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
        num.push(23);
        num.push(45);

       num.pop();
       num.pop();
       num.pop();
       num.pop();
        num.pop();


//        System.out.println(num.peek());
//        System.out.println("current size is = "+num.size());
//        System.out.println("stack is empty = "+num.isEmpty());
        num.show();
    }
}
