import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter age");
        int age = s.nextInt();
        System.out.println((age <11)?"Child":(age ==11 || age <=17)?"Teenager":(age ==18 || age < 60)?"Adult":"Senior");
        s.close();
    }
    
}
