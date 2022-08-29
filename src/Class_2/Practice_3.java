package Class_2;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the item ::");
        int item = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Linear search Algorithm
        int flag=0 ;
        for(int i=0;i<n;i++) {
            if (item == arr[i]) {
                flag=1;

            }
        }
        if(flag==1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}