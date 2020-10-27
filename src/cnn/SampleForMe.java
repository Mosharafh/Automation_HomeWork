package cnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleForMe {

    public static void main(String[] args) throws InterruptedException {
        String cnnURL = "https://www.cnn.com/";
        // String amazonURL = "https://www.amazon.com/"; // Firefox

        //String browserDriverPath = "/Users/mosharafhossain/IdeaProjects/Automation_HomeWork/BrowserDriver/mac/chromedriver";
        // OR
        String browserDriverPath = "BrowserDriver/mac/chromedriver";          //Partial Path
        // String FirefoxDriverDriverPath = "BrowserDriver/mac/geckodriver";     // Firefox


        System.setProperty("webdriver.chrome.driver", browserDriverPath);
        // System.setProperty("webdriver.gecko.driver", FirefoxDriverDriverPath);    //Firefox


        WebDriver driver = new ChromeDriver();
        driver.get(cnnURL);
        Thread.sleep(5000);
        driver.close();
        //driver.quit();


        // WebDriver driver1 = new FirefoxDriver();          // Firefox
        // driver1.get(amazonURL);
        // driver1.close();


    }


}
