import java.util.Scanner;

public class Binary_int_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");            //for addition of two numbers we do not need string data type
        int a =sc.nextInt();                        // Convert float to int bits
                                                    //int bits = Float.floatToIntBits(f);
                                                    // Convert to binary string
                                                    //String binary = Integer.toBinaryString(bits);
        System.out.println("Enter b:");
        int b=sc.nextInt();
        sc.close();

        int sum=a+b;

        System.out.println("The sum is: "+ Integer.toBinaryString(sum));

    }
}
