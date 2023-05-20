public class MyQueue {
    int capacity,head,tail,size=0;
    public static int[] queueArr;
    MyQueue(int size){
        capacity=size;
        queueArr=new int[capacity];
        tail=head=-1;
    }
    public boolean isQueueFull(){
        return capacity==size;
    }
    public boolean isQueueEmpty(){
        return capacity==0;
    }
    public void enqueue(int item){
        if (isQueueFull()){
            return;
        }
        tail++;
        if (tail == capacity - 1) {
            tail = 0;
        }
        queueArr[tail] = item;
        size+=1;
    }
    public void dequeue(){
        if (isQueueEmpty()){
            return;
        }
        head++;
        if (head == capacity - 1) {
            System.out.println("Pop operation done ! removed: " + queueArr[head]);
            head = 0;
        } else {
            System.out.println("Pop operation done ! removed: " + queueArr[head]);
        }
        size-=1;
    }
    public void displayQueue(){
        for (int i=0;i<size;i++){
            System.out.println(queueArr[i]);
        }
    }
}
