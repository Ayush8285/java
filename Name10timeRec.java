public class Name10timeRec {

    static void namePrint(int num,String name){
        if(num==0){
            return;
        }
        System.out.print(name);
        System.out.println();
        namePrint(num-1, name);
    }
    
    public static void main(String[] args) {
        String name = "Ayush";
        namePrint(10, name);
    }
}
