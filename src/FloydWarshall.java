import java.util.Scanner;

public class FloydWarshall {
    static int INFINITY = 999;

    public static void floydwarshall(int[][] distance,int vertices){
        for (int intermediate = 1; intermediate <= vertices; intermediate++){
            for (int source = 1; source <= vertices; source++){
                for (int destination = 1; destination <= vertices; destination++){
                    if (distance[source][intermediate] + distance[intermediate][destination]< distance[source][destination]){
                        distance[source][destination] = distance[source][intermediate] + distance[intermediate][destination];
                    }
                }
            }
        }

        for (int source = 1; source <= vertices; source++){
            System.out.print("\t" + source);
        }
        System.out.println();
        for (int source = 1; source <= vertices; source++){
            System.out.print(source + "\t");
            for (int destination = 1; destination <= vertices; destination++){
                System.out.print(distance[source][destination] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();

        int[][] matrix = new int[vertices + 1][vertices + 1];
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= vertices; source++){
            for (int destination = 1; destination <= vertices; destination++){
                matrix[source][destination] = sc.nextInt();
                if (source == destination){
                    matrix[source][destination] = 0;
                    continue;
                }
                if (matrix[source][destination] == 0){
                    matrix[source][destination] = INFINITY;
                }
            }
        }
        System.out.println("The all pair shortest path of the Graph");
        floydwarshall(matrix,vertices);
    }
}
