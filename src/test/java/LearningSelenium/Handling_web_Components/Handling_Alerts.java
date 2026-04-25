package LearningSelenium.Handling_web_Components;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handling_Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().to("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();


        // 1) Handling normal alert
        System.out.println("-------------------Normal/Simple Alert Testing-----------------------");
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
        Alert NormalAlert = driver.switchTo().alert();
        System.out.println("Normal alert text is: " + NormalAlert.getText());
        NormalAlert.accept();


        // 2) Confirmation alert
        System.out.println("-------------------Confirmation Alert Testing-----------------------");
        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
        // Dismiss alert basically cancel the alert pop
        Alert ConfirmationAlert = driver.switchTo().alert();
        System.out.println("Confirmation alert text is: " + ConfirmationAlert.getText());
        ConfirmationAlert.dismiss();
        String cancelConfirmationStr = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        boolean cancelConfirmation = cancelConfirmationStr.equalsIgnoreCase("You Pressed Cancel");
        System.out.println("Cancel button confirmation: " + cancelConfirmation);


        // Accept alert basically to accept the alert pop
        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
        ConfirmationAlert = driver.switchTo().alert();
        System.out.println("Confirmation alert text is: " + ConfirmationAlert.getText());
        ConfirmationAlert.accept();
        String acceptConfirmationStr = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        boolean acceptConfirmation = acceptConfirmationStr.equalsIgnoreCase("You Pressed Ok");
        System.out.println("Cancel button confirmation: " + acceptConfirmation);


        // 3) Prompt alerts
        System.out.println("-------------------Prompt Alert Testing-----------------------");
        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
        Alert PromptAlert = driver.switchTo().alert();
        PromptAlert.sendKeys("Mayank");
        PromptAlert.accept();
        String Prompttxt = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
        System.out.println("Text is: " + Prompttxt);


        // driver close
        driver.quit();
    }
}
