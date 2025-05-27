package TipeD;

public class Main {
    public static void main(String[] args) {
        BackForward backForward = new BackForward();       

        backForward.addData("https://www.google.com/search?q=comparable+java+integer"); 
        backForward.addData("https://www.javatpoint.com/java-integercompareto-method"); 
        backForward.addData("https://www.javatpoint.com/java-integercompareunsigned-method"); 
        backForward.back(); 
        backForward.forward(); 
        backForward.history();
    }
}
