public class Resep {
    private String NamaResep;
    private String BahanUtama;
    private int WaktuMemasak;

    public Resep(String NamaResep, String BahanUtama, String waktuMemasak) {
        this.NamaResep = NamaResep;
        this.BahanUtama = BahanUtama;
        this.WaktuMemasak = Integer.parseInt(waktuMemasak);
    }

    public Resep(String namaResepAwal, String bahanUtamaAwal, int waktuMemasakAwal) {
        //TODO Auto-generated constructor stub
    }

    public String getNamaResep() {
        return NamaResep;
    }

    @Override 
    public String toString() { 
    return "NamaResep ='" + NamaResep + '\'' + 
    ", BahanUtama ='" + BahanUtama + '\'' + 
    ", WaktuMemasak ='" + WaktuMemasak + '\'' 
    ;
    }
}