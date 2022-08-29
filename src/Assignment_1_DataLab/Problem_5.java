package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp ;
        if (n % 2 == 0) {
            for (int i = 0; i < n/2; i++) {
                    temp = arr[i];
                    arr[i] = arr[n-1-i];
                    arr[n-1-i] = temp;

                }

            }
        else{
            for (int i = 0; i < n/2; i++) {
                    int m = n / 2;
                    temp = arr[i];
                    arr[i] = arr[n - 1-i];
                    arr[n - 1-i] = temp;
                    arr[n / 2] = arr[m];
                }
        }


        for(int i= 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
