package TipeD;

import java.util.Stack;

public class BackForward {
    Stack<String > backStack = new Stack<>();
    Stack<String > forwardStack = new Stack<>();
    Stack<String > history = new Stack<>();

    public void addData(String url) { //method for nambah tab
        if (!history.isEmpty()) {
            backStack.push(history.peek()); //undo di push history di simpan
        } 
        history.push(url);
        forwardStack.clear(); //clear forward stack
        System.out.println("Website " + url + " dibuka");
    }

    public void back() { //method untuk back or undo
        if (backStack.isEmpty()) {
            System.out.println("Sudah di tab terakhir");
            return;
        } else {
            forwardStack.push(history.pop()); //forward stack di push history pop
            String url = backStack.pop();
            history.push(url);
            System.out.println("Mundur ke alamat " + url);
        }
    }

    public void forward() { //method untuk forward
        if (forwardStack.isEmpty()) {
            System.out.println("Sudah di tab awal");
            return;
        } else {
            String url = forwardStack.pop();
            history.push(url);
            System.out.println("Maju ke alamat " + url);
        }
    }
    
    public void history() {
        System.out.println("History: ");
        for (String url : history) {
            System.out.println(url);
        }
    }
}
