import java.util.Scanner;

public class PlusStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the pattern");
        int size = s.nextInt();

        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            
            if (i == size / 2) {
              System.out.print("*");
            }
            
            else {
              if (j == size / 2) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }
            }
          }
          System.out.println();
        }
        s.close();
    }
}
