

public class MainLL {
    public static void main(String[] args) { 
        QueueLL antrian = new QueueLL<>(); 

        antrian.enqueue("Jannah");
        antrian.enqueue("Yohana");
        antrian.enqueue("Kia");

        System.out.println("Antrian pada awalnya: ");
        antrian.printAntrian();

        antrian.dequeue();
        System.out.println("Antrian pada saat ini: ");
        antrian.printAntrian();

        System.out.println("jumlah orang di antrian: " + antrian.diAntrian());
        System.out.println("jumlah orang yang keluar: " + antrian.getJumlahKeluar());
    }


}
