import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        int c = 0;
        while(a!=0){
            int b = a%10;
            c += b;
            a /= 10;
        }
        System.out.println("The sum of the digit are = "+c);
        s.close();
    }
}
