import java.util.Scanner;

public class ArmstrongNo {

    int Length(int x){
        int b = 0;
        while(x!=0){
            x /= 10;
            b++;
        }
        return b;
    }

    double Pow(int x,int y){
        double c = 0;

        while(x!=0){
            int a = x % 10;
            c = c + Math.pow(a, y);
            x /= 10;
        }
        return c;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArmstrongNo arm = new ArmstrongNo();
        System.out.println("Enter the number");
        int number = s.nextInt();
        int length = arm.Length(number);
        double solution = arm.Pow(number,length);

        if(number == solution){
            System.out.println("ArmStrong number");
        }else{
            System.out.println("Not a Armstron number");
        }
        s.close();
    }
}
