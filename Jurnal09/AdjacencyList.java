
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {

    int n;
    LinkedList<Integer> adjListArray[];

    AdjacencyList(int n) {
        this.n = n;

        adjListArray = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);

        adjListArray[dest].add(src);
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print((char) (65 + node) + " ");
            for (int neighbor : adjListArray[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.print((char) (65 + node) + " ");
                LinkedList<Integer> neighbors = adjListArray[node];
                for (int i = 0; i < neighbors.size(); i++) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public void printGraph() {
        for (int i = 0; i < n; i++) {
            if (!adjListArray[i].isEmpty()) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();

            }
        }
    }
}
