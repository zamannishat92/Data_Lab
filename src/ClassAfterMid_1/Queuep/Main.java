package ClassAfterMid_1.Queuep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many item you want to  insert");
        int size=sc.nextInt();
        Queue q= new Queue(size);
        int x=0;
        while (x==0){
            System.out.println("======================");
            System.out.println("1.Enqueue the elements.");
            System.out.println("2.Dequeue the elements.");
            System.out.println("3.Print the list.");
            System.out.println("=======================");
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Enter the element.");
                int item=sc.nextInt();
                q.enqueue(item);
            }else if(n==2) {
                q.dequeue();
            }
            else if(n==3){
                q.print();
            }
        }
    }
}
