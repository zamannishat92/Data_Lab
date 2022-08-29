package Final.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String input-");
        String input=sc.next();
        Stack stack=new Stack(input.length());
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=65 && input.charAt(i)<90 ||input.charAt(i)>=97 && input.charAt(i)<122){
                stack.push(input.charAt(i));
            }
            else{
                if(input.charAt(i)>=48 &&input.charAt(i)<=57 ){
                    stack.pop();
                }
            }

        }
    }
}
