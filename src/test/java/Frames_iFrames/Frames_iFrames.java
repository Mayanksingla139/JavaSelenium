package Frames_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Frames_iFrames {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Frame 1
        WebElement element = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(element);
        WebElement frame1Element = driver.findElement(By.xpath("//input[@name='mytext1']"));
        System.out.println("Frame 1 text is: "+driver.findElement(By.xpath("//form//div[@align = \"center\"]")).getText());
        frame1Element.sendKeys("Welcome1");

        driver.switchTo().defaultContent(); // go back to page

        // Frame 2
        WebElement element1 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(element1);
        WebElement frame2Element = driver.findElement(By.xpath("//input[@name='mytext2']"));
        System.out.println("Frame 2 text is: "+driver.findElement(By.xpath("//form//div[@align = \"center\"]")).getText());
        frame2Element.sendKeys("Welcome2");

        driver.switchTo().defaultContent(); // go back to page

        // Frame 3
        WebElement element2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(element2);
        WebElement frame3Element = driver.findElement(By.xpath("//input[@name='mytext3']"));
        System.out.println("Frame 3 text is: "+driver.findElement(By.xpath("//form//div[@align = \"center\"]")).getText());
        frame3Element.sendKeys("Welcome3");
        // iFrame inside Frame 3
        driver.switchTo().frame(0);  // using index because in frame only 1 iframe is present
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();


        driver.quit();
    }
}
