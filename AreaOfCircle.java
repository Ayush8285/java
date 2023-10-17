import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.println("enter radius");
    int a = s.nextInt();
    System.out.println("Area of circle is " +Math.PI*a*a);
    s.close();
    }
    
    
}
