public class UserRegistrationRunner {

    private UserRegistration validator;

    @BeforeEach
    public void setUp() {
        validator = new UserRegistration();
    }

    @Test
    public void firstName_Happy() throws UserRegistration.InvalidUserDetailException {
        assertTrue(validator.validateFirstName("Amit"));
    }

    private void assertTrue(boolean validateFirstName) {
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }
    
    @Test
    public void firstName_Sad() {
        assertThrows(UserRegistration.InvalidUserDetailException.class, () -> validator.validateFirstName("Am"));
    }

    private void assertThrows(Class<UserRegistration.InvalidUserDetailException> class1, Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }

    @Test
    public void lastName_Happy() throws UserRegistration.InvalidUserDetailException {
        assertTrue(validator.validateLastName("Sharma"));
    }

    @Test
    public void lastName_Sad() {
        assertThrows(UserRegistration.InvalidUserDetailException.class, () -> validator.validateLastName("sharma"));
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
    public void email_Valid_Multiple(String email) throws UserRegistration.InvalidUserDetailException {
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
        assertThrows(UserRegistration.InvalidUserDetailException.class, () -> validator.validateEmail(email));
    }

    @Test
    public void mobile_Happy() throws UserRegistration.InvalidUserDetailException {
        assertTrue(validator.validateMobile("91 9919819801"));
    }

    @Test
    public void mobile_Sad() {
        assertThrows(UserRegistration.InvalidUserDetailException.class, () -> validator.validateMobile("919919819801"));
    }

    private void assertThrows(Class<UserRegistration.InvalidUserDetailException> class1, Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }

    @Test
    public void password_Happy() throws UserRegistration.InvalidUserDetailException {
        assertTrue(validator.validatePassword("Pass123@"));
    }

    @Test
    public void password_Sad() {
        assertThrows(UserRegistration.InvalidUserDetailException.class, () -> validator.validatePassword("Pass123@@"));
    }

    private void assertThrows(Class<UserRegistration.InvalidUserDetailException> class1, Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }
}