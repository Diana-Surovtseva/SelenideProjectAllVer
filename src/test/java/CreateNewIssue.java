import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateNewTicketWindow;
import pages.HomePage;
import pages.LoginPage;
import pages.TicketPage;
import static org.testng.Assert.assertTrue;

public class CreateNewIssue {
    HomePage homePage = null;
    LoginPage loginPage = null;
    TicketPage ticketPage = null;
    CreateNewTicketWindow createNewTicketWindow = null;


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
        createNewTicketWindow = new CreateNewTicketWindow();
    }

    @Test
    public void createTicket() {
        homePage.isButtonCreateLinkPresent();

        homePage.clickCreateIssue();
        createNewTicketWindow.isProjectFieldDisplayed();
        createNewTicketWindow.clearProjectField();
        createNewTicketWindow.inputProjectField();
        createNewTicketWindow.pressTabAfterProjectField();

        createNewTicketWindow.isIssueTypeFieldDisplayed();
        createNewTicketWindow.clearIssueTypeField();
        createNewTicketWindow.enterIssueTypeField();
        createNewTicketWindow.pressTabAfterIssueTypeField();
        createNewTicketWindow.isSummaryFieldDisplayed();
        createNewTicketWindow.enterSummary();
        createNewTicketWindow.clearReporterField();
        createNewTicketWindow.enterReporterField();

        createNewTicketWindow.pressCreateIssueButton();
//Происходит ли проверка?
        assertTrue(createNewTicketWindow.isPopUpPresent());

    assertTrue(createNewTicketWindow.getPopUpText().contains("WEBINAR"));

    }
}
