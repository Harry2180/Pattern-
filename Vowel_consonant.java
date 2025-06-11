import java.util.Scanner;

public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char a=sc.next().charAt(0);
        sc.close();
        if(Character.isLetter(a)){

            char lower= Character.toLowerCase(a);
        
            if(lower == 'a'||lower == 'e'|| lower == 'i'|| lower == 'o'|| lower == 'u'){
                 System.out.println(a+" is a vowel!");
            }
            else{
                System.out.println("It is a consonant");
            }
        }
        else{
            System.out.println("The provided symbol is not an alphabet");
        }
        
    }
}