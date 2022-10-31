package ss19_string_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập SDT: ");
        String string = scanner.nextLine();
        if(PhoneNumber.validate(string)){
            System.out.println("SDT hợp lệ: " + string);
        }else {
            System.out.println("SDT không hợp lệ");
        }
    }
}
