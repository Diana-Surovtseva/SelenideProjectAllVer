package pages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;

public class CreateNewTicketWindow {
    public void isProjectFieldDisplayed() {
        $("#project-field").shouldBe(Condition.visible);
    }

    public void clearProjectField() {
        $("#project-field").clear();
    }

    public void inputProjectField() {
        $("#project-field").setValue("Webinar (WEBINAR)");
    }

    public void pressTabAfterProjectField() {
        $("#project-field").pressTab();
    }

    public void isIssueTypeFieldDisplayed() {
        $("#issuetype-field").shouldBe(Condition.visible);
    }

    public void clearIssueTypeField() {
        $("#issuetype-field").clear();
    }

    public void enterIssueTypeField() {
        $("#issuetype-field").setValue("Task");
    }

    public void pressTabAfterIssueTypeField() {
        $("#issuetype-field").pressTab();
    }

    public void isSummaryFieldDisplayed() {
        $("#summary").shouldBe(Condition.visible);
    }

    public void enterSummary() {
        $("#summary").setValue("Test task");
    }

    public void clearReporterField() {
        $("#reporter-field").clear();
    }

    public void enterReporterField() {
        $("#reporter-field").setValue("DianaSurovtseva");
    }
public void pressCreateIssueButton(){
       $("#create-issue-submit").click();
}
public boolean isPopUpPresent(){
     return $("#aui-flag-container").should(Condition.visible).isDisplayed();
}
public String getPopUpText(){
   String popUpText =  $("#aui-flag-container").getText();
   return popUpText;
}
}
