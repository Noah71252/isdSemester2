import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singly<Resep> linkedSingly = new Singly<Resep>();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep Baru (Awal)");
            System.out.println("2. Tambah Resep Baru (Akhir)");
            System.out.println("3. Hapus Resep (Awal)");
            System.out.println("4. Hapus Resep (Akhir)");
            System.out.println("5. Cetak Semua Resep");
            System.out.println("6. Cari Resep Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResepAwal = input.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanUtamaAwal = input.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuMemasakAwal = input.nextInt();
                    linkedSingly.insertAtFront(new Resep(namaResepAwal, bahanUtamaAwal, waktuMemasakAwal));
                    break;

                case 2:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResepAkhir = input.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanUtamaAkhir = input.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuMemasakAkhir = input.nextInt();
                    linkedSingly.insertAtBack(new Resep(namaResepAkhir, bahanUtamaAkhir, waktuMemasakAkhir));
                    break;
                case 3:
                    linkedSingly.removeFromBack();
                    System.out.println("Resep terakhir dihapus.");
                    break;
                case 4:
                    linkedSingly.print();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
    }
}