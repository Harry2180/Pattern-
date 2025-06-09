
import java.util.Scanner;

public class Factorial {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        Trying_main obj = new Trying_main();
        obj.calculateFactorial(n);  

        scanner.close();  
    }
}

class Trying_main {
    void calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}

