package Final_Prac_Problm.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        int x=0;
        while (x==0){
            System.out.println("1.Create Tree.");
            System.out.println("2.Inorder.");

            System.out.println("Enter the choice-");
            int c=sc.nextInt();
            if(c==1){
                System.out.println("Enter the root data-");
                int data=sc.nextInt();
                tree.create_Tree(data);
            }else if(c==2){
                tree.inorder_Stack();
            }
            else if(c==3){
                tree.inorder_Loop();
            }
        }


    }
}
