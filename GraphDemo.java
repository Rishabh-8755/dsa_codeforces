
import java.util.*;

public class GraphDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vertex = sc.nextInt();
        int edges = sc.nextInt();

        boolean adj[][] = new boolean[vertex][vertex];

        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = true;
            adj[v][u] = true;
        }

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(adj[i][j] ? 1 + " " : 0 + " ");
            }
            System.out.println();
        }
    }
    
}
