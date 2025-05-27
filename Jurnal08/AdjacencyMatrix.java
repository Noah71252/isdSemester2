public class AdjacencyMatrix {
    int n;
    boolean[][] matrix;

    public AdjacencyMatrix(int n) {
        this.n = n;
        matrix = new boolean[n][n];
    }

    public void addEdge(int i, int j) {
        matrix[i][j] = true;
       }
       public void removeEdge(int i, int j) {
        matrix[i][j] = false;
       }
       public boolean hasEdge(int i, int j) {
        return matrix[i][j];
    } 

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%b ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void printGraph() {
        for (int i = 0; i < n; i++) {
            if (matrix[i].length > 0) {
                System.out.print("Vertex " + (i + 1) + " is connected to: "); 
                for (int j = 0; j < matrix[i].length; j++) {
                    if (hasEdge(i, j)){
                        System.out.print((j + 1) + " ");
                    }
                    // System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}