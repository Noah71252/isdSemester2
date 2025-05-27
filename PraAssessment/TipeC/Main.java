package TipeC;

public class Main {
    public static void main(String[] args) {
        Laundry laundry = new Laundry();

        laundry.addMember("G001", "Adam", "Jakarta", "Gold", 3);
        laundry.addMember("S002", "Dzaka", "Bogor", "Silver", 2);
        laundry.addMember("P003", "Drestayumna", "Jakarta", "Platinum", 4);
        laundry.addMember("B004", "Luthfi", "Riau", "Bronze", 1);

        System.out.println("Pencarian member dengan nama 'Adam':");
        laundry.searchMember("Adam");

        System.out.println("Memfilter member yang telah menjadi pelanggan lebih dari 3 tahun:");
        laundry.filterMembers(3);

        laundry.removeMember("M002");
    }

}
