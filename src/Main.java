public class Main{
    public static void main(String[] args){
        MyQueue myQueue=new MyQueue(10);
        System.out.println(myQueue.isQueueFull());
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        myQueue.displayQueue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.displayQueue();
        myQueue.enqueue(3);
        myQueue.displayQueue();

    }
}