package Pages;

import Utilities.Driver;
import org.apache.poi.poifs.property.Child;
import org.apache.poi.poifs.property.Parent;
import org.apache.poi.poifs.property.Property;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;

public class DialogContent extends _Parent {
    WebElement myElement;
    List<WebElement> myList;

    Driver driver;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'])[8]")
    private WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResSetupButton;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement Attestations;

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement name1;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement stage;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement option1;

    @FindBy(id = "mat-input-7")
    private WebElement description;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//input[@id='ms-text-field-0' ]")
    private WebElement nameSearch;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;


    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;


    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;


    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(css = "div#toast-container")
    private WebElement message;

    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})
    private List<WebElement> deleteButton;
    @FindAll({@FindBy(css = "ms-edit-button.ng-star-inserted")})
    private List<WebElement> editButton;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "documentTypes":
                myElement = documentTypes;
                break;

            case "HumanResources":
                myElement = HumanResources;
                break;

                case "humanResSetupButton":
                myElement = humanResSetupButton;
                break;
            case "Attestations":
                myElement = Attestations;
                break;

            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                // bu eleman yok ise çoklu olarak yinede bulduk
                // eğer gerçekten yok ise size 0 olacağı için
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.

                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "closeDialog":
                myElement = closeDialog;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "stage":
                myElement = stage;
                break;
            case "option1":
                myElement = option1;
                break;


        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "username":
                myElement = username;
                break;
            case "name1":
                myElement = name1;
                break;
            case "description":
                myElement = description;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchNameInput":
                myElement = searchNameInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priorityCode":
                myElement = priorityCode;
                break;
            case "nameSearch":
                myElement = nameSearch;
                break;

        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }

        verifyElementContainsText(myElement, msg);
    }

//    public void editAndDeleteFunction(String countryName, String editOrDelete) {
//
//        // invisible olma beklemesini, display ise şartına bağladık, yani
//        // gözüküyorsa kaybolana kadar bekle.
//
//        if (msjContainers.size()>0) {
//            if (msjContainer.isDisplayed())
//                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
//        }
//
//        // yukarıdaki bölüm mesajlar kaybolmadan edit ve deleteye tıklatamıyordu ,
//        // yukarıdaki kod ile bu eleman invisible olana kadar bekle dedik.
//
//        // aşağıda editOrDelete den gelen edit veya delete kelimesine
//        // göre hangi buton tipine tıklatılacaksa onun LİST i alınıyor.
//        List<WebElement> btnList = new ArrayList<>();
//
//        if (editOrDelete.equalsIgnoreCase("delete"))
//            btnList = waitVisibleListAllElement(deleteButtonList);
//        else
//            btnList = waitVisibleListAllElement(editButtonList);
//
//        // nameList içerisinde (table ın 2 stunundaki isimlerin olduğu
//        // liste) ülke adı aranıyor. bulunduğunda o indexteki butona
//        // (edit veya delete) tıklanarak. Dialog penceresi açılıyor.
//
//
//        // sayfa yenilendiğinde isimler değişiyor, bu yüzden
//        // tekrar bulması için süre eklendi.(stale problemini burası çözdü)
//        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
//        for (int i = 0; i < nameListNew.size(); i++) {
//            if (nameListNew.get(i).getText().equalsIgnoreCase(countryName)) {
//                clickFunction(btnList.get(i));
//            }
//        }
//
//        // ekranda tıklandıktan sonra izleyebilmek için kondu
//        // waiting(5000);
//    }

    public void editAndDeleteFunction(String editorDelete, String elementName) {
        if (messageList.size() > 0) {
            //   if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        switch (editorDelete) {
            case "edit":
                myList = editButton;
                break;

            case "delete":
                myList = deleteButton;
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(elementName)) {
                clickFunction(myList.get(i));
                break;
            }
        }
    }


    public void selectUserType(String userType) {

        for (WebElement n : userTypeAllOptions) {
            if (n.getText().contains(userType)) {
                clickFunction(n);
                break;
            }
        }
    }


}
