import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})*$";
    private static final String MOBILE_PATTERN = "^[0-9]{1,3}\\s[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

    private static final UserValidator firstNameValidator = input -> {
        if (Pattern.matches(NAME_PATTERN, input)) {
            return true;
        }
        throw new InvalidUserDetailException("Invalid First Name");
    };

    private static final UserValidator lastNameValidator = input -> {
        if (Pattern.matches(NAME_PATTERN, input)) {
            return true;
        }
        throw new InvalidUserDetailException("Invalid Last Name");
    };

    private static final UserValidator emailValidator = input -> {
        if (Pattern.matches(EMAIL_PATTERN, input)) {
            return true;
        }
        throw new InvalidUserDetailException("Invalid Email");
    };

    private static final UserValidator mobileValidator = input -> {
        if (Pattern.matches(MOBILE_PATTERN, input)) {
            return true;
        }
        throw new InvalidUserDetailException("Invalid Mobile Number");
    };

    private static final UserValidator passwordValidator = input -> {
        if (Pattern.matches(PASSWORD_PATTERN, input)) {
            return true;
        }
        throw new InvalidUserDetailException("Invalid Password");
    };

    public boolean validateFirstName(String firstName) throws InvalidUserDetailException {
        return firstNameValidator.validate(firstName);
    }

    public boolean validateLastName(String lastName) throws InvalidUserDetailException {
        return lastNameValidator.validate(lastName);
    }

    public boolean validateEmail(String email) throws InvalidUserDetailException {
        return emailValidator.validate(email);
    }

    public boolean validateMobile(String mobile) throws InvalidUserDetailException {
        return mobileValidator.validate(mobile);
    }

    public boolean validatePassword(String password) throws InvalidUserDetailException {
        return passwordValidator.validate(password);
    }

    @FunctionalInterface
    public interface UserValidator {
        boolean validate(String input) throws InvalidUserDetailException;
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
            try {
                validator.validateEmail(sample);
                System.out.println("Sample: " + sample + " -> VALID");
            } catch (InvalidUserDetailException e) {
                System.out.println("Sample: " + sample + " -> INVALID");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Final User Entry Test ---");
        System.out.println("Enter Email to test:");
        String userEmail = scanner.next();
        
        try {
            validator.validateEmail(userEmail);
            System.out.println("Email Accepted.");
        } catch (InvalidUserDetailException e) {
            System.out.println("Email Rejected. " + e.getMessage());
        }
        
        scanner.close();
    }
}
