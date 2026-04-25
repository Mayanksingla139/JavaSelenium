package LearningSelenium.Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {

    public static void main(String[] agrs){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        // Slider
        WebElement minSliderbtn = driver.findElement(By.xpath("//span[contains(@class, \"ui-slider-handle\")][1]"));
        System.out.println("Min slider button location before moving: " +minSliderbtn.getLocation());
        action.dragAndDropBy(minSliderbtn, 26, 0).perform();
        System.out.println("Min slider button location after moving: " +minSliderbtn.getLocation());

        WebElement maxSliderbtn = driver.findElement(By.xpath("//span[contains(@class, \"ui-slider-handle\")][2]"));
        System.out.println("Max slider button location before moving: " +maxSliderbtn.getLocation());
        action.dragAndDropBy(maxSliderbtn, -53, 0).perform();
        System.out.println("Max slider button location after moving: " +maxSliderbtn.getLocation());

    }
}
