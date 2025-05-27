public class Buku {
    private String ISBN;
    private String Judul;
    private String Kategori;
    private int Harga;
    private String Status;
    

    public Buku(String ISBN, String Judul, String Kategori, int Harga, String Status) {
        this.ISBN = ISBN;
        this.Judul = Judul;
        this.Kategori = Kategori;
        this.Harga = Harga;
        this.Status = Status;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getStatus() {
        return Status;
    }

    @Override 
    public String toString() { 
    return "ISBN ='" + ISBN + '\'' + 
    ", Judul ='" + Judul + '\'' + 
    ", Kategori ='" + Kategori + '\'' +
    ", Harga = " + Harga + '\'' +
    ", Status = " + Status+ '\'';
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public void setStatus(String status) {
        Status = status;
    }
}