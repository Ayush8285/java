import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci series till " + n + " terms");
        for(int i =1;i<=n;i++){
            System.out.println(first+" ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        
        }
        s.close();
    }
}
