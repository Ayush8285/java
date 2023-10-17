import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int c = 0;
        while(n!=0){
            int d = n%10;
            c = c *10 + d;
            n /= 10;
        }
        System.out.println("The reverse of the number is : " + c);
        s.close();
    }
}
