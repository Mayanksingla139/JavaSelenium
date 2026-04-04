package HandleBrowerSetting_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableMsgAutomatedOnScreen {

    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();

        // Disable automated message on screen
        option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println("Title is: " +driver.getTitle());


    }
}
