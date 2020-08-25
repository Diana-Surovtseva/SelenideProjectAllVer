package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {


    public HomePage() {
        WebDriver driver = WebDriverFactory.getDriver();
    }

    public void userIconIsDisplayed() {
        $("#header-details-user-fullname").shouldBe(Condition.visible);
    }

    public void clickViewIssue() {
        //sleep(1000);
        $("a[href$='WEBINAR-11962']").click();
    }

    public void isButtonCreateLinkPresent() {
        $("#create_link").shouldBe(Condition.visible);
    }

    public void clickCreateIssue() {
        $("#create_link").click();
    }

}