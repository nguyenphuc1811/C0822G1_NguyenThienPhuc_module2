package case_study.sevices;

import case_study.controller.FuramaController;

import java.util.Scanner;

public class EmployeeManagement {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        System.out.println("1. \t	Display list employees\n" +
                "2. \t	Add new employee\n" +
                "3	\tDelete employee\n" +
                "4 \t	Edit employee\n" +
                "5 \t	Return main menu"
        );
        do {
            selection = Integer.parseInt(scanner.nextLine());
            if (selection == 5) {
                FuramaController.display();
            } else if (selection > 5 || selection < 1) {
                System.out.println("nhap lai tu 1 - 5");
                break;
            }
        } while (selection > 5 || selection < 1);
    }
}
