package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textpage extends BasePage{
    public Textpage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='finish']/h4")
    WebElement text;



    public void tx(){
        text.click();
        System.out.println(text.getText());




    }
}
