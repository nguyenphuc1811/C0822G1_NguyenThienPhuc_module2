package ss16_io_text_file.exercise.copy_file_text;

import java.io.*;

public class TextCopy {
    public static void main(String[] args) {
        try {
            File file = new File("src\\ss16_io_text_file\\exercise\\copy_file_text\\source_file.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            File file2 = new File("src\\ss16_io_text_file\\exercise\\copy_file_text\\target_file.txt");
            if (!file2.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split("");
                for (String s : array) {
                    if (!s.equals(" ")) {
                        count++;
                    }
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Số kí tự = " + count);
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
