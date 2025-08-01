import java.util.*;

public class ValidateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.addLast(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                stack.pollLast();
            }
        }
        System.out.print((stack.isEmpty()) ? 0 : 1);

        sc.close();
    }
}
