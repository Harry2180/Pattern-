import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int a=sc.nextInt();
        System.out.println("Enter Rate in percent:");
        int b=sc.nextInt();
        System.out.println("Enter Time:");
        int c=sc.nextInt();
        sc.close();

        float CI= a*(1+((b/100)^c)) - a;
        System.out.println("The compound interest is:"+CI);
    }
}
