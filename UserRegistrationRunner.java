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

    @Test
    public void firstName_Sad() {
        assertFalse(validator.validateFirstName("Am"));
    }

    @Test
    public void lastName_Happy() {
        assertTrue(validator.validateLastName("Sharma"));
    }

    private void assertTrue(boolean validateLastName) {
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    public void lastName_Sad() {
        assertFalse(validator.validateLastName("sharma"));
    }

    private void assertFalse(boolean validateLastName) {
        throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "abc@yahoo.com",
        "abc-100@yahoo.com",
        "abc.100@yahoo.com",
        "abc111@abc.com",
        "abc-100@abc.net",
        "abc.100@abc.com.au",
        "abc@1.com",
        "abc@gmail.com.com",
        "abc+100@gmail.com"
    })
    public void email_Valid_Multiple(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "abc",
        "abc@.com",
        "abc@.com.com",
        ".abc@abc.com",
        "abc()*@gmail.com",
        "abc@%*.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.1a"
    })
    public void email_Invalid_Multiple(String email) {
        assertFalse(validator.validateEmail(email));
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