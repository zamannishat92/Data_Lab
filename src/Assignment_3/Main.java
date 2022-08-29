package Assignment_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input-");
        String input = sc.next();
        String[] arr = new String[input.length()];
        for(int i=0;i<input.length();i++){
            arr[i] = input.substring(i,i+1);
        }
         Balanced_Bracket st=new Balanced_Bracket(arr.length);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="("||arr[i]=="{"||arr[i]=="[") {
                st.push(arr[i]);
            }else{
                st.check_Bracket(arr[i]);
            }
        }
        st.print();
        /*int x = 0;
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
                for(int i=0;i<arr.length;i++){
                    st.push(arr[i]);
                }

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
        }*/

    }
    }
