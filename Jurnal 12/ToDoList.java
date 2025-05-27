public class ToDoList implements Comparable<ToDoList> {
    private int deadline;
    private String description;

    public ToDoList(int deadline, String description) {
        this.deadline = deadline;
        this.description = description;
    }

    public int getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(ToDoList other) {
        return Integer.compare(this.deadline, other.deadline); // Prioritas deadline yang lebih kecil
    }

    @Override
    public String toString() {
        return description + " (deadline: " + deadline + ")";
    }
}
