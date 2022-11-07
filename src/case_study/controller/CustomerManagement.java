package case_study.controller;

import case_study.sevices.CustomerService;
import case_study.sevices.sevices_class.CustomerServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class CustomerManagement {
    public static void display() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int selection;
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu");
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    customerService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 2:
                    customerService.add();
                    customerService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 3:
                    customerService.edit();
                    customerService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhap lai tu 1 - 5");
            }
        } while (true);
    }
}
