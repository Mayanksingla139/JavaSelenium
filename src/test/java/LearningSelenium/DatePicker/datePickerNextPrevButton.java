package LearningSelenium.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class datePickerNextPrevButton {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // using sendkeys
        WebElement datePicker1 = driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
        datePicker1.sendKeys("03/08/2026");
        datePicker1.sendKeys(Keys.ENTER);

        // selecting date from calendar
        WebElement datePicker2 = driver.findElement(By.xpath("//input[@id=\"txtDate\"]"));
        datePicker2.click();
        String year = "2026";
        String month = "Jan";
        String date = "3";
        while(true){
            String openMonth = driver.findElement(By.xpath("//select[@class = \"ui-datepicker-month\"]//option[@selected]")).getText();
            String openYear = driver.findElement(By.xpath("//select[@class = \"ui-datepicker-year\"]//option[@selected]")).getText();
            if(openYear.equalsIgnoreCase(year) && openMonth.equalsIgnoreCase(month)){
                break;
            }
            // next button
//            driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();

            // previous button
            driver.findElement(By.xpath("//span[contains(text(), 'Prev')]")).click();
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class = \"ui-datepicker-calendar\"]//tr//a"));
        for(WebElement dt:dates){
            if(dt.getText().equalsIgnoreCase(date)){
                dt.click();
            }
        }

    }
}
