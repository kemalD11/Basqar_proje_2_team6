package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Parent {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
       // waitUntilVisible(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waiting(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void verifyElementContainsText(WebElement element, String text) {
        // waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));

        wait.until(ExpectedConditions.visibilityOf(element));

        System.out.println(element.getText());
        System.out.println(text);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

}