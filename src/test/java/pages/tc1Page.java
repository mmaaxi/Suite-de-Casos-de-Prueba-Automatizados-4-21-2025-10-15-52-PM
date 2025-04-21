package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {

    WebDriver driver;
    String googleSheetURL = "https://docs.google.com/sheet/..."; // URL del Google Sheet

    By testCasesListLocator = By.id("test-cases-list-id"); // Reemplazar por el localizador real

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogleSheet() {
        driver.get(googleSheetURL);
    }

    public boolean isSheetLoaded() {
        // Añadir lógica necesaria para comprobar que el documento está listo (por ejemplo, esperar a que un elemento esté visible)
        return driver.getCurrentUrl().equals(googleSheetURL);
    }

    public boolean verifyAllTestCasesDisplayed() {
        // Añadir lógica para verificar que todos los casos están visibles
        return driver.findElements(testCasesListLocator).size() > 0;
    }
}