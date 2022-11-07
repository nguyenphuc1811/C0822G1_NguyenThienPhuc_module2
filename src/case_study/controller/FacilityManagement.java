package case_study.controller;

import case_study.sevices.sevices_class.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    private static final FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static void display() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu");
        do {
            System.out.println("Enter your choice: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    facilityService.display();
                    return;
                case 2:
                    facilityService.add();
                    return;
                case 3:
                   facilityService.maintenanceFacility();
                    return;
                case 4:
                    return;
                default:
                    System.out.println("Enter your your choice 1-4");
            }
        } while (true);
    }
}
