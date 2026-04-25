package LearningSelenium.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SendingShortCuts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        WebElement txtField = driver.findElement(By.xpath("//textarea[@id = \"textarea\"]"));
        txtField.sendKeys("Welcome");

        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).perform();
        action.keyDown(Keys.SPACE).keyUp(Keys.SPACE).perform();
        action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        // If three button and second one will release first and first keydown will release at the last
        action.keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("S").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
    }

}
