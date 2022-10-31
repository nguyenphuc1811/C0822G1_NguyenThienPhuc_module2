package ss19_string_regex.exercise.validate_name_class;

public class NameExampleTest {
    public static String[] str = new String[]{"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        NameExample nameExample = new NameExample();
        for (String string : str) {
            boolean isvalid = nameExample.validate(string);
            System.out.println("Nameclass is " + string + " is valid: " + isvalid);
        }
    }
}
