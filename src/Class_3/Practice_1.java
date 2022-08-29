package Class_3;

import java.util.Scanner;

public class Practice_1 {
    public static void rec(int[] a,int flag,int l,int h,int key){
        while(l<=h){
            int mid = (l+h)/2;


        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a= new int[50];
        System.out.println("Enter the array size--");
        int n=sc.nextInt();
        System.out.println("Enter the key--");
        int key=sc.nextInt();
        int l=0,flag=0;
        int h=n-1;
        System.out.println("Enter the array--");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rec(a,flag,l,h,key);
        /*if(m>0){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }*/
    }
}
