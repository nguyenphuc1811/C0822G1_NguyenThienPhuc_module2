package ss15_eception_debug.exercise.illegalTriangleException;

import java.util.Scanner;

public class ExceptionTriangle {
    public static void main(String[] args) {
        do {
            double x, y, z;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập cạnh x: ");
                x = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh y: ");
                y = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh z: ");
                z = Double.parseDouble(scanner.nextLine());
                triangleCheck(x, y, z);
                if (x + y >= z || z + y >= x || z + x >= y) {
                    break;
                }
            } catch (EceptionThrows e) {
                System.out.println("Exception: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Exception: " + "Vui Lòng Nhập Số");
            }
        } while (true);
    }

    public static void triangleCheck(double x, double y, double z) throws EceptionThrows {
        if (x <= 0 || z <= 0 || y <= 0) {
            throw new EceptionThrows("Cạnh bạn yêu cầu nhập ko hợp lệ, cạnh lớn hơn 0 hãy nhập lại");
        } else if (z >= y + x || y >= x + z || x >= y + z) {
            throw new EceptionThrows("Tổng 2 cạnh nhỏ hơn cạnh còn lại hãy nhập lại");
        } else {
            System.out.println("Tam giác có cạnh x = " + x);
            System.out.println("Tam giác có cạnh y = " + y);
            System.out.println("Tam giác có cạnh z = " + z);
        }
    }
}
