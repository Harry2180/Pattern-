import java.util.Scanner;
public class Complex_add {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your first number (real part):");
     int a1=sc.nextInt();
     System.out.println("Enter your second number (real part):");
    int a2=sc.nextInt();
    System.out.println("Enter your first number (imaginary part):");
    int b1=sc.nextInt();
    System.out.println("Enter your second number (imaginary part):");
    int b2=sc.nextInt();
    
    int sum_real=a1+a2;
    int sum_imaginary=b1+b2;
    
    System.out.println("the complex number is:"+ sum_real + "+"+ sum_imaginary + "i");

     
 }   
}
