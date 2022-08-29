package Assignment_1_DataLab;

import java.util.Scanner;

public class Problem_9 {
        public static void rec(int[] arr, int n) {
            int sum1 = 0;
            int sum2 = 0;
            int i=0;
            int j=1;
            int count = 0;
            for(int k=0;k<n;k++){
                while(i<j) {
                    sum1=sum1+arr[i];
                    i++;
                    count++;
                }
                for ( j = (i-1)+1; j < n; j++) {
                    sum2=sum2+arr[j];
                }
                j=i+1;
                if(sum1>sum2){
                    System.out.println(count);
                    break;
                }
                sum2=0;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the array size ::");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the array--");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            rec(arr,n);

        }

    }

