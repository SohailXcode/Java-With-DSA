import java.util.ArrayList;
import java.util.List;

public class Adjacency {
    static void main(String[] args) {
        int V = 4;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());

        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);
        for (int i = 0; i < V; i++) {
            System.out.println(i+" -> " + graph.get(i));

        }
    }
}
