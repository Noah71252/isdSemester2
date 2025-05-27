import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("hologram");
        graph.addVertex("kontak tim lain");
        graph.addVertex("properti panggung");
        graph.addVertex("kostum");
        graph.addVertex("persiapan panggung");
        graph.addVertex("pencahayaan");
        graph.addVertex("pengepasan kostum");
        graph.addVertex("pembuatan panggung");


        graph.addEdge("hologram", "kostum");
        graph.addEdge("kontak tim lain", "persiapan panggung");
        graph.addEdge("kontak tim lain", "pengepasan kostum");
        graph.addEdge("properti panggung", "kostum");
        graph.addEdge("properti panggung", "persiapan panggung");
        graph.addEdge("properti panggung", "pembuatan panggung");
        graph.addEdge("kostum", "pencahayaan");
        graph.addEdge("kostum", "pengepasan kostum");
        graph.addEdge("kostum", "pembuatan panggung");

        List<String> sortedList = graph.topologicalSort();
        if (sortedList != null) {
            System.out.println("Topological Sort: " + sortedList);
        } else {
            System.out.println("Cycle detected in the graph.");
        }
    }
}