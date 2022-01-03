package TestCases;



import Constant.Constant;
import PageObject.Railway.HomePage;
import PageObject.Railway.LoginPage;
import PageObject.Railway.TicketPricePage;
import PageObject.Railway.TimeTablePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends TestBase {
    @Test(description = "'Ticket price' page displays with ticket details after clicking on 'check price' link in 'Train timetable' page")
    public void TC15() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        TimeTablePage timetablePage = new TimeTablePage();
        TicketPricePage ticketPricePage = new TicketPricePage();

        System.out.println("Pre-condition: Create and activate a new account");
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with a valid account ");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on 'Timetable' tab");
        homePage.gotoTimetable();

        System.out.println("4. Click on 'check price' link of the route from 'Đà Nẵng' to 'Sài Gòn'");
        timetablePage.getTicketCheckPrice();

        Assert.assertEquals(ticketPricePage.getTicketPricePageTitle(),"Ticket Price");

        Assert.assertEquals(ticketPricePage.getTicketTableName(),"Ticket price from Đà Nẵng to Sài Gòn");
    }
}
