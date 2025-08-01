import java.util.Scanner;

public class Sumarray{

    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = input.nextInt();

        System.out.println("Enter B :");
        int b = input.nextInt();


        int result = sum(a,b);

        System.out.println("The Result : "+result);

        input.close();
    }
}