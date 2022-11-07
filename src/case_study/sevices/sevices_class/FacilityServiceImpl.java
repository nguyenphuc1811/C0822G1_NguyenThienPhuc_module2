package case_study.sevices.sevices_class;

import case_study.model.facility.Facility;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.sevices.FacilityService;
import case_study.sevices.util.AddFacility;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Set<Map.Entry<Facility, Integer>> entrySet = facilityIntegerMap.entrySet();

    static {
        Facility room1 = new Room("Room1", 100, 100, 4, "Luxury", "Minibar");
        Facility room2 = new Room("Room2", 50, 50, 2, "Normal", "Minibar");
        Facility villa = new Villa("Villa1", 50, 100, 2, "Normal", "Normal", 10, 1);
        facilityIntegerMap.put(room1, 2);
        facilityIntegerMap.put(room2, 0);
        facilityIntegerMap.put(villa, 5);
    }

    @Override
    public void display() {
        for (Map.Entry entry : entrySet) {
            System.out.println(entry);
        }
    }

    @Override
    public void add() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New Room\n" +
                "3.\tBack to menu\n");
        Scanner scanner = new Scanner(System.in);
        AddFacility addFacility = new AddFacility();
        do {
            int selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    facilityIntegerMap.put(addFacility.addVilla(), 0);
                    display();
                    return;
                case 2:
                    facilityIntegerMap.put(addFacility.addRoom(), 0);
                    display();
                    return;
                case 3:
                    return;
                default:
                    System.out.println("Enter your choice 1-3");
            }
        } while (true);
    }

    public void maintenanceFacility() {
        for (Map.Entry entry : entrySet) {
            if (entry.getValue().equals(5)) {
                System.out.println(entry);
            }
        }
    }
}
