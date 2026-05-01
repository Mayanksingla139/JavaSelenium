package UnderstandingTestNgFeatures.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    WebDriver driver;

    FormPage(WebDriver driver){
        this.driver = driver;
    }

    By NameLocator = By.xpath("//input[@id = 'name']");
    By EmailLocator = By.xpath("//input[@id = 'email']");
    By PhoneNumberLocator = By.xpath("//input[@id = 'phone']");

    public void setName(String userName){
        driver.findElement(NameLocator).sendKeys(userName);
    }

    public void setEmail(String email){
        driver.findElement(EmailLocator).sendKeys(email);
    }

    public void setPhoneNumber(String phoneNumber){
        driver.findElement(PhoneNumberLocator).sendKeys(phoneNumber);
    }

}
