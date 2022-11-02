package case_study.model.person;

public class Customer extends Person {
    private String typeOfCustomer;
    private String adress;
    private final String DIAMOND = "Diamond";
    private final String PLATINIUM = "Platinium";
    private final String GOLD = "Gold";
    private final String SILVER = "Silver";
    private final String MEMBER = "Member";

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

    public Customer(String name, String date, String gender, String idCard, String phoneNumber, String email) {
        super(name, date, gender, idCard, phoneNumber, email);
    }

    public void booking() {
    }
}
