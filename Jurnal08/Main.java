public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);

        graph.printMatrix();
        graph.printGraph();
    }
}
