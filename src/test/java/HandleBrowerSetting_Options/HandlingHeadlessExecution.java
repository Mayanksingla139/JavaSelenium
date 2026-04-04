package HandleBrowerSetting_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHeadlessExecution {

    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();

        // headless execution -> you will not able to see execution it will happen in backend and at the end you will see result
        option.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println("Title is: " +driver.getTitle());


    }
}
