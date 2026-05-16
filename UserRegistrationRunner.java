public class UserRegistrationRunner {

    private UserRegistration validator;

    @BeforeEach
    public void setUp() {
        validator = new UserRegistration();
    }

    @Test
    public void firstName_Happy() {
        assertTrue(validator.validateFirstName("Amit"));
    }

    private void assertTrue(boolean validateFirstName) {
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    public void firstName_Sad() {
        assertFalse(validator.validateFirstName("Am"));
    }

    private void assertFalse(boolean validateFirstName) {
        throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
    }

    @Test
    public void lastName_Happy() {
        assertTrue(validator.validateLastName("Sharma"));
    }

    @Test
    public void lastName_Sad() {
        assertFalse(validator.validateLastName("sharma"));
    }

    @Test
    public void email_Happy() {
        assertTrue(validator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void email_Sad() {
        assertFalse(validator.validateEmail("abc@.com"));
    }

    @Test
    public void mobile_Happy() {
        assertTrue(validator.validateMobile("91 9919819801"));
    }

    @Test
    public void mobile_Sad() {
        assertFalse(validator.validateMobile("919919819801"));
    }

    @Test
    public void password_Happy() {
        assertTrue(validator.validatePassword("Pass123@"));
    }

    @Test
    public void password_Sad() {
        assertFalse(validator.validatePassword("Pass123@@"));
    }
}