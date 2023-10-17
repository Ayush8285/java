import java.util.Scanner;

public class PrintPrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start range for the prime number");
        int a = s.nextInt();
        System.out.println("Enter the end range for the prime number");
        int b = s.nextInt();
        int flag = 0;
        for(int i = a;i<=b;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.println(i+" is prime");
            }
        }
        s.close();
    }
}
