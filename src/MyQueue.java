public class MyQueue {
    int capacity,head,tail,size=0;
    public static int[] queueArr;
    MyQueue(int size){
        queueArr=new int[size];
    }
    public boolean isQueueFull(){
        return queueArr.length-1<=size;
    }
    public boolean isQueueEmpty(){
        return size==0;
    }
    public void enqueue(int item){
        if (isQueueFull()){
            return;
        }
        queueArr[size]=item;
        size+=1;
    }
    public void dequeue(){
        if (isQueueEmpty()){
            return;
        }
        for (int i=0;i<size;i++){
            queueArr[i]=queueArr[i+1];
        }
        size-=1;
    }
    public void displayQueue(){
        for (int i=0;i<size;i++){
            System.out.println(queueArr[i]);
        }
    }
}
