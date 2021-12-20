package FlightBooking;

public class Address
{
   private String Street;
    private String City;
    private String State;


    public Address(String Street,String City,String State){
        this.Street=Street;
        this.State=State;
        this.City=City;
    }
    @Override
    public String toString() {
        String one ="\nSTREET: " + Street;
        String two = "\nCITY: " + City;
        String three ="\nSTATE: " + State;
        return one + two + three;
    }
    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

}
