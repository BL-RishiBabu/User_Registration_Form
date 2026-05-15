public class UserRegistrationRunner {
    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();

        test("First Name Happy Case (Amit)", validator.validateFirstName("Amit"), true);
        test("First Name Sad Case (Am)", validator.validateFirstName("Am"), false);

        test("Last Name Happy Case (Sharma)", validator.validateLastName("Sharma"), true);
        test("Last Name Sad Case (sharma)", validator.validateLastName("sharma"), false);

        test("Email Happy Case (abc.xyz@bl.co.in)", validator.validateEmail("abc.xyz@bl.co.in"), true);
        test("Email Sad Case (abc@.com)", validator.validateEmail("abc@.com"), false);

        test("Mobile Happy Case (91 9919819801)", validator.validateMobile("91 9919819801"), true);
        test("Mobile Sad Case (919919819801)", validator.validateMobile("919919819801"), false);

        test("Password Happy Case (Pass123@)", validator.validatePassword("Pass123@"), true);
        test("Password Sad Case (Pass123@@)", validator.validatePassword("Pass123@@"), false);
    }

    public static void test(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println("[PASS] " + testName);
        } else {
            System.out.println("[FAIL] " + testName + " | Expected: " + expected + ", but got: " + actual);
        }
    }
}