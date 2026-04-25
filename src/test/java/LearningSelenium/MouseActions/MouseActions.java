package LearningSelenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        // Hover
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement btnPointMe = driver.findElement(By.xpath("//button[@class = \"dropbtn\"]"));
        WebElement mobileOption = driver.findElement(By.xpath("//a[text() = \"Mobiles\"]"));

        action.moveToElement(btnPointMe).build().perform();
        mobileOption.click();
        System.out.println("Mobile button got clicked");

        // Right Click
        WebElement txtApple = driver.findElement(By.xpath("//a[text() = \"Apple\"]"));
        action.contextClick(txtApple).perform();
        System.out.println("Right Clicked Performed");

        // Double Click
        WebElement btnCopyText = driver.findElement(By.xpath("//button[text() = \"Copy Text\"]"));
        action.doubleClick(btnCopyText).perform();
        WebElement inputField = driver.findElement(By.xpath("//input[@id = \"field2\"]"));
        if(inputField.getAttribute("value").equalsIgnoreCase("Hello World!")){
            System.out.println("Double Clicked Performed");
        }else{
            System.out.println("Double Clicked Not Performed");
        }

        // Drag and drop
        WebElement dragElement = driver.findElement(By.xpath("//div[@id= \"draggable\"]"));
        WebElement dropElement = driver.findElement(By.xpath("//div[@id= \"droppable\"]"));
        action.dragAndDrop(dragElement, dropElement).perform();
        if(driver.findElement(By.xpath("//p[text() = \"Dropped!\"]")).isDisplayed()){
            System.out.println("Drag and Drop Performed");
        }else{
            System.out.println("Drag and Drop Not Performed");
        }




    }
}
