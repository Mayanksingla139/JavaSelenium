package LearningSelenium.KeyboardActions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpenInNewTab {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        // action to perform open in new tab
        WebElement element = driver.findElement(By.xpath("//a[text () = \"Udemy Courses\"]"));
        action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();

        // shift driver to new tab
        List<String> ids = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1));
        WebElement txtSdet = driver.findElement(By.xpath("//a[contains(text(), \"SDET-QA\")]"));
        if(txtSdet.isDisplayed()){
            System.out.println("Driver shifted to new tab");
        }
    }
}
