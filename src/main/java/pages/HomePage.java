package pages;

import com.codeborne.selenide.Condition;
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

    public void userIconIsDisplayed() {
        $(By.id("header-details-user-fullname")).shouldBe(Condition.visible);
    }
}