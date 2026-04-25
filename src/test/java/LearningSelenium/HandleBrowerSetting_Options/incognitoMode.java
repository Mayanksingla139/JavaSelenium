package LearningSelenium.HandleBrowerSetting_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognitoMode {

    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();

        // Run test case in incognito mode
        option.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println("Title is: " +driver.getTitle());


    }
}
