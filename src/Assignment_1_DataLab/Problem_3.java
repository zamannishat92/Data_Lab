package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[50];
        int arr2[] = new int[50];

        System.out.print("Enter the 1st array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the 2nd array size ::");
        int m=sc.nextInt();
        System.out.print("Enter the 1st array--");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Sorted The 1st Array--");
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(arr1[i]);

        }
        System.out.println("Enter The 2nd Array--");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Sorted The 2nd Array--");
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(arr2[i]>arr2[j]){
                    temp=arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("The Intersection Array--");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
