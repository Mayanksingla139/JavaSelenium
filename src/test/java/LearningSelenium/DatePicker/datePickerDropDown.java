package LearningSelenium.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class datePickerDropDown {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String year = "2036";
        String month = "Apr";
        String date = "3";

        // Click date picker
        driver.findElement(By.xpath("//input[@id = \"txtDate\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Select year
        WebElement YearElement = driver.findElement(By.xpath("//select[@class = \"ui-datepicker-year\"]"));
        Select selectYear = new Select(YearElement);
        selectYear.selectByVisibleText(year);
        System.out.println("Selected year is: "+ year);

        // Select month
        WebElement MonthElement = driver.findElement(By.xpath("//select[@class = \"ui-datepicker-month\"]"));
        Select selectMonth = new Select(MonthElement);
        selectMonth.selectByVisibleText(month);
        System.out.println("Selected month is: "+ month);

        // Select date
        List<WebElement> dateElement = driver.findElements(By.xpath("//table[@class = \"ui-datepicker-calendar\"]//tbody//tr//a"));
        for(WebElement currentDate: dateElement){
            if(currentDate.getText().equalsIgnoreCase(date)){
                currentDate.click();
            }
        }
        System.out.println("Selected date is: "+ date);
    }
}
