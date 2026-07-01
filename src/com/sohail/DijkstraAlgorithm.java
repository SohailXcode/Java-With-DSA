import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Edge{
    int destination;
    int weight;

    Edge(int destination,int weight){
        this.destination = destination;
        this.weight = weight;
    }
}

class Pair implements Comparable<Pair>{
    int vertex;
    int distance;

    Pair(int vertex,int distance){
        this.vertex = vertex;
        this.distance = distance;
    }
    public int compareTo(Pair other){
        return this.distance - other.distance;
    }
}

public class DijkstraAlgorithm {
    static void dijkstra(List<List<Edge>>graph,int source){
        int V = graph.size();
        int[]distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        distance[source] = 0;
        pq.add(new Pair(source,0));

        while (!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.vertex;
            for (Edge edge : graph.get(u)){
                int v = edge.destination;
                int weight = edge.weight;
                if (distance[u] + weight < distance[v]){
                    distance[v] = distance[u] + weight;
                    pq.add(new Pair(v,distance[v]));
                }
            }
        }
        System.out.println("Shortest Distances");
        for (int i = 0; i < V; i++) {
            System.out.println("0 -> " + i + " = " + distance[i]);


        }
    }

    static void main(String[] args) {
        int V = 4;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());

        }
        graph.get(0).add(new Edge(1,4));
        graph.get(0).add(new Edge(2,1));

        graph.get(2).add(new Edge(1,3));
        graph.get(2).add(new Edge(3,5));

        graph.get(1).add(new Edge(3,2));

        dijkstra(graph,0);
    }

}
