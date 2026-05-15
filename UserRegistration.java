import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_PATTERN, firstName);
    }

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name (Starts with Cap, min 3 characters):");
        String input = scanner.next();

        if (validator.validateFirstName(input)) {
            System.out.println("Valid First Name.");
        } else {
            System.out.println("Invalid First Name. Please ensure it starts with a Capital and has at least 3 letters.");
        }
        
        scanner.close();
    }
}