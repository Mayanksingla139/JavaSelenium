package LearningSelenium.Tables_Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Pagination_Table {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");

        int totalPage = driver.findElements(By.xpath("//ul[@class = \"pagination\"]//li//a")).size();
        System.out.println("Total page count is: "+totalPage);
        for(int i=1; i<=totalPage; i++){
            driver.findElement(By.xpath("//ul[@class = \"pagination\"]//li["+i+"]//a")).click();
            int columnCount = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody//tr//td[2]")).size();
            for(int j=1; j<=columnCount; j++){
                String id = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+j+"]//td[1]")).getText();
                String name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+j+"]//td[2]")).getText();
                System.out.println("At Id "+id+" device name is: "+name);
            }
        }

    }
}
