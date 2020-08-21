package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

//    private SelenideElement viewIssue = $(By.xpath("//*[@data-issue-key='WEBINAR-11962']"));
//    private SelenideElement toolBar = $(By.xpath("//*[@class='ops-menus aui-toolbar2']"));

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
    public void isButtonCreateLinkPresent(){
        $("#create_link").shouldBe(Condition.visible);
    }
    public void clickCreateIssue(){
        $("#create_link").click();
    }

}