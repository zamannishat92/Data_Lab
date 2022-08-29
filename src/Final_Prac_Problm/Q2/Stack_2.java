package Final_Prac_Problm.Q2;

import java.util.Scanner;

public class Stack_2 {
    private int[] stack;
    private int[] sort_stack;
    private int top;
    private int top1;
    private int min;
    private int size;

    public  Stack_2(int size){
        this.size=size;
        this.top=-1;
        this.top1=-1;
        this.min=999999999;
        this.stack=new int[size];
        this.sort_stack=new int[size];
    }

    public void setSize(int size) {
        this.size = size;
    }
    int find_min(){
        //int i=0;
        if(stack[top]<min){
            min=stack[top];
            top--;
            find_min();
        }
        return min;

    }
    void sort_stack(){
        if(top1==sort_stack.length-1){
            System.out.println("Stack is sorted!");
        }else{
            int x=find_min();
            top1++;
            sort_stack[top1]=x;
            sort_stack();
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            top--;
            //pop();
        }
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
    public void print(){
        for (int i = 0; i <= top1; i++) {
            System.out.println(sort_stack[i]+" ");
        }
    }
}
