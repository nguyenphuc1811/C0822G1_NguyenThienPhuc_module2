package ss19_string_regex.exercise.validate_name_class;


public class NameExample {
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public NameExample() {
    }

    public boolean validate(String regex) {
        return regex.matches(NAME_REGEX);
    }
}
