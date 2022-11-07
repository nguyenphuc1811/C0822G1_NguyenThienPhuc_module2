package case_study.sevices.sevices_class;

import case_study.model.person.Employee;
import case_study.sevices.EmployeeService;
import case_study.sevices.util.InputEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("1", "A", "1/11/1999", "Nữ", "085748291", "096545256", "alo@123.com", Employee.INTERMEDIATE, Employee.RECEPTIONIST, 2000000.0);
        Employee employee2 = new Employee("2", "B", "5/6/1997", "Nam", "975637284", "086553648", "alo@456.com", Employee.COLLEGE, Employee.SUPERVISOR, 3000000.0);
        Employee employee3 = new Employee("3", "C", "7/8/1995", "Nam", "949384835", "039954226", "alo@789.com", Employee.UNIVERSITY, Employee.MANAGER, 4000000.0);
        Employee employee4 = new Employee("4", "D", "9/10/1990", "Nam", "098247238", "036556336", "alo@101112.com", Employee.AFTER_UNIVERSITY, Employee.PRESIDENT, 5000000.0);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }

    @Override
    public void add() {
        InputEmployee inputEmployee = new InputEmployee();
        employeeList.add(inputEmployee.addEmployee());
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id để sửa thông tin");
        String id = scanner.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                int selection;

                System.out.println("1. Tên\n" +
                        "2. Ngày sinh\n" +
                        "3. giới tính\n" +
                        "4. CMND\n" +
                        "5. Số điện thoại\n" +
                        "6. Email\n" +
                        "7. Trình độ\n" +
                        "8. Vị trí\n" +
                        "9. Lương\n" +
                        "10. Back to menu\n");
                do {
                    System.out.println(employee.toString() +
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
                            return;
                        default:
                            System.out.println("Nhập lại từ 1-10");
                    }
                } while (true);
            }
        }
        System.out.println("Id nhập không tồn tại");
    }

    @Override
    public void delete() {
        System.out.print("Nhập Id để xóa thông tin: ");
        String idcard = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (idcard.equals(employeeList.get(i).getId())) {
                employeeList.remove(i);
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Id không tồn tại");
    }
}
