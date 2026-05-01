package UnderstandingTestNgFeatures.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class FormTestCase {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void AddDetails(){
        FormPage fr = new FormPage(driver);
        fr.setName("Mayank");
        fr.setEmail("mayanksingla@gmail.com");
        fr.setPhoneNumber("123456789");
        Assert.assertEquals(driver.getTitle(), "Automation Testing Practice");
    }

    @AfterClass
    public void Close(){
        driver.quit();
    }
}
