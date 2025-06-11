import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a=sc.nextFloat();
        System.out.println("Enter b:");
        float b=sc.nextFloat();
        sc.close();
        

        float mul;
        mul=a*b;
        System.out.println("The muliplication is:"+ mul);
    }
}
