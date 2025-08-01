import java.util.*;
public class StringPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        StringBuffer st1 = new StringBuffer(str1);
        StringBuffer st2 = new StringBuffer(str2);

        char firstChar = st2.charAt(0);
        int flg = 0;

        for(int i = 0; i < st1.length(); i++){
            if(flg == 0 && st1.charAt(i) == firstChar){
                System.out.println(st2.reverse());
                flg = 1;
            }else { 
                for(int j = 0; j < st2.length() - 1; j++){
                    System.out.print('*');
                }
                System.out.println(st1.charAt(i));
            }
        }

        sc.close();;
    }
}
