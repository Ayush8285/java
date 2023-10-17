import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length");
        int a = s.nextInt();
        System.out.println("enter breadth");
        int b = s.nextInt();
        System.out.println("Area of Rectangle :" +a*b);
        s.close();
    }
}
