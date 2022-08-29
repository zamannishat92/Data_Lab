package Final_Prac_Problm.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many item you want to  insert");
        int size=sc.nextInt();
        Stack_1 stack = new Stack_1(size);
        stack.push();
        stack.print();
        //stack.pop();
    }
}
