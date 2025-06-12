import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int a=sc.nextInt();
        sc.close();

        if(a%4==0 && a%100!=0){
            System.out.println("The year" +a+ " is leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}
