package Final_Prac_Problm.Q2;

import Final_Prac_Problm.Q1.Stack_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many item you want to  insert");
        int size=sc.nextInt();
        Stack_2 stack = new Stack_2(size);
        int x=0;
        while (x==0) {
            System.out.println("Enter the choice-");
            int c = sc.nextInt();
            if (c == 1) {
                stack.push();
            } else if (c == 2) {
                stack.sort_stack();
            } else if (c == 3) {
                stack.print();
            }
        }
    }
}


