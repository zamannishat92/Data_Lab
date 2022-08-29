package Class_2;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp,j;
        /*for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }*/
        //insertion sort
        for(int i=1;i<n;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}