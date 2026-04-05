package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        int totalBrokenLinks = 0;
        List<WebElement> brokenLinks = driver.findElements(By.xpath("//div[@id = 'broken-links']//a"));
        System.out.println("Total Links are: "+ brokenLinks.size());
        for(WebElement brokenLink: brokenLinks){
            String brokenLinkHref = brokenLink.getAttribute("href");
            if(brokenLinkHref == null || brokenLinkHref.isEmpty()){
                System.out.println("No link is there");
                continue;
            }
            try{
                URL linkConnection = new URL(brokenLinkHref);
                HttpURLConnection conn = (HttpURLConnection) linkConnection.openConnection();
                conn.connect();
                if(conn.getResponseCode()>= 400){
                    System.out.println(conn.getResponseCode()+" Broken Link");
                    totalBrokenLinks++;
                }else{
                    System.out.println(conn.getResponseCode()+" Not Broken Link");
                }
            }catch (Exception e){

            }
        }
        System.out.println("Total Broken Links are: "+ totalBrokenLinks);
    }
}
