package case_study.controller;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void display() throws IOException {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tMenu\n" +
                "1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit"
        );
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    EmployeeManagement.display();
                    break;
                case 2:
                    CustomerManagement.display();
                    break;
                case 3:
                    FacilityManagement.display();
                    break;
                case 4:
                    BookingManagement.display();
                    break;
                case 5:
                    PromotionManagement.display();
                    break;
                case 6:
                    System.out.println("EXITED");
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhap lai tu 1 - 6");
            }
        } while (true);
    }
}
