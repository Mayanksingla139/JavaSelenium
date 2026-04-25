package LearningSelenium.WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // 1. Get url
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);

        // 2. Get Title
        System.out.println("Title is: " + driver.getTitle());

        // 3. Get Current Url
        System.out.println("Current Url is: " + driver.getCurrentUrl());

        // 4. get page source -> return source code of the page
        System.out.println("-----------------------------Source code is--------------------------------------------");
        System.out.println(driver.getPageSource());

        // 5. getWindowHandle() -> return id of the single browser window
        System.out.println("Window id is: " + driver.getWindowHandle());

        // 5. getWindowHandles() -> return id's of the multiple browser windows
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        System.out.println("Windows id's are: " + driver.getWindowHandles());

        // close driver
        driver.quit();


    }

}
