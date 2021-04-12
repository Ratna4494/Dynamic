package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Start extends BasePage {
    public Start(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Start')]")
    WebElement startButton;



   //  @FindBy(xpath = "//div[@id='finish']/h4")

    //  WebElement text;


    public void tc() throws InterruptedException {
        startButton.click();
        Thread.sleep(2000);





    }
}
