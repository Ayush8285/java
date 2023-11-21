import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first word");
        String first = s.nextLine().trim().toLowerCase();
        System.out.println("enter the second word");
        String second = s.nextLine().trim().toLowerCase();
        int count = 0;
        
        if(first.length()==second.length()){
            for(int i =0;i<first.length();i++){
                for(int j =0;j<second.length();j++){
                    char a = first.charAt(i);
                    char b = second.charAt(j);
                    if(a==b){
                        count++;
                    }
                }
            }
            if(count==first.length()){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }
        }else{
            System.out.println("The length of the string are different means character are different in them");
         
        }
        s.close();
    }
}
