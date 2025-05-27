public class Node {
    Object data;
    Node next;
    String type;

    public Node(Object data, String type) {
        this.data = data;
        this.type = type;
        this.next = null;
    }
}