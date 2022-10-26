package ss16_io_text_file.practice.find_max;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadingAndWrittingFile readAndWriteFile = new ReadingAndWrittingFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\ss16_io_text_file\\practice\\find_max\\input.txt");
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_io_text_file\\practice\\find_max\\result.txt", maxValue);
    }
}
