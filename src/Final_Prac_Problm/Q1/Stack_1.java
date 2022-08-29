package Final_Prac_Problm.Q1;

import java.util.Scanner;

public class Stack_1 {
    private int[] stack;
    private int top;
    private int size;

    public  Stack_1(int size){
        this.size=size;
        this.top=-1;
        this.stack=new int[size];
    }

    public void setSize(int size) {
        this.size = size;
    }
    void push(){
        Scanner sc = new Scanner(System.in);
        if(!(top ==stack.length-1)){
            System.out.println("Enter the item-");
            int item=sc.nextInt();
            top++;
            stack[top]=item;
            push();
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            top--;
            pop();
        }
    }
    public void print(){
       if(top==-1){
           //System.out.println("empty");
           return;
       }
       else{
           System.out.println(stack[top]+" ");
           top--;
           print();
       }
    }
}
