import java.util.Scanner;

public class VowelConsonsnt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        String a = s.next();
        char b = a.charAt(0);
        if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'){
            System.out.println(b + " is a vowel");
        }else{
            System.out.println(b + " is a consonant");
        }
        
        s.close();
    }

}
