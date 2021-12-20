package FlightBooking;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsleft;
    private double Price;

    public Flight(int flightNumber, String origin, String destination,String departureTime, double price)
    {
        this.flightNumber=flightNumber;
        this.origin=origin;
        this.destination=destination;
        this.departureTime=departureTime;
        this.Price=price;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {

        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsleft() {
        return numberOfSeatsleft;
    }

    public void setNumberOfSeatsleft(int numberOfSeatsleft) {
        this.numberOfSeatsleft = numberOfSeatsleft;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double originalPrice) {
        this.Price = originalPrice;
    }

    @Override
    public String toString() {
        String one = "Flight " + flightNumber;
        String two = "\n" + origin + " to " + destination;
        String three = "\n" + departureTime;
        String four = "\n original price: " + Price + "$";
        return one + two + three + four;
    }
}



