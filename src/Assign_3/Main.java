package Assign_3;

import Assignment_3.Balanced_Bracket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input-");
        String input = sc.next();
        String[] arr = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.substring(i, i + 1);
        }
        Stack st = new Stack(arr.length);
        st.check_Bracket(arr);
    }
}
