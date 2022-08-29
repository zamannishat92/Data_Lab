package Final.Q1.Q2;

import java.util.Scanner;

public class Main {
    public static int row,coloum;
    public static char[] visited_array = new char[100];
    public static int visited_sequence = -1;
    public static int f = 0, r = 0;
    public static int size;
    public static int[] q = new int[size + 1];
    public static char[] vertex = new char[26];
    public static String[][] array=new String[row][coloum];

    public static void visit(char ch) {
        visited_sequence++;
        visited_array[visited_sequence] = ch;
    }

    public static boolean is_visited(char ch) {
        for (int i = 0; i < visited_sequence; i++) {
            if (visited_array[i] == ch) {
                return true;
            }
        }
        return false;
    }

    public static void print_visit_array() {
        for (int i = 0; i <= visited_sequence; i++) {
            System.out.print(visited_array[i] + " ");
        }
    }

    public static void enqueue(char ch) {
        r = (r + 1) % (size + 1);
        q[r] = ch;
    }

    public static char dequeue() {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        f = (f + 1) % (size + 1);
        return (char) q[f];
    }
    public static void find_adjacency(char ch){
        Graph g = new Graph();
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                if(array[i][j]=="x"){

                }
            }
        }
    }

    public static void bfs() {
        enqueue(vertex[0]);
        while (f != r) {
            char ch = dequeue();
            find_adjacency(ch);
            if (is_visited(ch) == false) {
                visit(ch);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] vertex=new char[26];
        for(int i=0;i<25;i++){
            vertex[i]= (char) (65+i);
        }
        System.out.println("Enter the size of 2D matrix-");
        int row=sc.nextInt();
        int coloum=sc.nextInt();

        for(int i=0;i<row;i++) {
            for (int j = 0; j < coloum; j++) {
                array[i][j] = ".";
            }
        }
        for(int i=0;i<row;i++) {
            for (int j = i+1; j < coloum; j++) {
                System.out.print(vertex[i]+"-"+"Z :");
                array[i][j] = sc.next();
                if(array[i][j]=="x"){
                    array[j][i]="x";
                }
            }
        }


    }
}
