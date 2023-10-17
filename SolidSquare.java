import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
        // solid square
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = s.nextInt();
        for(int i = 0 ; i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
