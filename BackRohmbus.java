import java.util.Scanner;

public class BackRohmbus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size = s.nextInt();
        for(int i = 1 ; i<= size ;i++){
            for(int j=i;j<=size;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
