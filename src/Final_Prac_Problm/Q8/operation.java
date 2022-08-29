package Final_Prac_Problm.Q8;

public class operation {
    private final int[] stack;
    private int top;
    private final int size=8;

    public operation(){
        this.top=-1;
        this.stack=new int[size];
    }

    public void push(int item){
        if(top!=stack.length-1){
            top++;
            stack[top]=item;
        }else{
            System.out.println("Stack or Queue over-follow");
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
            top--;
        }
    }
    public void dequeue(){
        if(top==-1){
            System.out.println("Queue underflow");
        }else{
            for (int i = 0; i <= top; i++) {
                stack[i]=stack[i+1];
            }
            top--;
        }
    }
    public void print(){
        if(top==-1){
            System.out.println("System memory is empty");
        }else{
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}
