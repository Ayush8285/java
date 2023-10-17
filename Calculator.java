import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first no. ");
        int a = s.nextInt();
        System.out.println("Enter your second no. ");
        int b = s.nextInt();
        System.out.println("select which operation you want to perform => + , - , * , / ");
        String c = s.next();
        char d = c.charAt(0);
        switch(d){
            case'+':
                System.out.println("Result is => " + (a+b));
                break;
            case '-':
                System.out.println("Result is => " + (a-b));
                break;    
            case '*':
                System.out.println("Result is => " + (a*b));
                break;    
            case'/':
                System.out.println("Result is => " + (a/b));
                break;    
            default:
                System.out.println("invalid operation performed");
        }
        s.close();
    }
}
