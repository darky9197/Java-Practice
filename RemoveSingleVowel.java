import java.util.*;

public class RemoveSingleVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                while(str.charAt(i+1) == str.charAt(i)){
                    count++;
                    res = res + str.charAt(i);
                    i++;
                }
                if(!(count > 0)){
                    continue;
                }
            }
            res = res + str.charAt(i);
        }

        System.out.print(res);

        sc.close();
    }
}
