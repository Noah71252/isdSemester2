import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Hologram");
        graph.addVertex("Kontak tim lain");
        graph.addVertex("Properti panggung");
        graph.addVertex("Kostum");
        graph.addVertex("Persiapan panggung");
        graph.addVertex("Pencahayaan");
        graph.addVertex("Pengepasan kostum");
        graph.addVertex("Pembuatan panggung");

        graph.addEdge("Hologram", "Kostum");
        graph.addEdge("Kontak tim lain", "Pengepasan kostum");
        graph.addEdge("Kontak tim lain", "Pembuatan panggung");
        graph.addEdge("Properti panggung", "Kostum");
        graph.addEdge("Properti panggung", "Pembuatan panggung");
        graph.addEdge("Kostum", "Persiapan panggung");
        graph.addEdge("Persiapan panggung", "Pencahayaan");
        graph.addEdge("Pencahayaan", "Pengepasan kostum");
        graph.addEdge("Pengepasan kostum", "Pembuatan panggung");
        List<String> sortedList = graph.topologicalSort();

        if (sortedList != null) {
            System.out.println("Topological Sort: " + sortedList);
        } else {
            System.out.println("Cycle detected in the graph.");
        }
    }
}