package ClassAfterMid_1.Stack_LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list=new LinkedList();
        int x=0;
        while(x==0){
            System.out.println("1.push.");
            System.out.println("2.pop.");
            System.out.println("3.print");
            System.out.println("4.Find Middle.");
            System.out.println("5.Delete Middle.");

            System.out.println("Enter your choice-");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter the value-");
                int value=sc.nextInt();
                Node newnode=new Node(value);
                list.push(newnode);
            }else if(choice==2){
                list.pop();
            }
            else if(choice==3){
                list.print();
            }
            else if(choice==4){
                list.find_Middle();
            }
            else if(choice==5){
                list.delete_Middle();
            }
        }
    }
}
