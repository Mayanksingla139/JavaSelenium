package LearningSelenium.DifferentTypesofDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Bootstrap_DropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
        driver.manage().window().maximize();

        // Bootstrap DropDown
        WebElement DropDownBtn = driver.findElement(By.xpath("//button[@class = \"btn btn-primary dropdown-toggle\"]"));
        DropDownBtn.click();

        // Select single option
        WebElement singleOption = driver.findElement(By.xpath("//ul[@class = \"dropdown-menu\"]//li//a[text() = \"DEMO WEBSITES\"]"));
        singleOption.click();


        driver.quit();
    }
}
