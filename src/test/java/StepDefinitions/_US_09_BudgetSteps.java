package StepDefinitions;


import Pages.BekirDialog.DialogContent;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class _US_09_BudgetSteps {

    DialogContent dialogContent = new DialogContent();

    @When("^Click the Budget$")
    public void click_the_Budget() {

        dialogContent.findElementAndClickFunction("Budget");
    }

    @When("^Click the SetupBudget$")
    public void click_the_SetupBudget() {

        dialogContent.findElementAndClickFunction("SetupBudget");

    }

    @Then("^Click the BudgetProjects$")
    public void click_the_BudgetProjects() {

        dialogContent.findElementAndClickFunction("BudgetProject");
    }

    @When("^Click the addButton$")
    public void click_the_addButton() {

        dialogContent.findElementAndClickFunction("addButton");

    }

    @When("^Click the nameLine$")
    public void click_the_nameLine() {

        dialogContent.findElementAndClickFunction("nameLine");
    }

    @Then("^write the nameA$")
    public void write_the_nameA() {

        dialogContent.findElementAndSendKeysFunction("nameA", "Bütce1");
    }

    @Then("^write the code$")
    public void write_the_code() {

        dialogContent.findElementAndClickFunction("accountLine");
        dialogContent.findElementAndSendKeysFunction("accountNumber", "3.3");
    }

    @Then("^click the optionButton$")
    public void click_the_optionButton() {

        dialogContent.findElementAndClickFunction("optionLine");
    }

    @Then("^click the saveButton$")
    public void click_the_saveButton() {

        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^see the success messageA$")
    public void see_the_success_messageA() {

    }

    @When("^click the nameLine1$")
    public void click_the_nameLine1() {

        dialogContent.findElementAndClickFunction("nameLine1");
    }

    @Then("^write the nameB$")
    public void write_the_nameB() {

        dialogContent.findElementAndSendKeysFunction("budgetName1", "Bütce1");
    }

    @Then("^click the searchButton$")
    public void click_the_searchButton() {

        dialogContent.findElementAndClickFunction("searchButton");
    }

    @Then("^click the deleteButton$")
    public void click_the_deleteButton() {

        dialogContent.findElementAndClickFunction("deleteButton");
    }

    @Then("^click the yesButton$")
    public void click_the_yesButton() {

        dialogContent.findElementAndClickFunction("yesButton");
    }

    @Then("^see the success messageB$")
    public void see_the_success_messageB() {

    }
}