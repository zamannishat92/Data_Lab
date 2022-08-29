package Assignment_1_DataLab;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Problem_6 {
    public static void bubbleSort(int[] arr,int m)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        try {
            PrintWriter out1 = new PrintWriter("out.txt");
            for (int i=0;i<500;i++){
                out1.println(arr[i]);
            }
            out1.close();

        }
        catch(FileNotFoundException e){
           e.printStackTrace();
    }
    }
    public static void main(String[] args) {
        try {
            File fi = new File("in.txt");
            PrintWriter out = new PrintWriter(fi);
            Random r = new Random();

            for(int i=0;i<500;i++) {
                out.println(r.nextInt(499)-249);
            }
            out.close();

            Scanner s = new Scanner(fi);
            int[] arr=new int[500];
            for(int i=0;i<500;i++){
                arr[i]=Integer.parseInt(s.next());
            }

            bubbleSort(arr,500);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
