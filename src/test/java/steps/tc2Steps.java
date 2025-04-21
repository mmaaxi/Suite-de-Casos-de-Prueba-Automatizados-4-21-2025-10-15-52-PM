package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc2Page;

public class tc2Steps {

    WebDriver driver;
    tc2Page page;

    public tc2Steps() {
        this.driver = Hooks.getDriver();
        page = new tc2Page(driver);
    }

    @Given("I have opened the Google Sheet")
    public void i_have_opened_the_google_sheet() {
        page.openGoogleSheet();
    }

    @When("I modify the test cell with new data")
    public void i_modify_the_test_cell_with_new_data() {
        page.modifyTestCell("New Data");
    }

    @Then("the modification should be saved correctly")
    public void the_modification_should_be_saved_correctly() {
        Assert.assertTrue(page.isModificationSavedCorrectly());
    }
}