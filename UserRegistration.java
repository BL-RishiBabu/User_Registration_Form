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
        
        String[] emailSamples = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
        };

        System.out.println("--- UC 9: Validating Email Samples ---");
        for (String sample : emailSamples) {
            System.out.println("Sample: " + sample + " -> " + (validator.validateEmail(sample) ? "VALID" : "INVALID"));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Final User Entry Test ---");
        System.out.println("Enter Email to test:");
        String userEmail = scanner.next();
        
        if (validator.validateEmail(userEmail)) {
            System.out.println("Email Accepted.");
        } else {
            System.out.println("Email Rejected.");
        }
        
        scanner.close();
    }
}