import java.util.LinkedList;
import java.util.Queue;

public class QueueLL<E> {
    private Queue<String> antrian;
    private int jumlahKeluar;

    //constructor
    public QueueLL() {
        antrian = new LinkedList<>();
        jumlahKeluar = 0;
    }

    //add object to queue
    public void enqueue(String nama) {
        antrian.add(nama);
    }

    // remove object from queue 
    public void dequeue() { 
        if (!antrian.isEmpty()) {
            String orangKeluar = antrian.poll();
            jumlahKeluar++;
            System.out.println("Orang yang keluar: " + orangKeluar);
        } else {
            System.out.println("Antrian kosong");
        }
    }
    
    //output queue
    public void printAntrian() {
        for (String string : antrian) {
            System.out.println(string);
        }
        System.out.println();
    }

    // return jumlah orang yang keluar
    public int getJumlahKeluar() {
        return jumlahKeluar;
    }

    public int diAntrian() {
        return antrian.size();
    }
}
