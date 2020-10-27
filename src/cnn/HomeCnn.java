package cnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeCnn {

    WebDriver driver;
    String cnnURL = "https://www.cnn.com/";


    @BeforeMethod
    public void setUp() {

        String browserDriverPath = "BrowserDriver/mac/chromedriver";          //Partial Path

        System.setProperty("webdriver.chrome.driver", browserDriverPath);
        driver = new ChromeDriver();

    }



    @Test
    public void checkHomePageTitle() throws InterruptedException {
        driver.get(cnnURL);
        String expectedTitle="CNN - Breaking News, Latest News and Videos";
        String actualTitle=driver.getTitle();
        // Validate Title
        Assert.assertEquals(actualTitle,expectedTitle,"Text Fail : Title did not Match");
        Thread.sleep(5000);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        //driver.quit();
    }


}
