package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public LoginPage() {
        WebDriver driver = WebDriverFactory.getDriver();
    }

    public void navigateTo() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        open("https://jira.hillel.it/secure/Dashboard.jspa");
    }

    public void enterUserName() {
        $(By.id("login-form-username")).setValue("DianaSurovtseva");
    }

    public void setUserPassInput() {
        $(By.id("login-form-password")).setValue("DianaSurovtseva");
    }

    public void clickLogBut() {
        $("#login").click();
    }

}

