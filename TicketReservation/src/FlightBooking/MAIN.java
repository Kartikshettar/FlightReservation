package FlightBooking;

import java.util.Scanner;

public class MAIN
{
    public static void main(String[] args)
    {
        int flightNumber;
         String origin;
         String destination;
         String departureTime;
         double Price;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter flight Number");
        flightNumber = sc.nextInt();
        System.out.println("Enter flight origin");
        origin = sc2.nextLine();
        System.out.println("Enter flight destination");
        destination = sc2.nextLine();
        System.out.println("Enter flight departure time and date");
        departureTime = sc2.nextLine();
        System.out.println("Enter original price of ticket");
        Price = sc3.nextDouble();
        Flight F = new Flight(flightNumber, origin, destination,departureTime,Price);
        System.out.println("The following flight has been created:");
        System.out.println(F);

        F.setCapacity(400);
        System.out.println(F.getCapacity());
    }

}
