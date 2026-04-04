package CaptureScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshot {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1 Full page screenshot
        TakesScreenshot tkScreenShot = (TakesScreenshot) driver;
        File FullScreenShot = tkScreenShot.getScreenshotAs(OutputType.FILE);
        File FullScreenShotLocation = new File(System.getProperty("user.dir")+"\\ScreenShots\\FullPage.png");
        FullScreenShot.renameTo(FullScreenShotLocation);

        // Below two taking screenshot by method getScreenshotAs, this is webelement method which comes selenium 4 onwards
        // 2 capture the screenshot-specific area of page
        WebElement specificArea = driver.findElement(By.xpath("//table[@name= \"BookTable\"]"));
        File DivtableScreenShot = specificArea.getScreenshotAs(OutputType.FILE);
        File DivtableScreenShotLocation = new File(System.getProperty("user.dir")+"\\ScreenShots\\divTable.png");
        DivtableScreenShot.renameTo(DivtableScreenShotLocation);

        // 3 capture the screenshot of particular webelement
        WebElement specificWebElement = driver.findElement(By.xpath("//h1[@class = \"title\"]"));
        File titleScreenShot = specificWebElement.getScreenshotAs(OutputType.FILE);
        File titleScreenShotLocation = new File(System.getProperty("user.dir")+"\\ScreenShots\\title.png");
        titleScreenShot.renameTo(titleScreenShotLocation);

    }
}
