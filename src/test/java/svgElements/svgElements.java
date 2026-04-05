package svgElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class svgElements {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement svg1 = driver.findElement(By.xpath("//*[name()='circle' and contains(@cx,'15')]"));
        if(svg1.isDisplayed()){
            System.out.println("Found SVG1");
        }

    }


}
