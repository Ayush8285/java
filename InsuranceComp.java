import java.util.Scanner;

public class InsuranceComp {
    
    void Insurance(String name,String gender,int age,String city){
        if((age >= 25 && age <= 35) && (gender == "male" ) && (city == "metro")){
            System.out.println("Premium is 6%");
        }else if((age >= 25 && age <= 40) && (gender == "male") && (city == "non-metro")){
            System.out.println("Premium is 4%");
        }else if((age >= 25 && age <= 42) && (gender == "female") && (city == "metro")){
            System.out.println("Premium is 3%");
        }else if((age >= 25 && age <= 45) && (gender == "female") && (city == "non-metro")){
            System.out.println("Premium is 2%");
        }else{
            System.out.println("Not Insured");
        }

    }




    public static void main(String[] args) {
        InsuranceComp ic = new InsuranceComp();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your gender");
        String gender = s.nextLine().trim().toLowerCase();
        System.out.println("Enter your age");
        int age = s.nextInt();
        System.out.println("Enter your city");
        String city = s.nextLine().trim().toLowerCase();
        ic.Insurance(name,gender,age,city);


        s.close();
    }
}
