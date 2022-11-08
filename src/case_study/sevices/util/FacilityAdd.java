package case_study.sevices.util;

import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.Scanner;

public final class FacilityAdd {
    public FacilityAdd() {
    }

    public Room addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.print("Diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("Giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng người tối đa: ");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu dịch vụ: ");
        String type = scanner.nextLine();
        System.out.println("Dịch vụ bonus: ");
        String sevicesBonus = scanner.nextLine();
        return new Room(serviceName, area, price, maxPerson, type, sevicesBonus);
    }

    public Villa addVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.print("Diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("Giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng người tối đa: ");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu dịch vụ: ");
        String type = scanner.nextLine();
        System.out.print("Loại phòng: ");
        String standardRoom = scanner.nextLine();
        System.out.print("Diện tích bể bơi: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        return new Villa(serviceName, area, price, maxPerson, type, standardRoom, poolArea, floor);
    }
}
