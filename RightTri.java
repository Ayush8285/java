 public class RightTri {
    
    static void printStar(int col){
        if(col == 0){
            return;
        }
        System.out.print("*");
        printStar(col-1);

    }
    static void printSolid(int row ,int col){
        if(row == 0){
            return;
        }
        printStar(col-row+1);
        System.out.println();
        printSolid(row-1, col);
    }
    public static void main(String[] args) {
        printSolid(5, 5);
    }
}
