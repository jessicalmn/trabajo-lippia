package lippia.web.constants;

public class LoginConstants {

    public static final String INICIA_LA_SESION = "xpath:(//a[contains(.,'Inicia la sesión')])[2]";
    public static final String LOGIN_MANUALLY = "xpath://A[@data-test-id='login-manual']";
    public static final String EMAIL_IMPUT = "xpath://*[@id='email']";
    public static final String PASSWORD_IMPUT = "xpath://input[@id='password']";
    public static final String LOGIN_BUTTON = "xpath://button[contains(.,'Log In')]";
    public static final String CONTINUE_WHITH_EMAIL = "xpath://BUTTON[@data-test-id='login-button'][text()=' Continue with email ']";
    public static final String EMAIL_NOT_VALID ="xpath://SPAN[@data-test-id='invalid-email']";
    public static final String CODE_NOT_VALID = "xpath://SPAN[@class='ng-star-inserted']";
    public static final String FORGOT_PASSWORD = "xpath://a[contains(.,'Forgot password?')]";
    public static final String RESET_PASSWORD_BUTTON = "xpath://button[@type='submit'][contains(.,'Reset password')]";
    public static final String MENSAJE_RESET_PASSWORD = "xpath://div[contains(@aria-label,'If account exists an email with instructions to reset your password will be sent. ')]";


    public static final String VERIFICATION_CODE_1 = "xpath:(//input[@type='text'])[1]";
    public static final String VERIFICATION_CODE_2 = "xpath:(//input[@type='text'])[2]";
    public static final String VERIFICATION_CODE_3 = "xpath:(//input[@type='text'])[3]";
    public static final String VERIFICATION_CODE_4 = "xpath:(//input[@type='text'])[4]";
    public static final String VERIFICATION_CODE_5 = "xpath:(//input[@type='text'])[5]";
    public static final String VERIFICATION_CODE_6 = "xpath:(//input[@type='text'])[6]";
}
