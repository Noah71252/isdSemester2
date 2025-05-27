public class HashSet {
    private Node[] buckets;
    private int size;
    private int mainPlayerCount = 0;

    public HashSet(int bucketsLength) {
        buckets = new Node[bucketsLength];
        size = 0;
    }

    private int hash(Object x) {
        int h = x.hashCode();
        return (h >= 0 ? h : -h) % buckets.length;
    }

    public void add(Object x, String type) {
        if (mainPlayerCount >= 5) {
            System.out.println("Main player already available, show sub player: " + x);
            type = "sub";
        }

        int h = hash(x);
        Node iterator = buckets[h];
        Node newNode = new Node(x, type);

        if (iterator == null) {
            buckets[h] = newNode;
        } else {
            while (iterator.next != null) {
                if (iterator.data.equals(x)) {
                    System.out.println("Player " + x + " already available");
                    return;
                }
                iterator = iterator.next;
            }
            if (iterator.data.equals(x)) {
                System.out.println("Player " + x + " already available");
                return;
            }
            iterator.next = newNode;
        }

        size++;
        if (type.equals("main")) {
            mainPlayerCount++;
        }
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                System.out.printf("List Player %d: ", i);
                while (iterator != null) {
                    System.out.println(iterator.data + " ");
                    iterator = iterator.next;
                }
                System.out.println();
            }
        }
    }

    public void printMainPlayers() {
        System.out.println("Main Players:");
        for (Node bucket : buckets) {
            Node iterator = bucket;
            while (iterator != null) {
                if (iterator.type.equals("main")) {
                    System.out.println(iterator.data + " ");
                }
                iterator = iterator.next;
            }
        }
        System.out.println();
    }

    public void printSubPlayers() {
        System.out.println("Sub Players:");
        for (Node bucket : buckets) {
            Node iterator = bucket;
            while (iterator != null) {
                if (iterator.type.equals("sub")) {
                    System.out.println(iterator.data + " ");
                }
                iterator = iterator.next;
            }
        }
        System.out.println();
    }
}