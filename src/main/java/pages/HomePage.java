package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.*;


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

//        clickOnElementWithRetry(viewIssue, toolBar, 3, 3);
    }

//    private void clickOnElementWithRetry(SelenideElement elementToBeClicked, SelenideElement successCriteriaElement, int attempts, int timeOutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
//        for (int i = 0; i < attempts; i++) {
//            try {
//                wait.until(ExpectedConditions.visibilityOfElementLocated((By) successCriteriaElement)).isDisplayed();
//                break;
//            } catch (TimeoutException e) {
//                wait.until(ExpectedConditions.elementToBeClickable(elementToBeClicked));
//                driver.findElement((By) elementToBeClicked).click();
//            }
//        }
    }
