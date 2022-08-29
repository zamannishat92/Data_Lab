package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for(int m=j;m<n;m++) {
                        arr[m] = arr[m + 1];
                    }
                    n--;
                    j--;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

}