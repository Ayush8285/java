import java.util.Scanner;

public class SeasonDetermine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month ");
        String month = s.next().trim().toLowerCase();
        switch(month){

            case "october": case "november": case "december": case " january": case "february":
                System.out.println("this is winter season");
                break;
            case "may": case "june": case "july":
                System.out.println("this is summer month");
                break;
            case "march": case "april":
                System.out.println("this is fall season");
                break;
            case "august": case "september":
                System.out.println("this is spring season");
                break;
            default:
                System.out.println("enter valid month");
                break;
        }
        s.close();
    }
}
