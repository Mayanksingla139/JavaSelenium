package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators_CSS {

    @Test
    public static void main(String[] args) throws InterruptedException {
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String fetchedTitle = driver.getTitle();
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);

        // Test Step 1: tag id tag#id
//        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T-Shirts" + Keys.ENTER);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T-Shirts" + Keys.ENTER);
        Thread.sleep(2000);

        // test Step 2: tag class tag.className
        driver.findElement(By.cssSelector("img.s-image")).click();
        Thread.sleep(2000);


        // Close driver
        driver.quit();

    }
}
