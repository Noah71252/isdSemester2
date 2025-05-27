package Jurnal2;

public class Main {
    public static void main(String[] args) {
        Toko<Elektronik> elektronikList = new Toko<>(5);
        Toko<Tradisional> tradisionalList = new Toko<>(5);

        Elektronik elektronik1 = new Elektronik("E001", "Digital Piano", "Elektrik", 170000, 10);
        Elektronik elektronik2 = new Elektronik("E002", "Flute Elektrik", "Elektrik", 90000, 11);
        Elektronik elektronik3 = new Elektronik("E003", "Drum Set Elektronik", "Elektrik", 200000, 21);
        Elektronik elektronik4 = new Elektronik("E004", "Gitar Listrik", "Elektrik", 90000, 9);
        Elektronik elektronik5 = new Elektronik("E005", "Keyboard Elektrik", "Elektrik", 800000, 14);
        
        elektronikList.addData(elektronik1);
        elektronikList.addData(elektronik2);
        elektronikList.addData(elektronik3);
        elektronikList.addData(elektronik4);
        elektronikList.addData(elektronik5);
        
        System.out.println("Data Alat Musik Elektronik");
        elektronikList.display();
        System.out.println();

        Tradisional tradisional1 = new Tradisional("T001", "Angklung", "Tradisional", 150000, 9);
        Tradisional tradisional2 = new Tradisional("T002", "Gamelan", "Tradisional", 170000, 16);
        Tradisional tradisional3 = new Tradisional("T003", "Sasando", "Tradisional", 90000, 6);
        Tradisional tradisional4 = new Tradisional("T004", "Gong", "Tradisional", 200000, 21);
        Tradisional tradisional5 = new Tradisional("T005", "Tifa", "Tradisional", 299000, 8);
        
        tradisionalList.addData(tradisional1);
        tradisionalList.addData(tradisional2);
        tradisionalList.addData(tradisional3);
        tradisionalList.addData(tradisional4);
        tradisionalList.addData(tradisional5);
        
        System.out.println("Data Alat Musik Tradisional");
        tradisionalList.display();
        System.out.println();

        System.out.println("Data Setelah Diubah Elektronik");
        Elektronik penggantiElektronik = new Elektronik("E006", "Organ Elektrik", "Elektrik", 170000, 19);
        elektronikList.setData(elektronik2, penggantiElektronik);

        elektronikList.removeData(elektronik1);
        elektronikList.displaySort();

        System.out.println("Data Setelah Diubah Tradisional");
        Tradisional penggantiTradisional = new Tradisional("T006", "Gendang", "Tradisional", 199000, 24);
        tradisionalList.setData(tradisional1, penggantiTradisional);

        tradisionalList.removeData(tradisional2);
        tradisionalList.displaySort();
    }
}