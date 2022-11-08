
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static boolean snt(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean fibonacci(int number) {
        if (number < 0) {
            return false;
        } else if (number < 2) {
            return true;
        } else {
            int number1, number2, number3;
            number1 = 0;
            number2 = 1;
            do {
                number3 = number1 + number2;
                if (number3 == number) {
                    return true;
                } else {
                    number1 = number2;
                    number2 = number3;
                }
            } while (number3 < number);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kì: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (snt(i) && fibonacci(i)) {
                array[count] = i;
                count++;
            }
        }
        int[] array2 = new int[count];
        if (array2.length >= 0) System.arraycopy(array, 0, array2, 0, array2.length);
        System.out.println(Arrays.toString(array2));
    }
}
