package telusko.queue;

public class Queue {
    int queue[] = new int[8];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % queue.length;
            size = size + 1;
        }else
            System.out.println("Queue is Full !");
    }

public int deQueue(){
    int data = queue[front];
        if(!isEmpty()) {
            front = (front + 1) % queue.length;
            size = size - 1;
        }else
            System.out.println("Queue is empty !");
        return data;
}
    public void show(){
        System.out.print("Elements :");
        for(int i=0; i<size; i++){
            System.out.print(queue[(front+i)%queue.length]+" ");
        }
        System.out.println();
    }


    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size== 0;
    }

    public boolean isFull(){
        return getSize() == queue.length;
    }

}
