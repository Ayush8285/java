public class EvenRec {


    static void Even(int n){
        //base condition
        if(n == 1){
            
            return;
        }

        //processing logic
        if(n%2==0){
            System.out.println(n);
        }
        
        //small problem
        Even(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        Even(n);
    }
}
