import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter height in cm");
        float a = s.nextFloat();
        System.out.println("enter weight");
        float b = s.nextFloat();
        float bmi = a/(b*b);
        System.out.println((bmi<20)?"underweight":(bmi == 20 || bmi <25)?"normal":(bmi == 25 || bmi < 30)?"over weight":"obese");
        s.close();
    }
    
}
