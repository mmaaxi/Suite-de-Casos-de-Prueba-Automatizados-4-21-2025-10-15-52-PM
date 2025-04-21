package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc1Page;
import static org.junit.Assert.assertTrue;

public class tc1Steps {

    WebDriver driver;
    tc1Page sheetPage;

    @Given("el usuario abre la URL del Google Sheet")
    public void el_usuario_abre_la_url_del_google_sheet() {
        sheetPage = new tc1Page(driver);
        sheetPage.openGoogleSheet();
    }

    @When("el documento se ha abierto")
    public void el_documento_se_ha_abierto() {
        assertTrue(sheetPage.isSheetLoaded());
    }

    @Then("se muestra la lista completa de casos de prueba")
    public void se_muestra_la_lista_completa_de_casos_de_prueba() {
        assertTrue(sheetPage.verifyAllTestCasesDisplayed());
    }
}