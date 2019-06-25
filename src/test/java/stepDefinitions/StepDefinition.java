package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import page.PracticePage;
import utilities.Driver;

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

    @AfterMethod

    @Given("User locates Switch to Alert Button using Xpath")
    public void userLocatesSwitchToAlertButtonUsingXpath() {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bermet");



    }

    @When("User clicks the  button for alert popup box")
    public void userClicksTheButtonForAlertPopupBox() {
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

    }

    @Then("User gets the displayed text of the alert popup and prints it to console")
    public void userGetsTheDisplayedTextOfTheAlertPopupAndPrintsItToConsole() {
        String output =  driver.switchTo().alert().getText();
        System.out.println(output);
    }
}
