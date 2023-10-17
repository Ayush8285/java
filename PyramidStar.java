import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size = s.nextInt();
        for(int i = 1 ; i <= size ; i++){
            for(int j = size-1;j>=i;j--)
            System.out.print(" ");
            for(int k = 1 ;k<=i;k++){
                System.out.print("*");
            }
            for(int l = 2 ; l<= i ;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
}
