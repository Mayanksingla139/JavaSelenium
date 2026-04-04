package HandleBrowerSetting_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLVerification {

    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();

        // SSL verification
        option.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://expired.badssl.com/");
        System.out.println("Title is: " +driver.getTitle());


    }
}
