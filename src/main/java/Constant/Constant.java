package Constant;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Constant {
    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL = "http://www.railway.somee.com/Account/Login.cshtml";
    public static final String USERNAME = "trannguyen_kientrung@yahoo.com";
    public static final String PASSWORD = "trunganchao1998";
    public static final String INVALID_PASSWORD = PASSWORD+"zzz";
    public static final String INVALID_EMAIL = "12345@amail.com";

    static String getAlphaNumericString(int n)
    {
        int lowerLimit = 97;
        int upperLimit = 122;
        Random random = new Random();
        StringBuffer r = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }
    public static final String DEPART_DATE = "1/7/2022";
    public static final String DEPART_FROM = "Nha Trang";
    public static final String ARRIVE_AT = "Sài Gòn";
    public static final String SEAT_TYPE = "Soft seat with air conditioner";
    public static final String TICKET_AMOUNT = "5";

    public static final String REGISTER_RANDOM_EMAIL ()
    {
        int n = 10;
        return getAlphaNumericString(n)+"email.com";
    }
    public static final String REGISTER_PASSWORD = "123456789";
    public static final String REGISTER_CONFIRM_PASSWORD = "123456789";
    public static final String REGISTER_PID = "123456789";
}
