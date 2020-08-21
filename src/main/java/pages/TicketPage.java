package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TicketPage {

    public void sumIsPresent() {
        $("#key-val").shouldBe(Condition.visible);
    }
    public boolean urlContains() {
        return WebDriverRunner.url().endsWith("WEBINAR-11962");
    }

    public void addComment(){
        $("#footer-comment-button").click();
        $("#comment").setValue("My comment");
        $("#issue-comment-add-submit").click();
    }
  public void isCommentAdded(){
        String commentText =$("div.comment:focus").getText();
      return commentText.contains("My comment");
  }

//    }
//    public String getText(){
//
//        return $(".issue-data-block activity-comment twixi-block  expanded focused").getText();
//    }
//
//    public String getLastComment() {
//       return $(By.xpath("//*[@class='issue-data-block activity-comment twixi-block  expanded'][last()]//child::*[@class='action-body flooded']")).getText();
//    }
//    public void clickCommentDelButton(){
//        $(By.xpath("//*[@class='issue-data-block activity-comment twixi-block  expanded'][last()]//child::*[@title='Delete']")).click();
//    }
//    public void SubmitDelete(){
//        $("#comment-delete-submit").click();
  //  }
//    public void updateListComments(){}

}
