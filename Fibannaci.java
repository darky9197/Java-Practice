import java.util.*;
public class Fibannaci {
    static Map<Long, Long> memo = new HashMap<>();

    static long fibonacci(long n){
        if(memo.containsKey(n)) return memo.get(n);
        if(n <= 2) memo.put(n , (long) 1);
        else memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        return memo.get(n);
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);


        System.out.println(fibonacci(6));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(50));
        
    }
}
