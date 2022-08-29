package Class_1_Array;

import java.io.PrintStream;
import java.util.Scanner;

public class Main<a> {
    // private static int Null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.print("Enter the array size ::");
        int n = sc.nextInt();
        System.out.print("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int x = 0;
        while (x != 1) {
            if (x == 0) {
                System.out.println("*******************");
                System.out.println("1.Insert First");
                System.out.println("2.Insert middle");
                System.out.println("3.Insert last");
                System.out.println("4.Delete First");
                System.out.println("5.Delete middle");
                System.out.println("6.Delete last");
                System.out.println("**********************");
            }
            System.out.println("Enter the number where you can insert/delete--");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("Enter the value--");
                int value = sc.nextInt();
                Insert_First first = new Insert_First(arr,value,n);
                first.insert(arr,value,n);
                first.print();
                /*int temp = 0;
                temp = arr[0];
                arr[0] = value;
                for (int j = n - 1; j >= 1; j--) {

                    arr[j + 1] = arr[j];
                }
                arr[1] = temp;
                n++;

                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }*/
            }
            if (a == 2) {
                //System.out.print("Enter the number after which you can insert--");
                //int item = sc.nextInt();
                System.out.print("Enter the value--");
                int value = sc.nextInt();
                Insert_Middle middle = new Insert_Middle(arr,value,n);
                middle.insert(arr,value,n);
                middle.print();
                /*int position = 0, temp = 0;
                for (int i = 0; i < n; i++) {
                    if (value> arr[i]) {
                        position = i + 1;
                        System.out.println("Position-" + position);
                    }
                }
                //int n1 = n+1;
                for (int j = n - 1; j >= position; j--) {

                    arr[j + 1] = arr[j];
                }
                arr[position] = value;
                n++;

                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }*/
            }
            if (a == 3) {
                System.out.print("Enter the value--");
                int value = sc.nextInt();
                n++;
                arr[n - 1] = value;
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
            }
            if (a == 4) {
                n--;
                for (int i = 0; i < n; i++) {
                    arr[i] = arr[i + 1];
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
            }
            if (a == 5) {
                System.out.print("Enter the number which you can delete--");
                int item = sc.nextInt();
                int position = 0;
                n--;
                for (int i = 0; i < n; i++) {
                    if (item == arr[i]) {
                        position = i;
                        System.out.println("Position-" + position);
                        for (int j = position; j < n; j++) {
                            arr[j] = arr[j + 1];
                        }
                    }

                }
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);

                }
            }
            if (a == 6) {
                arr[n - 1] = 0;
                n--;
                
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }


            }
        }
    }

}