public class PrimeRec {
    

    static int Prime(int n,int i){
        int flag = 0 ;
        if(i>n/2){
            return flag = 1;
        }
        if(n%i == 0){
            return flag;
        }
        Prime(n,i+1);
        return flag;

    }
    public static void main(String[] args) {
        int n = 1;
        int result = Prime(n, 2);
        if(result == 1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
