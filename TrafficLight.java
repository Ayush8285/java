import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the light for further info.(Red,yellow,green)");
        String a = s.next().trim().toLowerCase();
        switch(a){
            case"red" :
                System.out.println("you have to stop");
                break;
            case"yellow" :
                System.out.println("you have to wait for only 10 second more");
                break;
            case"green" :
                System.out.println("you have to free to go!!");
                break;
            default:
                System.out.println("you enter the wrong traffic light color");
                break;
        }
        s.close();
    }
}
