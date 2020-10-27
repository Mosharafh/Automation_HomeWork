package cnn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestCnn {

    WebDriver driver;
    String cnnURL = "https://www.cnn.com/";


    @BeforeMethod
    public void setUp() {       // Fro all test cases
        String browserDriverPath = "BrowserDriver/mac/chromedriver";          //Partial Path
        System.setProperty("webdriver.chrome.driver", browserDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // 20 sec wait time to load
    }           // implicitlyWait = in this case if page doesnt load in 20 sec test will be fail

    @Test(enabled = false) // false=will not execute
    public void checkHomePageTitle() throws InterruptedException {
        driver.get(cnnURL);
        String expectedTitle = "CNN - Breaking News, Latest News and Videos";
        String actualTitle = driver.getTitle();
        // Validate Title
        Assert.assertEquals(actualTitle, expectedTitle, "Text Fail : Title did not Match");
        Thread.sleep(5000);

    }

    // Sports
    @Test(enabled = false) // true = will execute
    public void searchBoxSports() throws InterruptedException {
        // Open Browser and Navigate to CNN URL
        driver.get(cnnURL);
        // Enter "spotrs" in the search box                 // sendKeys to type something
        driver.findElement(By.id("footer-search-bar")).sendKeys("sports");      // By id
        Thread.sleep(5000);
        // Click on search button, css for click button
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        //Validate
        String expectedText = "sports";// expectedText copy from webelement
        //String actualText= driver.findElement(By.cssSelector("div.cnn-search__results-count > strong")).getText();
        String actualText = driver.findElement(By.xpath("//strong[text()='sports']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }

    // Politics
    @Test(enabled = false)
    public void searchBoxPolitics() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("Politics");
        Thread.sleep(5000);
        //====test case for Politics======


        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "Politics";
        String actualText = driver.findElement(By.xpath("//strong[text()='Politics']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void searchBoxStyle() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("Style");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "Style";
        String actualText = driver.findElement(By.xpath("//strong[text()='Style']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void searchBoxOpinion() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("Opinion");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "Opinion";
        String actualText = driver.findElement(By.xpath("//strong[text()='Opinion']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void searchBoxWorld() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("World");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "World";
        String actualText = driver.findElement(By.xpath("//strong[text()='World']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void searchBoxTravel() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("Travel");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "Travel";
        String actualText = driver.findElement(By.xpath("//strong[text()='Travel']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void searchBoxHealth() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("footer-search-bar")).sendKeys("Health");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#footer-nav-container div:nth-child(1) div form button")).click();
        Thread.sleep(5000);
        String expectedText = "Health";
        String actualText = driver.findElement(By.xpath("//strong[text()='Health']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void BurgerMenu() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.className("menu-icon"));
        Thread.sleep(5000);
        driver.findElement(By.className("menu-icon")).click();
        Thread.sleep(5000);
        String expectedText = "Search CNN - Videos, Pictures, and News - CNN.com";
        String actualText = driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Failed: Failed");
    }


    @Test(enabled = false)
    public void cnnLogo() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]")).click();
        Thread.sleep(5000);
        // String expectedText = "Health";
        // String actualText = driver.findElement(By.xpath("//strong[text()='Health']")).getText();
        //Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void userAcc() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//div[@class='Flex-sc-1sqrs56-0 indexes__HideOnMobile-nujtvs-13 fSxGEU']"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='Flex-sc-1sqrs56-0 indexes__HideOnMobile-nujtvs-13 fSxGEU']")).click();
        Thread.sleep(5000);
        String expectedText = "log in";
        String actualText = driver.findElement(By.xpath("//*[@id=\"login-title\"]")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void wildFire() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"homepage-injection-zone-1\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"homepage-injection-zone-1\"]")).click();
        Thread.sleep(5000);
        // String expectedText = "Health";
        //String actualText = driver.findElement(By.xpath("//strong[text()='Health']")).getText();

        //Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void Analysis() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"homepage1-zone-1\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"homepage1-zone-1\"]")).click();
        Thread.sleep(5000);
        String expectedText = "Analysis by James Griffiths, CNN";
        String actualText = driver.findElement(By.xpath("//*[@id=\"body-text\"]")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void us() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]")).click();
        Thread.sleep(5000);
        String expectedText = "Health";
        String actualText = driver.findElement(By.xpath("//strong[text()='Health']")).getText();

        Assert.assertEquals(actualText, expectedText, "Test Failed: Search keyword did not Match");
    }


    @Test(enabled = false)
    public void voterGuide() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"homepage-injection-zone-2\"]"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"homepage-injection-zone-2\"]")).click();
        Thread.sleep(5000);
    }


    @Test(enabled = false)
    public void newsBuzz() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//h2[text()='News and buzz']"));
        Thread.sleep(5000);

    }


    @Test(enabled = false)
    public void edition() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.id("edition-picker-toggle-desktop"));
        Thread.sleep(5000);


    }


    @Test(enabled = false)
    public void menuBar() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div"));
        Thread.sleep(5000);

    }


    @Test(enabled = true)
    public void search() throws InterruptedException {
        driver.get(cnnURL);
        driver.findElement(By.cssSelector("#header-nav-container div>div.Flex-sc-1sqrs56-0.sc-kvZOFW.cJcAaN> button svg")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header-search-bar\"]")).sendKeys("Food");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]//div/form/button")).click();
        Thread.sleep(5000);
        String expectedText = "Food";
        String actualText = driver.findElement(By.xpath("//strong[text()='Food']")).getText();
        Assert.assertEquals(actualText, expectedText, "Failed");
    }

    @AfterMethod
    public void tearDown() {
        //driver.close();
        driver.quit();
    }


}