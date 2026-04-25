package LearningSelenium.ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class shadowDOM {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

    }
}
