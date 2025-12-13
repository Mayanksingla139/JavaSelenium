package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openingUrl_titleCheck_typingText {

    @Test
    public static void main(String[] args) throws InterruptedException {
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String fetchedTitle = driver.getTitle();

        // Test Step 1: Check Title
        String actualTile = "Amazon.com";
        if(fetchedTitle.equals(actualTile)){
            System.out.println("Fetched title is: " +fetchedTitle);
            System.out.println("Test case passed");
        }else{
            System.out.println("Fetched title is: " +fetchedTitle);
            System.out.println("Test case failed");
        }

        // Test Step 2: Click on continue to shopping
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);

        // Test Step 3: Type in search
        boolean searchDisplayed = driver.findElement(By.name("field-keywords")).isDisplayed();
        if(searchDisplayed){
            driver.findElement(By.name("field-keywords")).sendKeys("Iphone 17 Pro Max" + Keys.ENTER);
            System.out.println("Search is diplayed and we are searching item");
        }else{
            System.out.println("Search not displayed Test case failed");
        }

        // Close driver
        driver.quit();
//        driver.close();

    }
}
