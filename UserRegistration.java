import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_PATTERN, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_PATTERN, lastName);
    }

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        System.out.println("First Name Valid: " + validator.validateFirstName(firstName));

        System.out.println("\nEnter Last Name:");
        String lastName = scanner.next();
        
        if (validator.validateLastName(lastName)) {
            System.out.println("Valid Last Name.");
        } else {
            System.out.println("Invalid Last Name. (Must start with Capital and have min 3 characters)");
        }
        
        scanner.close();
    }
}