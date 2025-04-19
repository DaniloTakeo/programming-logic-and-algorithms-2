package maxPathInGraph;

public class MaxPathInGraph {

    public static int findMaxPath(int[][] graph, int src, int dest) {
        int n = graph.length;
        Integer[] dp = new Integer[n];
        return dfs(graph, src, dest, dp);
    }

    private static int dfs(int[][] graph, int current, int dest, Integer[] dp) {
        if (current == dest) return 0;

        if (dp[current] != null) return dp[current];

        int max = Integer.MIN_VALUE;

        for (int next = 0; next < graph.length; next++) {
            if (graph[current][next] > 0) {
                int result = dfs(graph, next, dest, dp);
                if (result != Integer.MIN_VALUE) {
                    max = Math.max(max, graph[current][next] + result);
                }
            }
        }

        dp[current] = max;
        return max;
    }

    public static void main(String[] args) {
        int[][] graph = {
            { 0, 3, 2, 0 },
            { 0, 0, 0, 7 },
            { 0, 4, 0, 6 },
            { 0, 0, 0, 0 }
        };

        int src = 0, dest = 3;

        int maxPath = findMaxPath(graph, src, dest);
        if (maxPath == Integer.MIN_VALUE) {
            System.out.println("Nenhum caminho disponível entre os nós.");
        } else {
            System.out.println("Maior caminho entre " + src + " e " + dest + " é: " + maxPath);
        }
    }
}