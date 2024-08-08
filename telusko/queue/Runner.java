package telusko.queue;

public class Runner {

    public static void main(String[] args) {


        Queue queue = new Queue();
        queue.enQueue(4);
        queue.enQueue(8);
        queue.enQueue(23);
        queue.enQueue(34);
        queue.enQueue(21);
        queue.enQueue(815);
        queue.enQueue(90);
        queue.enQueue(100);
        queue.show();
        queue.deQueue();
        queue.show();
    }
}
