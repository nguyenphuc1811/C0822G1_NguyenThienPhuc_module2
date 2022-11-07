package case_study.model.person;

public class Customer extends Person {
    private String typeOfCustomer;
    private String adress;
    public static final String DIAMOND = "Diamond";
    public static final String PLATINIUM = "Platinium";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String MEMBER = "Member";

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Customer(String id, String name, String date, String gender, String idCard, String phoneNumber, String email, String typeOfCustomer, String adress) {
        super(id, name, date, gender, idCard, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
