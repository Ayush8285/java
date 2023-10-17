import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String u;
        char h;
        
        Scanner s = new Scanner(System.in);
        float balance = 20000;
        do{
        System.out.println("Press 1 to check balance");
        System.out.println("press 2 to deposit money");
        System.out.println("press 3 to withdraw money");
        int a = s.nextInt();
        
        
         switch(a){
            case 1:
                System.out.println("Balance is : " + balance);
                break;
            case 2:
                System.out.println("enter the amount you want to deposit:");
                float depositAmount = s.nextFloat();
                System.out.println("deposit amount is : "+ depositAmount);
                break;
            case 3:
                System.out.println("enter how much you want to withdraw:");
                float withdraw = s.nextFloat();
                System.out.println("your withdraw amount is : " + withdraw);
                break;
            default:
                System.out.println("your want to press 1,2,3 for bank details");   
                break;
        }
        System.out.println("if you want to check any more details press yes " );
         u = s.next();
         h = u.charAt(0);
    }while(h == 'Y' || h == 'y');

        s.close();
    }
}
