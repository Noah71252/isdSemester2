package TipeB;

public class Main {
    public static void main(String[] args) {
        Antrian dokterUmum = new Antrian();
        Antrian dokterSpesialis = new Antrian();

        dokterUmum.in("A001","Rita","dr. Budi","Dokter Umum"); 
        dokterUmum.in("A002","Kiki","dr. Siti","Dokter Umum");
        dokterUmum.in("A003","Wowo","dr. Joko","Dokter Umum");
        dokterSpesialis.in("B001","Ika","dr. Mimi","Dokter THT");

        dokterUmum.callAntrian(); 
        dokterSpesialis.callAntrian(); 
        dokterSpesialis.in("B002", "Fikri", "dr. Kiki", "Dokter Penyakit Dalam");

    }
}
