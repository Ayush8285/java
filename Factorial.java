import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int a = s.nextInt();
        int b =1;
        for(int i=1;i<=a;i++){
            b *= i;
        }
        System.out.println("the factorial of the number is = "+b);
        s.close();
    }
}
