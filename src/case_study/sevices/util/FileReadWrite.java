package case_study.sevices.util;

import case_study.model.person.Customer;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {
    public static void  writerFile(List<Customer> listCustomer, String path,Boolean mode) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file,mode);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : listCustomer) {
            bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDate() + "," + customer.getGender() + "," + customer.getIdCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getTypeOfCustomer() + "," + customer.getAdress());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
    public static List<Customer> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        List<Customer> customerList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            String[] list = line.split(",");
            customerList.add(new Customer(list[0],list[1],list[2],list[3],list[4],list[5],list[6],list[7],list[8]));
        }
        return customerList;
    }
    
}
