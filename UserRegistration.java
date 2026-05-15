import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})*$";
    private static final String MOBILE_PATTERN = "^[0-9]{1,3}\\s[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_PATTERN, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_PATTERN, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public boolean validateMobile(String mobile) {
        return Pattern.matches(MOBILE_PATTERN, mobile);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Password (8+ chars, 1+ Upper, 1+ Num, Exactly 1 Special):");
        String password = scanner.next();
        
        if (validator.validatePassword(password)) {
            System.out.println("Password Valid: All Rules Passed.");
        } else {
            System.out.println("Invalid Password. Requirement: 8+ chars, 1+ Upper Case, 1+ Numeric, and EXACTLY 1 special character.");
        }
        
        scanner.close();
    }
}