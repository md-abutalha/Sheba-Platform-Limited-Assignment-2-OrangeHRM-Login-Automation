package orangehrmlogintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
    WebDriver browser;

    //Creating Browser
    @BeforeSuite
    public WebDriver openBrowser(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        return browser;
    }

    @AfterSuite
    //closing Browser
    public void closeBrowser(){
        browser.quit();
    }
}
