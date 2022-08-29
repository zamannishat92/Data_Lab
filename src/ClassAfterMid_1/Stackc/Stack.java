package ClassAfterMid_1.Stackc;

import java.util.Scanner;
public class Stack {
    private int[] stack;
    private int top;
    private int size;

    public  Stack(int size){
        this.size=size;
        this.top=-1;
        this.stack=new int[size];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(int item){
        System.out.println(top);
        if(top!=stack.length-1){
            top++;
            System.out.println(top);
            stack[top]=item;
            System.out.println("Pushed successfully");
        }else{
            System.out.println("Stack over-follow");
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
            System.out.println(stack[i]+" ");
        }
    }
    public void top(){
        System.out.println(stack[top]);
    }
}

