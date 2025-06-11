import java.util.Scanner;

public class Binary_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        String a =sc.next(); 
        System.out.println("Enter b:");
        String b=sc.next();
        sc.close();

        int first = Integer.parseInt(a);  //converts string into an integer
        int second = Integer.parseInt(b); //converts string into an integer
        
        int sum= first + second; //performs addition on integers

        System.out.println("The first number (in decimal)is "+a);
        System.out.println("The second number (in deciaml) is "+b);
        System.out.println("The sum of numbers(integers) is:" + sum);
        System.out.println("Sum in binary is: "+ Integer.toBinaryString(sum));


        

    }
}

