import java.util.*;
public class ConsecutiveSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            set.add(num);
        }

        int count = 0;

        for(int num : arr){
            if(!set.contains(num - 1)){
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                count = Math.max(count, streak);
            
            }
        }

        System.out.println(count);
        sc.close();
    }
}
