package case_study.sevices;

import case_study.controller.FuramaController;

import java.util.Scanner;

public class FacilityManagement {
    public static void display() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu");
        do {
            selection = Integer.parseInt(scanner.nextLine());
            if (selection == 4) {
                FuramaController.display();
            } else if (selection > 4 || selection < 1) {
                System.out.println("nhap lai tu 1 - 4");
            }
        } while (selection > 4 || selection < 1);
    }
}
