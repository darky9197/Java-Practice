import java.util.*;

public class LeastFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                result.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            System.out.print("Invalid");
        }

        Collections.sort(result);
        String res = "";

        for (int i : result) {
            res = res + i;
        }

        System.out.print(Integer.parseInt(res));
        sc.close();
    }
}
