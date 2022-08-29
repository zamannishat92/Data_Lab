package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.println("Enter the kth size--");
        int k = sc.nextInt();

        System.out.print("Enter the  array--");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted The Array--");
        int temp;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("The k th smallest element--");
        System.out.println(arr[k]);
    }
}
