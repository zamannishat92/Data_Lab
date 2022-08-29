package ClassAfterMid_1.Queuep;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    public Queue(int size){
        this.size=size;
        this.front=0;
        this.rear=0;
        this.queue=new int[size+1];
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void enqueue(int item){
        int s = (rear+1)%(size+1);
        if(s==front){
            System.out.println("Full Queue!");
        }
        rear=s;
        queue[rear]=item;

    }
    public void dequeue(){
        if(front==rear){
            System.out.println("Empty Queue!");
        }
        front=(front+1)%(size+1);
        queue[front]= Integer.parseInt(null);
    }
    public void print(){
        for (int i =1; i <= rear; i++) {
            System.out.println(queue[i]+" ");
        }
    }
    boolean is_Empty(){
        if(front==rear){
            return true;
        }
        return false;
    }
    public void is_Full(){

    }
}
