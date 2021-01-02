package Yusuf_Pages;

import Pages._Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;


    // ------------Dismissal Articles----------------------

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupButtonUnderHumanResources;

    @FindBy(xpath = "//span[text()='Dismissal Articles']")
    private WebElement DismissalArticles;






    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {



            case "Inventory":
                myElement = Inventory;
                break;

            case "setupButtonUnderInventory":
                myElement = setupButtonUnderInventory;
                break;

            case "ItemCategory":
                myElement = ItemCategory;
                break;

            // ------------Dismissal Articles----------------------

            case "HumanResources":
                myElement = HumanResources;
                break;

            case "SetupButtonUnderHumanResources":
                myElement = SetupButtonUnderHumanResources;
                break;

            case "DismissalArticles":
                myElement = DismissalArticles;
                break;


        }

        clickFunction(myElement);
    }
}
