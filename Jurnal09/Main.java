public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(8);

        graph.addEdge(7, 0);
        graph.addEdge(0, 1);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 2);
        graph.addEdge(2, 0);
        graph.addEdge(0, 7);

        graph.bfs(0);
        System.out.println();
        graph.dfs(0);
    }
}
