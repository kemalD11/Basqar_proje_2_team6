package StepDefinitions;


import Pages.DialogContent;
import Pages._Parent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class _US_012_DokumentTypes extends _Parent {


DialogContent dialogContent;


    @And("^Navigate to Document Types  Left page$")
    public void navigateToDocumentTypesLeftPage(DataTable elements) {


        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
         dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
    @And("^Control on  successfully message$")
    public void controlOnSuccessfullyMessage(WebElement element) {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }
    @Then("\"^Userr should see \"([^\"]*)\" message$")
    public void userShouldLoginSuccessfully(String message) {
//        Assert.assertTrue(new LoginPage().dashboardText.isDisplayed());

        dialogContent.findElementAndVerifyContainsText("success/error", message);
    }


    @And("^User click on the element in dialogcontent$")
    public void userClickOnTheElementInDialogcontent(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

    @And("^User sending the keys$")
    public void userSendingTheKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Userr should see \"([^\"]*)\" message$")
    public void userrShouldSeeMessage(String message) {

            dialogContent.findElementAndVerifyContainsText("success/error", message);
        }


    @And("^User click Tab key$")
    public void userClickTabKey() {

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }catch (AWTException e){}
    }

    @Then("^User \"([^\"]*)\" \"([^\"]*)\"$")

        public void user(String editorDelete, String value) {
            dialogContent.editAndDeleteFunction(editorDelete, value);

    }
}

