import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class KruskalMST {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        parent[rootA] = rootB;
    }

    public static void main(String[] args) {

        Edge[] edges = {
                new Edge(0, 1, 2), // A-B
                new Edge(0, 3, 3), // A-D
                new Edge(2, 3, 5), // C-D
                new Edge(0, 2, 6), // A-C
                new Edge(1, 3, 8)  // B-D
        };

        Arrays.sort(edges);

        int vertices = 4;
        parent = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }

        String[] city = {"A", "B", "C", "D"};

        int totalCost = 0;

        System.out.println("Selected Roads:");

        for (Edge edge : edges) {

            if (find(edge.src) != find(edge.dest)) {

                union(edge.src, edge.dest);

                System.out.println(
                        city[edge.src] + " -> " +
                                city[edge.dest] + " : " +
                                edge.weight
                );

                totalCost += edge.weight;
            }
        }

        System.out.println("\nMinimum Cost = " + totalCost);
    }
}