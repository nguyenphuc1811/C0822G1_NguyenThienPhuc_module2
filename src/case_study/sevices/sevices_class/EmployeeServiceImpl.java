package case_study.sevices.sevices_class;

import case_study.controller.EmployeeManagement;
import case_study.model.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("A", "1/11/1999", "Nữ", "085748291", "096545256", "alo@123.com", Employee.INTERMEDIATE, Employee.RECEPTIONIST, 2000000.0);
        Employee employee2 = new Employee("B", "5/6/1997", "Nam", "975637284", "086553648", "alo@456.com", Employee.COLLEGE, Employee.SUPERVISOR, 3000000.0);
        Employee employee3 = new Employee("C", "7/8/1995", "Nam", "949384835", "039954226", "alo@789.com", Employee.UNIVERSITY, Employee.MANAGER, 4000000.0);
        Employee employee4 = new Employee("D", "9/10/1990", "Nam", "098247238", "036556336", "alo@101112.com", Employee.AFTER_UNIVERSITY, Employee.PRESIDENT, 5000000.0);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }


    public void addEmployee() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Ngày Sinh");
        String date = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("CMND");
        String idCard = scanner.nextLine();
        System.out.println("Số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("Email");
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
        Employee employee = new Employee(name, date, gender, idCard, phoneNumber, email, level, stadard, salary);
        employeeList.add(employee);
    }

    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void edit() {
        System.out.println("Nhập CMND để sửa thông tin");
        String idcard = scanner.nextLine();
        boolean check = true;
        for (Employee employee : employeeList) {
            if (employee.getIdCard().equals(idcard)) {
                int selection;
                check = false;
                do {
                    System.out.print("1. Tên\n" +
                            "2. Ngày sinh\n" +
                            "3. giới tính\n" +
                            "4. CMND\n" +
                            "5. Số điện thoại\n" +
                            "6. Email\n" +
                            "7. Trình độ\n" +
                            "8. Vị trí\n" +
                            "9. Lương\n" +
                            "10. EXIT\n" +
                            employee.toString() +
                            "\nNhập thông tin muốn đổi: ");
                    selection = Integer.parseInt(scanner.nextLine());
                    switch (selection) {
                        case 1:
                            System.out.print("Tên mới: ");
                            employee.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Ngày sinh mới: ");
                            employee.setDate(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Giới tính: ");
                            employee.setGender(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("CMND: ");
                            employee.setIdCard(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("Số điện thoại: ");
                            employee.setPhoneNumber(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("Email: ");
                            employee.setEmail(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("Trình độ: ");
                            employee.setLevel(scanner.nextLine());
                            break;
                        case 8:
                            System.out.println("Vị trí: ");
                            employee.setStandard(scanner.nextLine());
                            break;
                        case 9:
                            System.out.println("Lương: ");
                            employee.setSalary(Double.parseDouble(scanner.nextLine()));
                            break;
                        case 10:
                            EmployeeManagement.display();
                            break;
                        default:
                            System.out.println("Nhập lại từ 1-10");
                    }
                } while (selection != 10);
                break;
            }
            if (check) {
                System.out.println("CMND nhập không tồn tại");
            }
        }
    }

    public void delete() {
        System.out.print("Nhập CMND để xóa thông tin: ");
        boolean check = true;
        String idcard = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (idcard.equals(employeeList.get(i).getIdCard())) {
                check = false;
                employeeList.remove(i);
                System.out.println("Xóa thành công");
                break;
            }
        }
        if (check) {
            System.out.println("CMND không tồn tại");
        }
    }
}
