package StepDefinitions;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _00_LoginStepDefs {



    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {
        new LoginPage().goToPage();
    }

    @When("^Enter username and password and click Login Button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        new LoginPage().login("daulet2030@gmail.com","TechnoStudy123@");
    }


//@Then("^User should login successfully$")
//    public void userShouldLoginSuccessfully() {
//
//        dialogContent.findElementAndVerifyContainsText("dashboard","Dashboard");
//
//    }



    @When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterAnd(String username, String password){
        new LoginPage().login(username,password);

    }

    @Then("^Error message \"([^\"]*)\" should be displayed$")
    public void errorMessageShouldBeDisplayed(String message)  {
        new LoginPage().checkTheMessage("errorAlert",message);

    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
    }
}
