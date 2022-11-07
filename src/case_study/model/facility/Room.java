package case_study.model.facility;

public class Room extends Facility {
    String seviceBonus;

    public Room() {
    }

    public String getSeviceBonus() {
        return seviceBonus;
    }

    public void setSeviceBonus(String seviceBonus) {
        this.seviceBonus = seviceBonus;
    }

    public Room(String serviceName, double area, double price, int maxPerson, String type, String seviceBonus) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxPerson = maxPerson;
        this.type = type;
        this.seviceBonus = seviceBonus;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPerson=" + maxPerson +
                ", type='" + type + '\'' +
                "seviceBonus='" + seviceBonus + '\'' +
                '}';
    }
}
