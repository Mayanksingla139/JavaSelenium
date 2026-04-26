package UnderstandingTestNgFeatures.ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTestBrowserTesting {

    WebDriver driver;

    @BeforeClass
    @Parameters({"Browser"})
    void setUp(String browser) throws InterruptedException {
        switch (browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("invalid browser");
                return;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    void EnterDetails(){
        driver.findElement(By.xpath("//input[@id = \"name\"]")).sendKeys("Mayank");
        driver.findElement(By.xpath("//input[@id = \"email\"]")).sendKeys("MayankSingla");
    }
}
