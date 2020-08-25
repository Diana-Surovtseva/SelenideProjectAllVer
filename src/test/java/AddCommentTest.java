import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TicketPage;


import static org.testng.Assert.assertTrue;

public class AddCommentTest {
    LoginPage loginPage = null;
    HomePage homePage = null;
    TicketPage ticketPage = null;


    @BeforeTest
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
    public void addCommentToTicket() {

        homePage.clickViewIssue();
        ticketPage.addComment();
        assertTrue(ticketPage.isCommentAdded());
    }

    @Test

    public void dellCommentFromTicket() {
        homePage.clickViewIssue();
        String textLastComment = ticketPage.getLastComment();
        ticketPage.clickCommentDelButton();
        ticketPage.SubmitDelete();
        ticketPage.updateListComments();
        String textLastComment2 = ticketPage.getLastComment();
        assertTrue(!textLastComment2.contains(textLastComment));

    }

}