package Class_2;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ini;
        //Replacement Sort
        //Ascending Order-choto thk boro
        //decending Order-boro thk Choto
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    ini = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ini;
                    //System.out.println(arr[i]);
                    //i++;
                }

            }
        }
            for ( int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }

        }
    }
