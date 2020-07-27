package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.*;


public class HomePage {
    WebDriverWait wait = null;

    public HomePage() {
        WebDriver driver = WebDriverFactory.getDriver();
    }


    public SelenideElement userIconIsDisplayed() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        SelenideElement userIcon = $(By.id("header-details-user-fullname"));
        return userIcon;
    }

}