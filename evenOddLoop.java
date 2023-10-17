import java.util.Scanner;

public class evenOddLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to start ");
        int a = s.nextInt();
        System.out.println("Enter the number you want to end ");
        int b = s.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i+" this number is even");
            }else{
                System.out.println(i+" this number is odd");
            }
        }
        s.close();
    }
}
