package Tables_Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Static_Table {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        int rowCount = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr//td[1]")).size();
        int columnCount = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr[2]//td")).size();

        System.out.println("Row count is: "+rowCount);
        System.out.println("Column count is: "+columnCount);

        // print book name whose author is Amit
        for(int i=2; i<=rowCount+1; i++){
            String authorName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[2]")).getText();
            if(authorName.equalsIgnoreCase("Amit")){
                String bookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[1]")).getText();
                System.out.println("Amit is author of: "+bookName);
            }
        }

        // total price of books
        int totalPrice = 0;
        for(int i=2; i<=rowCount+1; i++){
            int bookPrice = Integer.parseInt(driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[4]")).getText());
            totalPrice+=bookPrice;
        }
        System.out.println("Total price of books are: "+totalPrice);

        driver.quit();
    }
}
