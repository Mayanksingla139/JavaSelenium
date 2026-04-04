package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class JavaScriptExecutor {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // type into
        WebElement inputTxt = driver.findElement(By.xpath("//input[@id = \"name\"]"));
        js.executeScript("arguments[0].setAttribute('value', 'MAYANK')",inputTxt);

        // click
        WebElement RadioBtn = driver.findElement(By.xpath("//input[@id = \"male\"]"));
        js.executeScript("arguments[0].click()", RadioBtn);

        // scroll
        js.executeScript("window.scrollBy(0, 100)");  // Scroll by pixel (vertical)
        System.out.println("Scroll is at: "+ js.executeScript("return window.pageYOffset"));

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Scroll to bottom of page
        System.out.println("Scroll is at: "+ js.executeScript("return window.pageYOffset"));

        js.executeScript("window.scrollTo(0, 0)"); // Scroll to top of page
        System.out.println("Scroll is at: "+ js.executeScript("return window.pageYOffset"));

        js.executeScript("arguments[0].scrollIntoView(true)", RadioBtn); // Scroll into view of an element
        System.out.println("Scroll is at: "+ js.executeScript("return window.pageYOffset"));

        // Zoom In and Zoom Out
        js.executeScript("document.body.style.zoom = '50%'");


    }
}
