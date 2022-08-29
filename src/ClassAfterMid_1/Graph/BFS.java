package ClassAfterMid_1.Graph;

import java.util.Scanner;

public class BFS {
    public static int vertices;
    public static char[] visited_array = new char[100];
    public static int visited_sequence = -1;
    public static int f = 0, r = 0;
    public static int size;
    public static int[] q = new int[size + 1];
    public static char[] vertex = new char[26];
    public static int[][] array = new int[vertices][vertices];

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
        r = (r + 1) % (vertices + 1);
        //r=s;
        q[r] = ch;
    }

    public static char dequeue() {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        f = (f + 1) % (size + 1);
        return (char) q[f];
    }

    public static void find_adjacency(char ch) {
        for (int i = 0; i < vertices; i++) {
            if (ch == vertex[i]) {
                System.out.print(vertex[i] + "->");
                for (int j = 0; j < vertices; j++) {
                    if (array[i][j] == 1) {
                        if (is_visited(vertex[j]) == false) {
                            enqueue(vertex[j]);
                        }
                    }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices-");
        vertices = sc.nextInt();
        for (int i = 0; i < 26; i++) {
            vertex[i] = (char) (65 + i);
        }
        int[][] array=new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < vertices; i++) {
            for (int j = i + 1; j < vertices; j++) {
                System.out.print(vertex[i] + "-" + vertex[j] + ":");
                array[i][j] = sc.nextInt();
                if (array[i][j] == 1) {
                    array[j][i] = 1;
                }
            }

            bfs();
            print_visit_array();
        }
    }
}