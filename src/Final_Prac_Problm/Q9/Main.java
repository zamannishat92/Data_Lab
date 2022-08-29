package Final_Prac_Problm.Q9;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Binary_Search_Tree b = new Binary_Search_Tree();
        int x=0;
        while (x == 0) {
            System.out.println("====================");
            System.out.println("1.Insert Value in TREE.");
            System.out.println("2.Print TREE.");
            System.out.println("3.Tree Search.");
            System.out.println("4.Delete.");
            System.out.println("5.Tree Suesssor.");
            System.out.println("6.Tree minimum.");
            System.out.println("=====================");

            System.out.println("Enter the choice-");
            int x1=sc.nextInt();
            if(x1==1){
                System.out.println("Enter the Value-");
                int value=sc.nextInt();
                b.insert(value);
            }
            else if(x1==2){
                b.print_Tree(b.root);
            }
            else if(x1==3){
                System.out.println("Enter the Value-");
                int value=sc.nextInt();
                b.search(value);
            }else if(x1==4){
                System.out.println("Enter the Value-");
                int value=sc.nextInt();
                b.delete(value);
            }else if(x1==5){
               // b.getSuccessor()
            }

        }
    }
}
