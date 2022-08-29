package ClassAfterMid_1;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    int vertex;
    LinkedList<Integer> list[];
    char[] vertex1;

    public DFS(int vertex) {
        this.vertex = vertex;
        this.vertex1=new char[26];
        list = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public void DFS(){
        System.out.print("Depth First Traversal: ");
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<Integer>();

        for(int startIndex=0; startIndex<vertex; startIndex++){
            if(visited[startIndex]==false) {
                stack.push(startIndex);
                visited[startIndex] = true;
                while (stack.isEmpty() == false) {
                    int nodeIndex = stack.pop();
                    System.out.print(nodeIndex + " ");
                    LinkedList<Integer> nodeList = list[nodeIndex];
                    for (int i = 0; i < nodeList.size(); i++) {
                        int dest = nodeList.get(i);
                        if (visited[dest] == false) {
                            stack.push(dest);
                            visited[dest] = true;
                        }
                    }
                }
            }
        }
        System.out.println();
    }
    void create_graph(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<26;i++){
            vertex1[i]= (char) (65+i);
        }
        int[][] array=new int[vertex][vertex];
        for(int i=0;i<vertex;i++) {
            for (int j = 0; j < vertex; j++) {
                array[i][j] = 0;
            }
        }
        for(int i=0;i<vertex;i++) {
            for (int j = i+1; j < vertex; j++) {
                System.out.print(vertex1[i]+"-"+vertex1[j]+":");
                array[i][j] = sc.nextInt();
                if(array[i][j]==1){
                    array[j][i]=1;
                }
            }
        }

    }

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            LinkedList<Integer> nodeList = list[i];
            if(nodeList.isEmpty()==false) {
                System.out.print("source = " + i + " is connected to nodes: ");
                for (int j = 0; j < nodeList.size(); j++) {
                    System.out.print(" " + nodeList.get(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices-");
        int vertex=sc.nextInt();
        DFS dfs=new DFS(vertex);
    }
}
