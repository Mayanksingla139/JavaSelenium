package LearningSelenium.WebDriver_Methods;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Navigational_Methods {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/");   // accept url only in string format
        driver.manage().window().maximize();
        driver.findElement(By.className("a-button-text")). click();
        System.out.println("Get url is: " + driver.getCurrentUrl());


        // navigate to
        URL myUrl = new URL("https://www.google.com/");
        driver.navigate().to(myUrl);   // accept url in string format and as well url object
        System.out.println("Navigate url is: " + driver.getCurrentUrl());

        // navigate back
        driver.navigate().back();
        System.out.println("Backward url is: " + driver.getCurrentUrl());

        // navigate forward
        driver.navigate().forward();
        System.out.println("Forward url is: " + driver.getCurrentUrl());

        // navigate refresh
        driver.navigate().refresh();
        System.out.println("Refresh url is: " + driver.getCurrentUrl());

        // driver close
        driver.quit();
    }
}
