import java.util.Scanner;

public class WeekWeekendCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the week (like monday so on..) ");
        String week = s.next().trim().toLowerCase();

        switch(week){
            case "monday": case "tuesday" : case "wednesday": case "thrusday": case "friday": 
                System.out.println("this is your week day");
                break;
            case "saturday": case "sunday":
                System.out.println("this is your weekend day...Have fun!!!!!");
                break;
            default:
                System.out.println("enter valid week");
                break;
        }
        s.close();
        
    }
}
