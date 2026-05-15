import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})*$";
    private static final String MOBILE_PATTERN = "^[0-9]{1,3}\\s[0-9]{10}$";

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

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String fName = scanner.next();
        System.out.println("Valid: " + validator.validateFirstName(fName));
        System.out.println("\nEnter Last Name:");
        String lName = scanner.next();
        System.out.println("Valid: " + validator.validateLastName(lName));
        System.out.println("\nEnter Email:");
        String email = scanner.next();
        System.out.println("Valid: " + validator.validateEmail(email));
        System.out.println("\nEnter Mobile Number (e.g., 91 9919819801):");
        
        scanner.nextLine();
        String mobile = scanner.nextLine(); 
        
        if (validator.validateMobile(mobile)) {
            System.out.println("Valid Mobile Number.");
        } else {
            System.out.println("Invalid Mobile format. Ensure country code, space, and 10 digits.");
        }
        
        scanner.close();
    }
}