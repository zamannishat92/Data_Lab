package ClassAfterMid_1.BFS_adjMatrix;

import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertex");
        int vertex=sc.nextInt();
        Graph theGraph = new Graph();
        for (int i = 0; i < vertex; i++) {
            char ch=(char) (65+i);
            theGraph.addVertex(ch);
        }
        System.out.println("Enter the number of edges");
        int edge=sc.nextInt();
        System.out.println("Enter the source and destination");
        for (int i = 0; i < edge; i++) {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            theGraph.addEdge(source,destination);
        }
        System.out.println("BFS of the Graph");
        theGraph.bfs();
        System.out.println();
    }
}
