import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest {
    WebDriver driver = null;
    LoginPage loginPage = null;
    HomePage homePage = null;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        Configuration.browser = "firefox";
    }

    @Test
    public void loginTest() {
        loginPage.navigateTo();
        loginPage.enterUserName();
        loginPage.setUserPassInput();
        loginPage.clickLogBut();
        homePage.userIconIsDisplayed();
    }
}