import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<ToDoList> taskList = new PriorityQueue<>();

        // Insert data
        taskList.add(new ToDoList(5, "tugas ISD"));
        taskList.add(new ToDoList(8, "rapat UKM"));
        taskList.add(new ToDoList(3, "kuis SBD"));

        // Menampilkan task terdekat
        if (!taskList.isEmpty()) {
            System.out.println("Task terdekat yang harus diselesaikan: " + taskList.peek().getDescription());
        }

        // Menghapus task yang paling prioritas
        ToDoList selesai = taskList.poll();
        if (selesai != null) {
            System.out.println("Ketika task " + selesai.getDescription() + " dihapus: ");
            if (!taskList.isEmpty()) {
                System.out.println(selesai.getDescription() + " selesai dilaksanakan, berikutnya " + taskList.peek().getDescription());
            } else {
                System.out.println("Tidak ada task lain yang harus diselesaikan.");
            }
        }
    }
}
