package case_study.controller;

import case_study.controller.FuramaController;

import java.util.Scanner;

public class CustomerManagement {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu");
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
