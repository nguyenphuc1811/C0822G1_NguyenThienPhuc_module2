package case_study.sevices.util;

import case_study.model.person.Employee;

import java.util.Scanner;

public class EmployeeInput {
    public Employee addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Ngày Sinh: ");
        String date = scanner.nextLine();
        System.out.println("Giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("Số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Học vấn\n" +
                "1. Trung Cấp\n" +
                "2. Cao đẳng\n" +
                "3. Đại học\n" +
                "4. Sau đại học\n");
        String level = "";
        int selection;
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    level = Employee.INTERMEDIATE;
                    break;
                case 2:
                    level = Employee.COLLEGE;
                    break;
                case 3:
                    level = Employee.UNIVERSITY;
                    break;
                case 4:
                    level = Employee.AFTER_UNIVERSITY;
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        } while (selection > 4 || selection < 1);
        String stadard = "";

        System.out.println("Vị trí\n" +
                "1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lí\n" +
                "6. Giám đốc\n");
        int selection2;
        do {
            selection2 = Integer.parseInt(scanner.nextLine());
            switch (selection2) {
                case 1:
                    stadard = Employee.RECEPTIONIST;
                    break;
                case 2:
                    stadard = Employee.WAITER;
                    break;
                case 3:
                    stadard = Employee.EXPERT;
                    break;
                case 4:
                    stadard = Employee.SUPERVISOR;
                    break;
                case 5:
                    stadard = Employee.MANAGER;
                    break;
                case 6:
                    stadard = Employee.PRESIDENT;
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        } while (selection2 > 6 || selection2 < 1);
        System.out.println("Nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, date, gender, idCard, phoneNumber, email, level, stadard, salary);
        return employee;
    }
}
