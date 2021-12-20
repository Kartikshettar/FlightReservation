package FlightBooking;

public class Contact {
  private   long PhoneNumber;
    private String name;
    private  String Email;

    public Contact(String name, String email, long pNo) {
        this.name=name;
        this.PhoneNumber=pNo;
        this.Email=Email;
    }
    @Override
    public String toString() {
        String one ="NAME "+name;
        String two = "PHONE NUMBER "+PhoneNumber;
        String three ="EMAIL ADDRESS "+Email;
        return one + two + three;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
