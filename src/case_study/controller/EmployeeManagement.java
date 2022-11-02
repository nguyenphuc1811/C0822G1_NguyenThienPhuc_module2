package case_study.controller;

import case_study.sevices.sevices_class.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int selection;
        System.out.println("1. \t	Display list employees\n" +
                "2. \t	Add new employee\n" +
                "3	\tDelete employee\n" +
                "4 \t	Edit employee\n" +
                "5 \t	Return main menu"
        );
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    employeeService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 2:
                    employeeService.addEmployee();
                    employeeService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 3:
                    employeeService.delete();
                    employeeService.display();
                    scanner.nextLine();
                    FuramaController.display();
                    break;
                case 4:
                    employeeService.edit();
                    FuramaController.display();
                    break;
                case 5:
                    FuramaController.display();
                    break;
                default:
                    System.out.println("nhap lai tu 1 - 5");
            }
        } while (selection > 5 || selection < 1);
    }
}
