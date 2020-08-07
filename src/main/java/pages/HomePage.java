package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage {
    WebDriverWait wait = null;
    WebDriver driver = null;

    private SelenideElement viewIssue = $(By.xpath("//*[@data-issue-key='WEBINAR-11962']"));
    private SelenideElement toolBar = $(By.xpath("//*[@class='ops-menus aui-toolbar2']"));

    public HomePage() {
        WebDriver driver = WebDriverFactory.getDriver();
    }

    public void userIconIsDisplayed() {
        $(By.id("header-details-user-fullname")).shouldBe(Condition.visible);
    }

    public void clickViewIssue() {
        $(By.xpath("//*[contains (text(),'WEBINAR-11962')]")).should(Condition.visible).click();
    }
    public void isButtonCreateLinkPresent(){
       // WebDriverWait wait = new WebDriverWait(driver,10);
        $(By.id("create_link")).shouldBe(Condition.visible);
    }
    public void clickCreateIssue(){
        $(By.id("create_link")).click();
    }

}