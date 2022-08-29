package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_10 {
        public static void min(int[] arr,int n){
            int[] result =new int[n-1];
            for(int i=0;i<n-1;i++){
                result[i]=arr[i]-arr[i+1];
            }
            int s=result[0];
            for(int i=0;i<result.length;i++){
                if(result[i]<s){
                    s=result[i];
                }
            }
            for (int i = 0; i < result.length; i++) {
                if(result[i]==s){
                    System.out.println(arr[i+1]+" "+arr[i]);
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the array size ::");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the array--");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int temp;
            //Bubble-Sort
            for (int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]<arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            min(arr,n);
        }
    }

