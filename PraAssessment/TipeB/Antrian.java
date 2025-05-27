package TipeB;

import java.util.LinkedList;
import java.util.Queue;

public class Antrian {
    Queue<Pasien> antrian = new LinkedList<>();
    public void in(String nomerPasien, String namaPasien, String namaDokter, String jenisDokter) {
        Pasien pasien = new Pasien(nomerPasien, namaPasien, namaDokter, jenisDokter);
        antrian.add(pasien);

        if (nomerPasien.startsWith("A")) {
            System.out.println("Anda adalah pasien dokter umum");
        if (antrian.size() > 1) {
            System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");
        }
        } else if (nomerPasien.startsWith("B")) {
            System.out.println("Anda adalah pasien dokter spesialis");
        }       
    }
    public void callAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian");
            return;
        }

        Pasien pasien = antrian.poll(); //hapus belakang
        System.out.println("nomer: " + pasien.nomerPasien + ", nama pasien: " + pasien.namaPasien + ", nama dokter: " 
        + pasien.namaDokter + ", jenis dokter: " + pasien.jenisDokter);        
    }

    public void deleteAll() {
        antrian.clear();
        System.out.println("Seluruh antrian telah dihapus.");
    }
}
