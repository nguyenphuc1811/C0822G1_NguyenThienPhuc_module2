package ss14_quiz_sort.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class QuizInsertSortExamble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " values:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Your input list: ");

        for (int value : array) {
            System.out.print(value + "\t");
        }
        InsertSort(array);
    }

    private static void InsertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
            System.out.println("mảng sau khi chèn phần tử i = " + (j + 1) + " là " + key + "\t " + Arrays.toString(array));
        }
        System.out.print("List after sort: " + Arrays.toString(array));
    }
}
