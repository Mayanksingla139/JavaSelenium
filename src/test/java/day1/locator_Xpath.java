package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);

        // Absolute xpath
        WebElement absXpath = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        absXpath.sendKeys("Samsung S25" + Keys.ENTER);
        Thread.sleep(2000);
        boolean samsungS25Displayed = driver.findElement(By.xpath("//span[contains(text(), 'Samsung S25')]")).isDisplayed();
        if(samsungS25Displayed){
            System.out.println("Samsung S25: Result displayed");
        }else {
            System.out.println("Result not displayed Test case failed");
        }

        // Relative xpath
        WebElement relXpath = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        relXpath.sendKeys(Keys.CONTROL + "A");
        relXpath.sendKeys(Keys.DELETE);
        relXpath.sendKeys("Iphone 17 Pro Max" + Keys.ENTER);
        Thread.sleep(2000);
        boolean Iphone17ProMaxDisplayed = driver.findElement(By.xpath("//span[contains(text(), 'iPhone 17 Pro Max')]")).isDisplayed();
        if(Iphone17ProMaxDisplayed){
            System.out.println("Iphone 17 Pro Max: Result displayed");
        }else {
            System.out.println("Result not displayed Test case failed");
        }

        // multiple xpaths (and or)
        WebElement multiXpath = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\" or @placeholder=\"search\"]"));
        multiXpath.sendKeys(Keys.CONTROL + "A");
        multiXpath.sendKeys(Keys.DELETE);
        multiXpath.sendKeys("Iphone 16" + Keys.ENTER);
        Thread.sleep(1000);
        boolean Iphone16Displayed = driver.findElement(By.xpath("//span[contains(text(), 'iPhone 16')]")).isDisplayed();
        if(Iphone16Displayed){
            System.out.println("Iphone 16: Result displayed");
        }else {
            System.out.println("Result not displayed Test case failed");
        }

        // Chained xpath
        driver.findElement(By.xpath("//a/div/img[@class = \"s-image\"]")).click();
        Thread.sleep(2000);

        // Learn about xpath axes -> great topic to find locator for more dynamical pages


        //close browser
        driver.quit();
    }
}
