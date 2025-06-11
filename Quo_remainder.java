import java.util.Scanner;

public class Quo_remainder {
    public static void main(String[] args) {
      System.out.println("Enter a: ");
      Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.println("Enter b:");
        float b=sc.nextFloat();
       
        sc.close();

        float quotient = a/b;
        float remainder = a%b;

        System.out.printf("The quotient is : %5f\n", quotient);
        System.out.println("The remainder is :" + remainder);

       

        
    }
}
