public class SumOfNno {
    
    static int result = 0;
    static void sumOfnNaturalNumber(int num){
        if(num == 0){
            return;
        }
        result += num;
        sumOfnNaturalNumber(num-1);
    }

    public static void main(String[] args) {
        int num = 4;
        sumOfnNaturalNumber(num);   
        System.out.println(result);     
    }
}
