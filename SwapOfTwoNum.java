import java.util.Scanner;
public class SwapOfTwoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println(("a :" +a+"b : "+b));
        a = a+b;        //c = a
        b = a-b;        //a = b
        a = a-b;        //b = c
        System.out.println(("a :" +a+"b : "+b));
        s.close();
    }
}
