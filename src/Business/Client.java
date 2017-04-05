package Business;

/**
 * Created by dandeac on 27/03/2017.
 */
public class Client {
    public int id;
    public String name;
    public int cardNumber;
    public int personalCode;
    public String address;
    public String email;

    public Client(int id, String name, int cardNumber, int personalCode, String address, String email) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.personalCode = personalCode;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
