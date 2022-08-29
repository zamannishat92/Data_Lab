package ClassAfterMid_1.Graph.DFS_p;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices-");
        int vertices=sc.nextInt();
        Dfs dfs=new Dfs(vertices);
        dfs.create_graph();
        dfs.dfs();
        dfs.print();
    }
}
