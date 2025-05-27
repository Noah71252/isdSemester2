import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Buku> listBuku = new LinkedList<>();

        listBuku.add(new Buku("978-9965", "Harry Potter", "Fiksi", 99000, "Ada"));
        listBuku.addFirst(new Buku("879-0042","Api Republik", "Non fiksi", 79000, "Ada"));
        listBuku.addFirst(new Buku("674-78","Dari Penjara ke Penjara", "Aksi", 89000, "Ada"));
        listBuku.addLast(new Buku("534-87","Bumi", "Fantasi", 139000, "Dipinjam"));
        listBuku.add(new Buku("677-09","Old Man His Property", "Romance", 159000, "Dipinjam"));

        System.out.println("Cetak depan list");
        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
            System.out.println("\nCetak mundur list");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        iterator = listBuku.listIterator();
        while (iterator.hasNext()) {
                Buku ob =  iterator.next();
                if (ob.getISBN().equals("978-9965")) {
                    iterator.remove();
                }
            }
        if (iterator.hasPrevious()) {
            Buku ob =  iterator.previous();
            ob.setStatus("Ada");
        }
        if (iterator.hasPrevious()) {
            Buku ob =  iterator.previous();
            ob.setJudul("Hujan");
        }

        System.out.println();

        for (Buku ob : listBuku) {
            System.out.println(ob);
        }
    }
}

