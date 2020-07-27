package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public LoginPage() {
        WebDriver driver = WebDriverFactory.getDriver();
    }

    public void navigateTo() {
        open("https://jira.hillel.it/secure/Dashboard.jspa");
    }

    public void enterUserName() {
        $(By.id("login-form-username")).setValue("webinar5");
    }

    public void setUserPassInput() {
        $(By.id("login-form-password")).setValue("webinar5");
    }

    public void clickLogBut() {
        $("#login").click();
    }

}

