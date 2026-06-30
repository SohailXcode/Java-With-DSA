import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
         visited[start] = true;
         queue.add(start);

         while (!queue.isEmpty()){
             int current = queue.poll();
             System.out.print(current + " ");
             for (int neighbor : graph.get(current)){
                 if (!visited[neighbor]){
                     visited[neighbor] = true;
                     queue.add(neighbor);
                 }
             }
         }
    }

    static void main(String[] args) {
        int vertices = 7;
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());

        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);
        graph.get(2).add(6);
        System.out.println("BFS Traversal");
        bfs(0);
    }
}
