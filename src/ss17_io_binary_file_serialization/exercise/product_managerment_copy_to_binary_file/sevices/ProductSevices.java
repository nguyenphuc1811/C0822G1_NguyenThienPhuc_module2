package ss17_io_binary_file_serialization.exercise.product_managerment_copy_to_binary_file.sevices;

import ss17_io_binary_file_serialization.exercise.product_managerment_copy_to_binary_file.model.Product;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductSevices {
    final static String FILE_PATH = "src\\ss17_io_binary_file_serialization\\exercise\\product_managerment_copy_to_binary_file\\info_product.dat";

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        int id = Product.products.size() + 1;
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Hãng: ");
        String brand = scanner.nextLine();
        System.out.print("Giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, brand, price);
        Product.products.add(product);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Product.products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayList() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Product.products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Product product : Product.products) {
            System.out.println(product);
        }
    }

    public void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id muốn tìm kiếm: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            boolean isExit = false;
            for (Product product : Product.products) {
                if (product.getId() == id) {
                    System.out.println(product);
                    isExit = true;
                }
            }
            if (!isExit) {
                System.out.println("Không tìm thấy sản phẩm!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
