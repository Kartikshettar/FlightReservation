package FlightBooking;

import java.util.List;
import java.util.Scanner;

public class Passenger {

public static void main(String[] args)
{
    String name,Email,Street,City,State;
    long PNo;


    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Contact Details  ");
    System.out.println("Name");
    name = sc2.next();
    System.out.println("Email address");
    Email =sc2.next();
    System.out.println("Phone number");
    PNo = sc2.nextLong();
    System.out.println("Address");
    System.out.println("STREET");
    Street = sc.next();
    System.out.println("CITY");
    City = sc.next();
    System.out.println("STATE");
    State = sc.next();
    System.out.println("The following flight has been created: ");
    Address A = new Address(Street,City,State);
    System.out.println(A);
   


    }


}





