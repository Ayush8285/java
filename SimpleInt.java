import java.util.Scanner;

public class SimpleInt {

    void SI(float p , float r , float t){
        System.out.println("SImple interest is");
        System.out.println(((p*r*t)/100));

    }
    public static void main(String[] args) {
        SimpleInt si = new SimpleInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principle");
        float principle = s.nextFloat();
        System.out.println("Enter rate");
        float rate = s.nextFloat();
        System.out.println("Enter time");
        float time = s.nextFloat();
        si.SI(principle,rate,time);
        s.close();
    }
}
