package LearningSelenium.First_Step_Towards_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class locators_PartialLinkTest_LinkTest_ID_ClassName_TagName {

    @Test
    public static void main(String[] args) throws InterruptedException {
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String fetchedTitle = driver.getTitle();
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);



        // Test Step 1:  Verifying gift card is displayed or not using link test and partial link test
        boolean giftCardBool = driver.findElement(By.linkText("Gift Cards")).isDisplayed();
        if(giftCardBool){
            System.out.println("Gift Card is diplayed");
        }else{
            System.out.println("Gift Card not displayed Test case failed");
        }
        Thread.sleep(5000);

        boolean giftBool = driver.findElement(By.partialLinkText("Gift")).isDisplayed();
        if(giftBool){
            System.out.println("Gift Card is diplayed");
        }else{
            System.out.println("Gift Card not displayed Test case failed");
        }

        // Test Step 2: Verifying list of headers
        List<WebElement> headerList = driver.findElements(By.className("nav-li"));
        if(headerList.size() == 6){
            System.out.println("Header list size is 6, Hence Test case is pass");
            List<String> headerNameList = List.of("Today's Deals", "Prime Video", "Registry", "Gift Cards", "Customer Service", "Sell");
            for(int i=0; i<headerNameList.size(); i++){
                if(!headerList.get(i).getText().equalsIgnoreCase(headerNameList.get(i))){
                    System.out.println("Header list is not as per the requirements");
                }
            }
            System.out.println("Header list name are displaying as per the requirement");
        }else{
            System.out.println("Header size is not as per the requirement hence test case is fails");
        }

        // Test Step 3: Count Number of images
        List<WebElement> imgList = driver.findElements(By.tagName("img"));
        System.out.println("images count is: "+imgList.size());


        // Close driver
        driver.quit();

    }
}
