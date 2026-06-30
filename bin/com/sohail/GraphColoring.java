public class GraphColoring {

    static int V = 4;

    static boolean isSafe(int vertex,
                          int[][] graph,
                          int[] color,
                          int c) {

        for (int i = 0; i < V; i++) {

            if (graph[vertex][i] == 1 &&
                    color[i] == c)
                return false;
        }

        return true;
    }

    static boolean solve(int vertex,
                         int[][] graph,
                         int m,
                         int[] color) {

        if (vertex == V)
            return true;

        for (int c = 1; c <= m; c++) {

            if (isSafe(vertex,
                    graph,
                    color,
                    c)) {

                // Choose
                color[vertex] = c;

                // Explore
                if (solve(vertex + 1,
                        graph,
                        m,
                        color))
                    return true;

                // Undo Choice
                color[vertex] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0,1,1,0},
                {1,0,0,1},
                {1,0,0,1},
                {0,1,1,0}
        };

        int[] color = new int[V];

        int m = 3;

        if (solve(0, graph, m, color)) {

            String[] colors =
                    {"","Red","Green","Blue"};

            for (int i = 0; i < V; i++) {

                System.out.println(
                        "Vertex " +
                                i +
                                " -> " +
                                colors[color[i]]);
            }
        }
        else {
            System.out.println(
                    "No Solution Exists");
        }
    }
}