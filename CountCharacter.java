import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        String a = s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            count++;
        }
        System.out.println("The character in the string are "+count);
        s.close();
    }
}
