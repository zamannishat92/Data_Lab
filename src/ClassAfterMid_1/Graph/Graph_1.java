package ClassAfterMid_1.Graph;

import java.util.Scanner;

public class Graph_1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char[] vertex=new char[26];
        for(int i=0;i<26;i++){
            vertex[i]= (char) (65+i);
        }
        System.out.println("Enter the number of vertices-");
        int vertices=sc.nextInt();
        int[][] array=new int[vertices][vertices];
        for(int i=0;i<vertices;i++) {
            for (int j = 0; j < vertices; j++) {
                array[i][j] = 0;
            }
        }
        for(int i=0;i<vertices;i++) {
            for (int j = i+1; j < vertices; j++) {
                System.out.print(vertex[i]+"-"+vertex[j]+":");
                array[i][j] = sc.nextInt();
                if(array[i][j]==1){
                    array[j][i]=1;
                }
            }
        }
        /*print with adjacency matrix
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
        //print with adjacency list
        for(int i=0;i<vertices;i++){
            System.out.print(vertex[i]+"->");
            for(int j=0;j<vertices;j++){
                if(array[i][j]==1) {
                    System.out.print(vertex[j] + " ");
                }
            }
            System.out.println();
        }
        /*for(int i=0;i<26;i++){
            System.out.print(vertex[i]+" ");
        }*/
    }

}
