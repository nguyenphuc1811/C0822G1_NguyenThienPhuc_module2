package case_study.controller;

import case_study.sevices.sevices_class.BookingServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class BookingManagement {
    public static void display() throws IOException {
        int selection;
        Scanner scanner = new Scanner(System.in);
        BookingServiceImpl bookingService = new BookingServiceImpl();
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu");
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection){
                case 1:
                    bookingService.booking();
                    return;
                case 2:
                case 3:
                default:
            }
        } while (true);
    }
}
