package Window_Handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Switch_Window_Using_Window_Handlers {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowIds = driver.getWindowHandles();
        List<String> windowIdList = new ArrayList(windowIds);
        System.out.println("First tab id: " + windowIdList.get(0));
        System.out.println("Second tab id:" + windowIdList.get(1));

        System.out.println("driver currently focused on: " + driver.getTitle());

        // switch driver to second tab
        driver.switchTo().window(windowIdList.get(1));
        System.out.println("driver currently focused on: " + driver.getTitle());

        driver.switchTo().window(windowIdList.get(0));
        System.out.println("driver currently focused on: " + driver.getTitle());


        // close driver
        driver.quit();
    }
}
