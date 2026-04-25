package LearningSelenium.Handling_web_Components;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Handling_Alert_Without_Using_Switch_Command {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();


        // Handling alert without switch command
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();

        // using explicit wait
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert NormalAlert = myWait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Normal alert text is: " + NormalAlert.getText());
        NormalAlert.accept();

        // driver close
        driver.quit();
    }
}
