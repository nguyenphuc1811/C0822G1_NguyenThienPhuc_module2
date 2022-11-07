package case_study.model.facility;

public class Villa extends Facility {
    String standardRoom;
    double poolArea;
    int floor;

    public Villa() {
    }

    public Villa(String serviceName, double area, double price, int maxPerson, String type, String standardRoom, double poolArea, int floor) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxPerson = maxPerson;
        this.type = type;
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPerson=" + maxPerson +
                ", type='" + type + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
