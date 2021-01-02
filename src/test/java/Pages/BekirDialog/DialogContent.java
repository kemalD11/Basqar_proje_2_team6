package Pages.BekirDialog;

import Pages._Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends _Parent {

    WebElement myElement;

    public DialogContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement Budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement SetupBudget;

    @FindBy(xpath = "//span[text()='Budget Projects']")
    private WebElement BudgetProject;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]")
    private WebElement nameLine;

    @FindBy(xpath = "(//input[contains(@type,'text')])[2]")
    private WebElement nameA;

    @FindBy(xpath = "//input[contains(@formcontrolname,'code')]")
    private WebElement accountLine;

    @FindBy(xpath = "//input[contains(@formcontrolname,'code')]")
    private WebElement accountNumber;

    @FindBy(xpath = "//div[contains(@role,'listbox')]")
    private WebElement optionButton;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement createMessage;

    @FindBy(xpath = "(//input[contains(@type,'text')])[1]")
    private WebElement nameLine1;

    @FindBy(xpath = "(//input[contains(@type,'text')])[1]")
    private WebElement budgetName1;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement lastMessage;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "Budget"       : myElement = Budget       ;break;
            case "SetupBudget"  : myElement = SetupBudget  ;break;
            case "BudgetProject": myElement = BudgetProject;break;
            case "addButton"    : myElement = addButton    ;break;
            case "nameLine"     : myElement = nameLine     ;break;
            case "accountLine"  : myElement = accountLine  ;break;
            case "optionButton" : myElement = optionButton ;break;
            case "saveButton"   : myElement = saveButton   ;break;
            case "nameLine1"    : myElement = nameLine1    ;break;
            case "searchButton" : myElement = searchButton ;break;
            case "deleteButton" : myElement = deleteButton ;break;
            case "yesButton"    : myElement = yesButton    ;break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameA"        : myElement = nameA        ;break;
            case "budgetName1"  : myElement = budgetName1  ;break;
            case "accountNumber": myElement = accountNumber;break;
        }
        sendKeysFunction(myElement, value);
    }

}


