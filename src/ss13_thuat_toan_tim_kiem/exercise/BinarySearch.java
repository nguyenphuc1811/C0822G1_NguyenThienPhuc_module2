package ss13_thuat_toan_tim_kiem.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean findNumber(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                return true;
            }
            if (k > arr[mid]) {
                return findNumber(arr, k, mid + 1, right);
            }
            return findNumber(arr, k, left, mid - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng hiện tại là");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần tìm");
        int number = Integer.parseInt(scanner.nextLine());
        if (findNumber(array, number, 0, array.length)) {
            System.out.println("có " + number + " trong mảng");
        } else {
            System.out.println("khong có " + number + " trong mảng");
        }
    }

}
