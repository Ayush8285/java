public class Print10To1 {
    
    static void print10to1(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        print10to1(num-1);
    }


    public static void main(String[] args) {
        int num = 10;
        print10to1(num);
    }
}

