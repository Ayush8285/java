import java.util.Scanner;

public class Rohmbus {
    public static void main(String[] args) {
        //rohmbus
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size = s.nextInt();
        for(int i=1;i<=size;i++){
            for(int k =1 ;k< i;k++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=size;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }


        s.close();
    }
}
