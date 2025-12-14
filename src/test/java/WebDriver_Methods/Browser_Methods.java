package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("a-button-text")). click();
        Thread.sleep(2000);

        // 1. close driver -> close single tab (it closes new tab because we switched our driver)
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.close();

        // 2. quit driver -> close all tabs in one short
//        driver.quit();


    }
}
