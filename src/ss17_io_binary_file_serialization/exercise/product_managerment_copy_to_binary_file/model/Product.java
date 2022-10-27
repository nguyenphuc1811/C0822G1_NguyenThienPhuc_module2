package ss17_io_binary_file_serialization.exercise.product_managerment_copy_to_binary_file.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String decriptions;

    public Product() {
    }

    public Product(int id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDecriptions() {
        return decriptions;
    }

    public void setDecriptions(String decriptions) {
        this.decriptions = decriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Iphone", "Apple", 400000));
        products.add(new Product(2, "Samsung7", "Samsung", 300000));
        products.add(new Product(3, "Xiaomi8", "China", 200000));
    }
}
