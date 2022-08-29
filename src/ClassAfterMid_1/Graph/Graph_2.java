package ClassAfterMid_1.Graph;

import java.io.*;
import java.util.*;

class Graph_2 {
    private int V;                              //number of nodes in the graph
    private LinkedList<Integer> adj[];              //adjacency list
    private Queue<Integer> queue;                   //maintaining a queue

    Graph_2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }


    void addEdge(int v, int w) {
        adj[v].add(w);                          //adding an edge to the adjacency list (edges are bidirectional in this example)
    }

    void BFS(int n) {

        boolean nodes[] = new boolean[V];       //initialize boolean array for holding the data
        int a = 0;

        nodes[n] = true;
        queue.add(n);                   //root node is added to the top of the queue

        while (queue.size() != 0) {
            n = queue.poll();             //remove the top element of the queue
            System.out.print(n + " ");           //print the top element of the queue

            for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only insert nodes into queue if they have not been explored already
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices-");
        int vertices=sc.nextInt();
        System.out.println("Enter the number of edges-");
        int edges=sc.nextInt();
        Graph_2 graph=new Graph_2(vertices);
        for(int i=0;i<edges;i++){
            System.out.println("Enter the source edge-");
            int u=sc.nextInt();
            System.out.println("Enter the destination edge-");
            int v=sc.nextInt();
            graph.addEdge(u,v);
        }
        System.out.println("The Breadth First Traversal of the graph is as follows :");

        graph.BFS(0);
    }
}
