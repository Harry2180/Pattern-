import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str= sc.next();
        
        int str_length= str.length();
       
        String reversed ="";
        for(int i=str_length-1;i>=0;i--){
          reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("The provided string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}
