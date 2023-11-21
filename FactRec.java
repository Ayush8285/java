import java.util.Scanner;

public class FactRec {
    
    static int Fact(int n){
        if(n <0){
            return -1;
        }

        if(n==0 || n == 1){
            return 1;
        }else{
            return n * Fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want factorial");
        int n = s.nextInt();
        int result = Fact(n);
        System.out.println(result);
        s.close();
    }
}
