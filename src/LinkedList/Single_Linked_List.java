package LinkedList;

import java.util.Scanner;

public class Single_Linked_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 45, i;

        while (x != 0) {
            System.out.println("\n==========Menu=======\n");
            System.out.println("1.Insert at First.\n");
            System.out.println("2.Insert at Last.\n");
            System.out.println("3.Delete First.\n");
            System.out.println("4.Delete Last.\n");
            System.out.println("5.Print List.\n");
            System.out.println("6.Search list.\n");
            System.out.println("7.Delete any number.\n");
            System.out.println("8.Insert after.\n");
            System.out.println("9.Insert at position.\n");
            System.out.println("10.delete at position.\n");
            System.out.println("0.Exit.\n");

            //scanf("%d", &x);
            int x1 = sc.nextInt();

            if (x1 == 1) {
                System.out.println("Enter your value.\n");
                int n = sc.nextInt();
                // insertFirst(n);

            }
        }
    }
}