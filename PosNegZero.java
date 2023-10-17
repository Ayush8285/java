import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int a = s.nextInt();
        System.out.println((a>0)?"positive":(a<0)?"negative":"zero");
        s.close();
    }
}
