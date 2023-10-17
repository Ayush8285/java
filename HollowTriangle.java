import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the triangle");
        int size = s.nextInt();

        for(int i =1 ; i<= size ; i++){
            for(int j = 1 ; j<= size ; j++){
                if(j == 1 || i == size || i == j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
