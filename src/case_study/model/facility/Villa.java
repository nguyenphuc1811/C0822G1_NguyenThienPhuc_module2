package case_study.model.facility;

public class Villa extends Facility{
    String standardRoom;
    double poolArea;
    int floor;

    public Villa(String standardRoom, double poolArea, int floor) {
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
}
