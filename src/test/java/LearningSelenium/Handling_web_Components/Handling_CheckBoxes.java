package LearningSelenium.Handling_web_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Handling_CheckBoxes {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().to("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // clicking checkbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement checkbox:checkboxes){
            checkbox.click();
        }
        for(WebElement checkbox:checkboxes){
            if(checkbox.isSelected()){
                System.out.println("Check box is selected");
            }
        }

        // UnSelect the selected checkbox
        for(WebElement checkbox:checkboxes){
            if(checkbox.isSelected()){
                checkbox.click();
            }
        }
        for(WebElement checkbox:checkboxes){
            if(!checkbox.isSelected()){
                System.out.println("Check box is not selected");
            }
        }



        // drive close
        driver.quit();
    }
}
