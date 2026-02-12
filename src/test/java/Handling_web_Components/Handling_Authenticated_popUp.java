package Handling_web_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Authenticated_popUp {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        String text = driver.findElement(By.xpath("//p")).getText();
        System.out.println(text);

        driver.close();
    }
}
