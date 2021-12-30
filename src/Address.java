/**
 *
 * Contains address info for a contact.
 *
 * @author YOUR NAME<br>
 *         Your EMAIL<br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Address {
    private String street;
    private String type; // OPTIONS = home, office, other
    private String city;
    private String state;
    private String zip;

    /// this file is POORLY documented. However, we wanted you to be able to read through it easier, as it provides
    /// examples for other files

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String render() {
        return String.format("%-7s %s%n", getType() +":", getStreet()) +     /// notice the -7 on this line!
               String.format("        %s, %s %s", getCity(), getState(), getZip());


    }


    public Address(String type, String street, String city, String state, String zip) {
        setStreet(street);
        setType(type);
        setCity(city);
        setState(state);
        setZip(zip);
    }

}
