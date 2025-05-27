public class Main {
    public static void main(String[] args) {
        HashSet list = new HashSet(5);

        list.add("Rin Itoshi", "main");
        list.add("Sae Itoshi", "main");
        list.add("Yoichi Isagi", "main");
        list.add("Bachira Meguru", "main");
        list.add("Nagi Seishiro", "main");
        
        list.add("Reo Mikage", "sub");
        list.add("Kaiser", "sub");
        list.add("Hyoma Chigiri", "sub");
        list.add("Gagamaru", "sub");
        list.add("Eita Otoya", "sub");
        
        list.print();
        list.printMainPlayers();
        list.printSubPlayers();
    }
}