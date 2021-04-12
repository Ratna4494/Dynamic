package testScript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void launchingBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start_maximize");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get(BasePage.getValues("url"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

   /* @AfterClass
    public void closeBrowser() {
        driver.quit();
    }*/


}
