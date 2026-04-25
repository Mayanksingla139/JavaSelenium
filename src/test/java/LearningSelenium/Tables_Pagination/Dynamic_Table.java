package LearningSelenium.Tables_Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dynamic_Table {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        int row = driver.findElements(By.xpath("//table[@id=\"taskTable\"]//tbody//tr")).size();
        int column = driver.findElements(By.xpath("//table[@id=\"taskTable\"]//tbody//tr[1]//td")).size();

        for(int i=1; i<=row; i++){
            String device = driver.findElement(By.xpath("//table[@id=\"taskTable\"]//tbody//tr["+i+"]//td[1]")).getText();
            String cpuUsage = driver.findElement(By.xpath("//table[@id=\"taskTable\"]//tbody//tr["+i+"]//td[contains(text(), \"%\")]")).getText();
            System.out.println(device+" CPU Usage is: "+cpuUsage);
        }

    }
}
