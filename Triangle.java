import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //triangle pattern
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size = s.nextInt();

        for(int i = 1 ; i<= size;i++){
            for(int j = 1 ;j <= i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }


        s.close();
    }

}
