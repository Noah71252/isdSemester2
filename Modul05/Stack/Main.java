import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println((cek("[({})]") ? "valid" : "invalid"));
        System.out.println((cek("[]{}()") ? "valid" : "invalid"));
        System.out.println((cek("[{)]") ? "valid" : "invalid"));
        System.out.println((cek("[{)]") ? "valid" : "invalid"));
    }

    static boolean cek(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == '}' && top !=
                    '{') || (c == ']' && top != '[')) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return stack.isEmpty();
    }    
}

