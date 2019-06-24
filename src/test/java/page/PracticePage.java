package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runners.Driver;

public class PracticePage {

    WebDriver driver;

    public PracticePage(){
        driver = Driver.getDriver();

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='bmwradio']")
    public WebElement BMW;

    public void clickBMW() {
        BMW.click();
    }

}
