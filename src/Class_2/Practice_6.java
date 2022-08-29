package Class_2;

import java.util.Scanner;

public class Practice_6 {
    public static int binarySearch(int[] a,int flag,int l,int h,int key){
        if(l>h){return 0;
        }
        else {
            int mid = (l + h) / 2;
            if (key != a[mid]) {
                if (key > a[mid]) {
                    return binarySearch(a, flag++, mid + 1, h, key);
                } else {
                    return binarySearch(a, flag++, l, mid - 1, key);
                }
            } else {
                return 1;

            }
        }
    }
    public static void sort(int[] a, int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
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
        sort(a,n);
        int m=binarySearch(a,flag,l,h,key);

        if(m>0){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}


