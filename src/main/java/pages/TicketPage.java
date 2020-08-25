package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class TicketPage {
    private WebDriver driver = null;

    public void sumIsPresent() {
        $("#key-val").shouldBe(Condition.visible);
    }

    public boolean urlContains() {
        return WebDriverRunner.url().endsWith("WEBINAR-11962");
    }

    public void addComment() {
        $("#footer-comment-button").click();
        $("#comment").setValue("My comment");
        $("#issue-comment-add-submit").click();
    }

    public boolean isCommentAdded() {
        String commentText = $(".issue-data-block.activity-comment.twixi-block.expanded.focused").getText();
        return commentText.contains("My comment");
    }

    public String getLastComment() {
        return $(".issue-data-block.activity-comment.twixi-block.expanded:last-child").getText();
    }

    public void clickCommentDelButton() {
        //SelenideConfig defaults.browser().findElement(By.xpath("//*[@class='issue-data-block activity-comment twixi-block  expanded'][last()]//*[@title='Удалить']")).click();
        $(".issue-data-block.activity-comment.twixi-block.expanded:last-child").$(".delete-comment.issue-comment-action").click();
    }

    public void SubmitDelete() {
        $("#comment-delete-submit").click();
    }

    public void updateListComments() {
        $(".issuePanelWrapper").shouldBe(Condition.visible);
    }

}