import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.TicketPage;

public class CreateNewIssue {
    HomePage homePage = null;
    LoginPage loginPage = null;
    TicketPage ticketPage = null;
    CreateNewTicketWindow createNewTicketWindow = null;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        ticketPage = new TicketPage(driver);
        createNewTicketWindow = new CreateNewTicketWindow(driver);
        homePage.navigateTo();
        loginPage.enterUserName("DianaSurovtseva");
        loginPage.setUserPassInput("DianaSurovtseva");
        loginPage.clickLogBut();
    }


}
