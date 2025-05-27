
public class Player {  //do map
    private String name;
    private int age;
    private String position;
    private int num;

    public Player(String name, int age, String position, int number) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.num = number;
    }

    // Custom hashCode menggunakan nomor pemain
    @Override
    public int hashCode() {
        return num * 30; 
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Position: " + position + ", Number: " + num;
    }
}
