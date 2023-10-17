import java.util.Scanner;

public class PrimaNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = s.nextInt();
        boolean flag = false;
        for(int i=2;i <= a/2;++i){
            if(a%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(a+" is a prime number");
        }else{
            System.out.println(a +" is not a prime number");
        }
        s.close();
    }
}
