import java.util.ArrayList;

public class DFSExample {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }

    static void main(String[] args) {
        int vertices = 5;
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());

        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        System.out.println("DFS Traversal : ");
        dfs(0);
    }
}
