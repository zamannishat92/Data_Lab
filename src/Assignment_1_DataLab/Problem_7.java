package Assignment_1_DataLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Problem_7 {
    public static void replacement_Sort(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<1000;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        try {
            File fi = new File("in1.txt");
            PrintWriter out = new PrintWriter(fi);
            Random r = new Random();
            for(int i=0;i<1000;i++) {
               out.println((char)(r.nextInt(26) + 'A'));
            }
            out.close();
            Scanner s = new Scanner(fi);
            String[] arr=new String[1000];
            for(int i=0;i<1000;i++){
                arr[i]=  s.next();
            }

            replacement_Sort(arr);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
