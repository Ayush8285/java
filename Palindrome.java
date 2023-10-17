import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int b = n;
        int c = 0;
        while(b!=0){
            int d = b%10;
            c = c *10 + d;
            b /= 10;
        }
        if(n==c){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }

        s.close();
    }
}
