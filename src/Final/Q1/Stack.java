package Final.Q1;

public class Stack {
    private char[] stack;
    private int top;
    private int size;

    public  Stack(int size){
        this.size=size;
        this.top=-1;
        this.stack=new char[size];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(char item){
        if(top!=stack.length-1){
            top++;
            stack[top]=item;
        }else{
            return;
        }
    }

    public void pop(){
        if(top==-1){
            return;
        }else{
            System.out.print(stack[top]+" ");
            top--;


        }
    }
}
