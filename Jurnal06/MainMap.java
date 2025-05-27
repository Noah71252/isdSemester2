import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, Player> playerMap = new HashMap<>();
        Player p1 = new Player("Yoichi Isagi", 16, "Striker", 8);
        Player p2 = new Player("Rin Itoshi", 16, "Striker Forward", 10);
        Player p3 = new Player("Bachira Meguru", 17, "Center Forward", 8); 

        tambahPemain(playerMap, p1);
        tambahPemain(playerMap, p2);
        tambahPemain(playerMap, p3);

        cetakPemain(playerMap);
    }

    private static void tambahPemain(Map<Integer, Player> map, Player player) {
        int key = player.hashCode();
        if (map.containsKey(key)) {
            System.out.println("[Duplicate] Player with number " + player.hashCode() + " already available: ");
            System.out.println("- " + map.get(key));
            System.out.println("- " + player);
        } else {
            map.put(key, player);
        }
    }

    private static void cetakPemain(Map<Integer, Player> map) {
        System.out.println("\nList Player:");
        for (Player player : map.values()) {
            System.out.println(player);
        }
    }
}
