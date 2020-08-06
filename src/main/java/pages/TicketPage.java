package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.$;

public class TicketPage {
    private WebDriver driver;

    public void sumIsPresent() {
        $(By.id("summary-val")).shouldBe(Condition.visible);
    }
    public boolean urlContains(String s) {
        return driver.getCurrentUrl().contentEquals(s);

    }

    public void addComment(){
        $(By.id("footer-comment-button")).click();
        $(By.id("comment")).setValue("My comment");
        $(By.id("issue-comment-add-submit")).click();
    }
    public boolean isCommentAdded(){
        return getText().contains("My comment");
    }
    public String getText(){

        return $(By.className("issue-data-block activity-comment twixi-block  expanded focused")).getText();
    }

    public String getLastComment() {
       return $(By.xpath("//*[@class='issue-data-block activity-comment twixi-block  expanded'][last()]//child::*[@class='action-body flooded']")).getText();
    }
    public void clickCommentDelButton(){
        $(By.xpath("//*[@class='issue-data-block activity-comment twixi-block  expanded'][last()]//child::*[@title='Delete']")).click();
    }
    public void SubmitDelete(){
        $(By.id("comment-delete-submit")).click();
    }
//    public void updateListComments(){}

}
