package FlightBooking;


public class Passenger {
    private Address address;
    private Contact contact;
    //Address Attributes
    private  String Street;
    private String City;
    private String State;

    //Contact Attributes
    private   long PhoneNumber;
    private String name;
    private  String Email;

    private static int IdCounter;

    Passenger(int IdCounter ,Address address,Contact contact)
    {
        IdCounter++;

    }

    private static class Address
        //(String Street, String City, String State)
    {


    }
    private static class Contact
            //(String name, String email, long pNo)
    {

    }

    int getPassengerCount()
    {
        return IdCounter;

    }
}





