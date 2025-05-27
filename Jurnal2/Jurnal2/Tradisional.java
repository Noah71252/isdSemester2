package Jurnal2;

public class Tradisional implements Comparable<Tradisional>{
    private String kode;
    private String nama;
    private String kategori;
    private int harga;
    private int stok;

    public Tradisional(String kode, String nama, String kategori, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public String getKategori(){
        return kategori;
    }
    public int getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }

    @Override 
    public String toString() { 
        return kode + " " + nama + " " + kategori + " " + harga + " " + stok; 
    } 
 
    @Override 
    public int compareTo(Tradisional o) { 
        return this.getKode().compareTo(o.getKode()); 
    }
}