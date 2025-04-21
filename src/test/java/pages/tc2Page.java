package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc2Page {

    private WebDriver driver;
    private By testCellLocator = By.id("TestCellId"); // Update with actual locator
    private By saveConfirmationLocator = By.id("SaveConfirmationId"); // Update with actual locator

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogleSheet() {
        driver.get("https://docs.google.com/spreadsheets/");
        // Add code for login if necessary
    }

    public void modifyTestCell(String newData) {
        WebElement cell = driver.findElement(testCellLocator);
        cell.clear();
        cell.sendKeys(newData);
        // Possibly add code to ensure it saves, depending on app behavior
    }

    public boolean isModificationSavedCorrectly() {
        WebElement confirmation = driver.findElement(saveConfirmationLocator);
        return confirmation.isDisplayed();
    }
}