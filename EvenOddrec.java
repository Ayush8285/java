public class EvenOddrec {
    static void evenodd(int num){
        if(num == 0){
            return;
        }
        if(num%2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
        evenodd(num-1);
    }

    public static void main(String[] args) {
        int num = 10;
        evenodd(num);
    }
}
