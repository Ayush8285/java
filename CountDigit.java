import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number that you want to count ");
        int a = s.nextInt();
        int count = 0;
        for(int i=1;i<=a;i++){
            count += i;
        }
        System.out.println("the counting digit are = "+count);
        s.close();
    }
}
