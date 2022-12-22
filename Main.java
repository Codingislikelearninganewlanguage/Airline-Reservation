import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Enter place of residence");
        var residence  = Userinput.nextLine();
        System.out.println("Enter arrival place");
        var arrival = Userinput.nextLine();
        System.out.println("Enter time please");
        var time = Userinput.nextLine();
        String[] trips = {"Ankara","London"};
        String[] residenceplaces = {"London","Ankara"};
        String[] flighttime = {"6:30am","7:30pm","1:30pm","9:00am"};
        String[] flightnumbers = {"7203","8203","9302","10230","3920","2930"};
        boolean tripAvablialty;
        boolean residenceAvablitity;
        boolean flighttimeavablity;
        tripAvablialty = Arrays.stream(trips).anyMatch(arrival::equals);
        residenceAvablitity = Arrays.stream(residenceplaces).anyMatch(residence::equals);
        flighttimeavablity = Arrays.stream(flighttime).anyMatch(time::equals);
        if(tripAvablialty == false || residenceAvablitity == false || flighttimeavablity == false){
            System.out.println("There are no flights going there or Flights dont go at that time");
        }
        else{
            System.out.println("Found flights for " + arrival);
            System.out.println("Departing from " + residence);
            System.out.println("What class are you gonna board");
            var classboarding = Userinput.nextLine();
            System.out.println("Confrimation Type 1 For Yes Type 2 for No You are gonna be boarding a flight from " + residence  + " to " + arrival + " in " + classboarding);
            var confromation = Userinput.nextInt();
            if(confromation == 1){
                System.out.println("Sucess Your flight has been scheduled");
            }
            else{
                System.out.println("Faliure Action canceled by User");
            }
        }

    }
}
