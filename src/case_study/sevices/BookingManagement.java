package case_study.sevices;

import case_study.controller.FuramaController;

import java.util.Scanner;

public class BookingManagement {
    public static void display() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu");
        do {
            selection = Integer.parseInt(scanner.nextLine());
            if (selection == 3) {
                FuramaController.display();
            } else if (selection > 3 || selection < 1) {
                System.out.println("nhap lai tu 1 - 4");
            }
        } while (selection > 3 || selection < 1);
    }
}
