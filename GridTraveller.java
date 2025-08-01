import java.util.*;
public class GridTraveller {
    static Map<String, Long> memo = new HashMap<>();

    static long findGrid(long m, long n){
        String key = m +","+n;
        if(memo.containsKey(key)) return memo.get(key);
        
        if(m == 1 && n == 1) memo.put(key,(long) 1);
        else if(m == 0 || n == 0) memo.put(key,(long) 0);
        else memo.put(key, findGrid(m - 1, n) + findGrid(m, n - 1));   

        return memo.get(key);
    }
    public static void main(String[] args){


        System.out.println(findGrid(2, 3));
        System.out.println(findGrid(3, 3));
        System.out.println(findGrid(5, 5));
        System.out.println(findGrid(10, 10));
    }
}
