package LearningSelenium.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class uploadFile {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Selenium does not provide direct option to handle file upload so we can mark test case out of scope
        // but if you still want to execute it then using sendkey we can validate file upload

        WebElement singleFile = driver.findElement(By.xpath("//input[@id = \"singleFileInput\"]"));
        singleFile.sendKeys("C:\\Users\\Mayank\\Downloads\\Text1.txt");

        WebElement multiFile = driver.findElement(By.xpath("//input[@id = \"multipleFilesInput\"]"));
        String file1 = "C:\\Users\\Mayank\\Downloads\\Text1.txt";
        String file2 = "C:\\Users\\Mayank\\Downloads\\Text2.txt";
        multiFile.sendKeys(file1 + "\n" + file2);
    }
}
