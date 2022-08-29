package Final_Prac_Problm.Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you want to execute the program");
        int n=sc.nextInt();
        sc.nextLine();
        operation op=new operation();
        for (int i = 0; i < n; i++) {
            String input=sc.nextLine();
            String[] splits=input.split(" ");
            if(splits.length==2){
                if(splits[0].equals("P")||splits[0].equals("E")){
                    op.push(Integer.parseInt(splits[1]));
                }else{
                    System.out.println("Wrong input");
                }
            }else{
                if(splits[0].equals("D")){
                    op.dequeue();
                }else if(splits[0].equals("O")){
                    op.pop();
                }
            }
        }
        op.print();
    }
}
