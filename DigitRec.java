public class DigitRec{

    static void Digit(int n){

        //processing logic
        System.out.println(n);

        //base condition
        if(n == 0){
            
            return;
        }
        
        //small problem
        //Digit(n+1);
        Digit(n-1);

    }

    public static void main(String[] args) {
        int n = 5;
        Digit(n);
    }
}