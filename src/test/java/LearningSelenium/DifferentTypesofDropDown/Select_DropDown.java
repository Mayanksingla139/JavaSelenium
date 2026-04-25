package LearningSelenium.DifferentTypesofDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Select_DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Select Drop Down
        WebElement SelectDropDown = driver.findElement(By.xpath("//select[@id = 'country']"));
        Select countryDropDown = new Select(SelectDropDown);
        countryDropDown.selectByValue("india");
        countryDropDown.selectByVisibleText("China");
        countryDropDown.selectByIndex(0);

        // Find count of options we have and print each value
        List<WebElement> options = countryDropDown.getOptions();
        System.out.println("Total values in select drop down are : "+options.size());
        for(int i=0; i< options.size(); i++){
            System.out.println("At index "+i+" Value is: "+options.get(i).getText());
        }

        driver.quit();

    }
}
