package case_study.sevices.sevices_class;

import case_study.model.person.Customer;
import case_study.sevices.CustomerService;
import case_study.sevices.util.CustomerInput;
import case_study.sevices.util.FileReadWrite;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private final String PATH = "src\\case_study\\model\\data_customer.csv";

    Scanner scanner = new Scanner(System.in);

    public void add() throws IOException {
        List<Customer> customers = new LinkedList<>();
        CustomerInput customerInput = new CustomerInput();
        customers.add(customerInput.addCustomer());
        FileReadWrite.writerFile(customers, PATH, true);
    }

    public void edit() throws IOException {
        System.out.println("Nhập id để sửa thông tin");
        String id = scanner.nextLine();
        List<Customer> customerList = FileReadWrite.readFile(PATH);
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                int selection;
                System.out.println("1. Tên\n" +
                        "2. Ngày sinh\n" +
                        "3. giới tính\n" +
                        "4. CMND\n" +
                        "5. Số điện thoại\n" +
                        "6. Email\n" +
                        "7. Loại khách\n" +
                        "8. Địa chỉ\n" +
                        "9. Back to menu");
                do {
                    System.out.println(customer.toString() +
                            "\nNhập thông tin muốn đổi: ");
                    selection = Integer.parseInt(scanner.nextLine());
                    switch (selection) {
                        case 1:
                            System.out.print("Tên mới: ");
                            customer.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Ngày sinh mới: ");
                            customer.setDate(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Giới tính: ");
                            customer.setGender(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("CMND: ");
                            customer.setIdCard(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("Số điện thoại: ");
                            customer.setPhoneNumber(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("Email: ");
                            customer.setEmail(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("Loại khách");
                            customer.setTypeOfCustomer(scanner.nextLine());
                            break;
                        case 8:
                            System.out.println("Địa chủ: ");
                            customer.setAdress(scanner.nextLine());
                            break;
                        case 9:
                            return;
                        default:
                            System.out.println("Nhập lại từ 1-9");
                    }
                } while (true);
            }
            FileReadWrite.writerFile(customerList, PATH, false);
        }
        System.out.println("Id nhập không tồn tại");
    }

    public void display() throws IOException {
        for (Customer customer : FileReadWrite.readFile(PATH)) {
            System.out.println(customer);
        }
    }
}
