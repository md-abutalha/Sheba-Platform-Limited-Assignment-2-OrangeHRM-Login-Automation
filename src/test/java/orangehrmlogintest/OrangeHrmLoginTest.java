package orangehrmlogintest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmLoginTest extends DriverSetUp {
    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By errorMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    By forgotPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        browser.findElement(username).sendKeys("Admin");
        browser.findElement(password).sendKeys("admin123");
        Thread.sleep(2000);
        browser.findElement(loginButton).click();
        Assert.assertEquals(browser.getCurrentUrl(), expectedUrl, "User did not successfully log in.");
    }

    @Test
    public void testLoginWithInValidCredentials() throws InterruptedException {
        browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        browser.findElement(username).sendKeys("Admin");
        browser.findElement(password).sendKeys("admin123");
        Thread.sleep(2000);
        browser.findElement(loginButton).click();
        Assert.assertEquals(browser.getCurrentUrl(), expectedUrl, "User did not successfully log in.");
    }

    @Test
    public void testLoginWithInvalidUsername() throws InterruptedException {
        browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        browser.findElement(username).sendKeys("Admin1211111111111");
        browser.findElement(password).sendKeys("admin123");
        Thread.sleep(2000);
        browser.findElement(loginButton).click();
        WebElement error = browser.findElement(errorMessage);
        System.out.println(error.getText());
        Assert.assertTrue(error.isDisplayed());
    }


    @Test
    public void testLoginWithBlankPassword() throws InterruptedException {
        browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        browser.findElement(username).clear();
        browser.findElement(password).clear();
        Thread.sleep(2000);
        browser.findElement(loginButton).click();
        WebElement error = browser.findElement(errorMessage);
        Assert.assertFalse(error.isDisplayed());
    }
    @Test
    public void testForgotPasswordLink() throws InterruptedException {
        browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        browser.findElement(forgotPassword).click();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
        Assert.assertEquals(browser.getCurrentUrl(), expectedUrl);
    }
}
