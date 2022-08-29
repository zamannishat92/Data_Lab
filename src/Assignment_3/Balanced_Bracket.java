package Assignment_3;

public class Balanced_Bracket {
    private String[] stack;
    private int top;
    private int size;

    public Balanced_Bracket(int size){
        this.size=size;
        this.top=-1;
        this.stack=new String[size];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(String item){
       // System.out.println(top);
        if(top!=stack.length-1){
            top++;
            //System.out.println(top);
            stack[top]=item;
            System.out.println("Pushed successfully");
        }else{
            System.out.println("Stack over-follow");
        }
    }
    public void check_Bracket(String brac){
        int flag=0;
        if(top==-1){
            System.out.println("");
        }
        String pop = stack[top];
        top--;
        if(brac==")"&&pop!="(") {
            System.out.println("UnMatched");
            flag++;
        }else if(brac=="}"&&pop!="{"){
            System.out.println("UnMatched");
            flag++;
        }else if(brac=="]"&&pop!="["){
            System.out.println("UnMatched");
            flag++;
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
            top--;
            System.out.println("Poped successfully");
        }
    }

    public void isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack  is not empty");
        }
    }

    public void isFull(){
        if(top==stack.length-1){
            System.out.println("Stack is full");
        }else{
            System.out.println("Stack is not full");
        }
    }
    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+" ");
        }
    }
    public void top(){
        System.out.println(stack[top]);
    }
}
