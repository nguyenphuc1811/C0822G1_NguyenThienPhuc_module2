package ss19_string_regex.exercise.validate_phone_number;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)[-]\\(0\\d{9}\\)$";

    public static boolean  validate(String regex) {
        return regex.matches(PHONE_NUMBER_REGEX);
    }
}
