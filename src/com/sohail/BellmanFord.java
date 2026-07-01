import java.util.*;

class Edge {
    int source;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellmanFord {

    public static void main(String[] args) {

        int V = 5;

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0,1,6));
        edges.add(new Edge(0,2,7));
        edges.add(new Edge(1,2,8));
        edges.add(new Edge(1,3,5));
        edges.add(new Edge(1,4,-4));
        edges.add(new Edge(2,3,-3));
        edges.add(new Edge(2,4,9));
        edges.add(new Edge(3,1,-2));
        edges.add(new Edge(4,3,7));

        int[] distance = new int[V];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[0] = 0;

        // Relax edges V-1 times
        for(int i=1;i<V;i++) {

            for(Edge edge : edges) {

                int u = edge.source;
                int v = edge.destination;
                int w = edge.weight;

                if(distance[u] != Integer.MAX_VALUE &&
                        distance[u] + w < distance[v]) {

                    distance[v] =
                            distance[u] + w;
                }
            }
        }

        // Negative Cycle Check
        for(Edge edge : edges) {

            int u = edge.source;
            int v = edge.destination;
            int w = edge.weight;

            if(distance[u] != Integer.MAX_VALUE &&
                    distance[u] + w < distance[v]) {

                System.out.println(
                        "Negative Cycle Found");
                return;
            }
        }

        System.out.println(
                "Shortest Distances:");

        for(int i=0;i<V;i++) {
            System.out.println(
                    "0 -> " + i +
                            " = " + distance[i]);
        }
    }
}