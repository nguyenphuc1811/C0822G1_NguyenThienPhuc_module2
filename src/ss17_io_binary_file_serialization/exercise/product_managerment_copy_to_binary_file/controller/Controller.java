package ss17_io_binary_file_serialization.exercise.product_managerment_copy_to_binary_file.controller;

import ss17_io_binary_file_serialization.exercise.product_managerment_copy_to_binary_file.sevices.ProductSevices;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        ProductSevices sevices = new ProductSevices();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm sản phẩm\n" +
                    "2. Hiển thị sản phẩm đang có\n" +
                    "3. Tìm kiếm thông tin sản phẩm\n" +
                    "4. EXIT ");
            int selection = 0;
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                selection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (selection) {
                case 1:
                    sevices.addProduct();
                    sevices.displayList();
                    break;
                case 2:
                    sevices.displayList();
                    break;
                case 3:
                    sevices.findProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại từ 1 - 4");
            }
        } while (true);
    }
}
