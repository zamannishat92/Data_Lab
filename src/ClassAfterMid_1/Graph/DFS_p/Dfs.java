package ClassAfterMid_1.Graph.DFS_p;

import java.util.Scanner;

public class Dfs {
    public char[] color;
    public char[] vertex;
    public   int[][] array;
    public int t;
    public int[] stime;
    public int[] ftime;
    public int vertices;
    public char black;
    public char white;
    public char gray;
    public Dfs(int vertices){
        this.t=1;
        this.vertices=vertices;
        this.stime=new int[vertices];
        this.ftime=new int[vertices];
        this.color=new char[vertices];
        this.vertex=new char[26];
        this.array=new int[vertices][vertices];
    }
    public void setVertices(int vertices) {
        this.vertices = vertices;
    }
    void dfs_visit(int x){
        color[x]=gray;
        stime[x]=t;
        ++t;
        for(int i=0;i<vertices;i++){
            if(array[x][i]==1){
                if(color[i]==white){
                    dfs_visit(i);
                }
            }
        }
        color[x]=black;
        ftime[x]=t;
        ++t;
    }
    void dfs(){
        for(int i=0;i<vertices;i++){
            color[i]=white;
        }
        for(int i=0;i<vertices;i++){
            if(color[i]==white){
                dfs_visit(i);
            }
        }

    }
    void create_graph(){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<26;i++){
            vertex[i]= (char) (65+i);
        }
        //int[][] array=new int[vertices][vertices];
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

    }
    void print(){
        for(int i=0;i<vertices;i++){
            System.out.print(color[i]+" ");
        }
    }

}
