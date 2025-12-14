package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Wait_Methods {

    public static void main(String[] args) throws InterruptedException {

//        1) Thread.sleep

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.className("a-button-text")). click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("t-shirts");



//        2) implicit wait it will initialize after the driver initialization, and it will work till we close the driver

//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.className("a-button-text")). click();
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("t-shirts");



//        3) Explicit wait

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.className("a-button-text")). click();
//        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));  // declaration
//        // how we use it
//        WebElement SearchBar = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"twotabsearchtextbox\"]")));
//        if (SearchBar != null) {
//            SearchBar.sendKeys("T-shirts" + Keys.ENTER);
//        }

//        4) Fluent wait

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> myWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("a-button-text")). click();
        WebElement SearchBar = myWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
            }
        });
        SearchBar.sendKeys("T-shirts" + Keys.ENTER);


//        driver close
        driver.quit();


    }
}
