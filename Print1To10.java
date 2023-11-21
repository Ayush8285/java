public class Print1To10 {
    
    static void print1to10(int num){
        if(num == 11){
            return;
        }
        System.out.println(num);
        print1to10(num+1);
    }


    public static void main(String[] args) {
        int num = 1;
        print1to10(num);
    }
}
