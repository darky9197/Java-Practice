import java.util.*;

public class SentenceSort {
    static void getMapped(Map<Integer, String> map, String s) {
        int digit = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                digit = s.charAt(i) - '0';
            } else {
                str = str + s.charAt(i);
            }
        }
        map.put(digit, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split("\\s+");
        String res = "";

        Map<Integer, String> map = new HashMap<>();

        for (String s : strArray) {
            getMapped(map, s);
        }

        for (int key = 0; key < map.size(); key++) {
            res = res + " " + map.get(key);
        }

        System.out.println(res);

        sc.close();
    }
}
