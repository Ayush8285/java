import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    System.out.println((a%2==0)?"even" : "odd" );
    s.close();
    }

}
