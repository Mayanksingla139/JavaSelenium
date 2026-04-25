package LearningSelenium.HandleBrowerSetting_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnableExtensionAtRunTime {
    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();

        // How to get crx file of extension
//        step 1: Add CRX Extractor/Downloader to chrome Browser (manually)
//        Step2 : Add SelectorsHub plugin to chrome browser (manually)
//        Step3 : Capture crx file for selectorshub extension
//        Step4: pass crx file path in automation script in Chrome Options

        // Enable extension at run time
        File file = new File("Path of downloaded crx file");
        option.addExtensions(file);

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println("Title is: " +driver.getTitle());


    }
}
