package case_study.sevices.util;

import case_study.model.person.Customer;
import java.util.Scanner;

public class InputCustomer {
    public Customer addCustomer(){
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
        System.out.println("Loại khách\n" +
                "1. Member\n" +
                "2. Silver\n" +
                "3. Gold\n" +
                "4. Platinium\n" +
                "5. Diamond");
        String typeOfCustomer = "";
        int selection;
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    typeOfCustomer = Customer.MEMBER;
                case 2:
                    typeOfCustomer = Customer.SILVER;
                    break;
                case 3:
                    typeOfCustomer = Customer.GOLD;
                    break;
                case 4:
                    typeOfCustomer = Customer.PLATINIUM;
                    break;
                case 5:
                    typeOfCustomer = Customer.DIAMOND;
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        } while (selection > 5 || selection < 1);
        System.out.print("Nhập Địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, date, gender, idCard, phoneNumber, email, typeOfCustomer,address);
        return customer;
    }
}
