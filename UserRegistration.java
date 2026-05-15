import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})*$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_PATTERN, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_PATTERN, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String fName = scanner.next();
        System.out.println("First Name Valid: " + validator.validateFirstName(fName));

        System.out.println("\nEnter Last Name:");
        String lName = scanner.next();
        System.out.println("Last Name Valid: " + validator.validateLastName(lName));

        System.out.println("\nEnter Email (e.g., abc.xyz@bl.co.in):");
        String email = scanner.next();
        
        if (validator.validateEmail(email)) {
            System.out.println("Valid Email.");
        } else {
            System.out.println("Invalid Email format.");
        }
        
        scanner.close();
    }
}