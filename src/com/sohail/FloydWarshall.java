public class FloydWarshall {
    static final int INF = 99999;

    static void main(String[] args) {
        int[][] dist = {
                {0,3,INF,7},
                {8,0,2,INF},
                {5,INF,0,1},
                {2,INF,INF,0}
        };
        int V =4;
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j=0;j<V;j++){
                    if (dist[i][k] + dist[k][j]< dist[i][j]){
                        dist[i][j]=dist[i][k] + dist[k][j];
                    }

                }

            }


        }
        System.out.println("Shortest Distance Matrix");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(dist[i][j] == INF){
                    System.out.print("INF ");
                }else {
                    System.out.print(dist[i][j]+" ");
                }

            }
            System.out.println();

        }

    }
}
