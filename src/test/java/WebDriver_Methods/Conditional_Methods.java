package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        WebElement Continuebtn = driver.findElement(By.className("a-button-text"));

        // 1. isDisplayed
        boolean btnDisplayed = Continuebtn.isDisplayed();

        // 2. isEnabled
        boolean btnEnabled = Continuebtn.isEnabled();

        // 2. isSelected -> use to validate radio button, check box whether we have selected or not
        boolean btnSelected = Continuebtn.isSelected();


        System.out.println("button is displayed: " + btnDisplayed);
        System.out.println("button is Enabled: " + btnEnabled);
        System.out.println("button is Selected: " + btnSelected);
        Continuebtn.click();
        Thread.sleep(2000);

        // close driver
        driver.quit();


    }
}
