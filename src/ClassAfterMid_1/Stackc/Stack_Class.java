package ClassAfterMid_1.Stackc;

import java.util.Scanner;
public class Stack_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many item you want to  insert");
        int size=sc.nextInt();
        ClassAfterMid_1.Stackc.Stack st= new Stack(size);
        int x=0;
        while(x==0){
            System.out.println("========================");
            System.out.println("1.Push the element");
            System.out.println("2.Pop the element");
            System.out.println("3.Check full nor not");
            System.out.println("4.Check empty or not");
            System.out.println("5.Get the top element");
            System.out.println("6.Print the list");
            System.out.println("7.Exit");
            System.out.println("=========================");
            System.out.println("Enter your choice");
            int n=sc.nextInt();

            if(n==1){
                System.out.println("Enter the element.");
                int item=sc.nextInt();
                st.push(item);
            }else if(n==2){
                st.pop();
            }else if(n==3){
                st.isFull();
            }else if(n==4){
                st.isEmpty();
            }else if(n==5){
                st.top();
            }else if(n==6){
                st.print();
            }else if(n==7){
                x++;
            }else{
                System.out.println("Invalid choice");
            }
        }

    }
}

