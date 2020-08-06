import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TicketPage;


public class ViewTicketTest {

    HomePage homePage = null;
    LoginPage loginPage = null;
    TicketPage ticketPage = null;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        ticketPage = new TicketPage();
        Configuration.browser = "firefox";
        loginPage.navigateTo();
        loginPage.enterUserName();
        loginPage.setUserPassInput();
        loginPage.clickLogBut();
    }

    @Test
    public void viewTicket() {
        homePage.userIconIsDisplayed();
        homePage.clickViewIssue();
       ticketPage.sumIsPresent();
       ticketPage.urlContains("WEBINAR-11962");
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}