package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.PracticePage;
import runners.Driver;

public class StepDefinition {

    WebDriver driver = Driver.getDriver();
    PracticePage practicePage = new PracticePage();

    @Given("Radio Button Example with three options")
    public void radioButtonExampleWithThreeOptions() {

        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.id("//*[@id=\"bmwradio\"]")).isSelected();

    }

    @When("User selects {string} and {string}")
    public void userSelectsAnd(String arg0, String arg1) {
        driver.findElement(By.id("//*[@id=\"bmwradio\"]")).click();
        driver.findElement(By.id("//*[@id=\"benzradio\"]")).click();
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        practicePage.clickBMW();
    }
}
