package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%3==0){
                arr[i]=-1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
