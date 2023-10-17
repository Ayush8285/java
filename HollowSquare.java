import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        //hollow square
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = s.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if( i == 1 || i == size || j == 1 || j == size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
