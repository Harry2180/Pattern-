import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int a=sc.nextInt();
        System.out.println("Enter Rate in percent:");
        int b=sc.nextInt();
        System.out.println("Enter Time:");
        int c=sc.nextInt();
        sc.close();

        float SI=(a*b*c)/100;
        System.out.println("The simple interest is: "+ SI);

    }
}
