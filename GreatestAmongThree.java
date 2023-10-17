import java.util.Scanner;

public class GreatestAmongThree{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println((a>b && a>c)? a +" is greater":(b>a && b>c)? b +" is greater":c+" is greater");
        s.close();
       }
}