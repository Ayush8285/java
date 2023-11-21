public class PrimeNoRec {
    
    static boolean isPrime(int counter , int num){
        if( counter > num/2){
            return true;
        }
        if(num %counter == 0){
            return false;
        }
        
        return isPrime(counter+1, num);
    }


    public static void main(String[] args) {
        int num = 20;
        int counter = 2;
        if(counter < 2){
            System.out.println("Number must be greater than or equal to 2");
        }else{
            if(isPrime(counter, num)){
            System.out.println("Number "+num+" is prime");
        }else{
            System.out.println("Number "+num+" is not prime");
        }
        }
        
    }
}
