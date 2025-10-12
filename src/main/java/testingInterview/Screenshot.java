package testingInterview;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class Screenshot  implements ITestListener {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://google.com");
    }

    @Test
    public void sampleTest(){
        String title = driver.getTitle();
        Assert.assertEquals("Google", "Google", "Passed");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    public void takeScreenshot(String testName){
        String timeStamp = String.valueOf(LocalDateTime.now());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("target/"+testName+timeStamp+".png");

        try {
            FileHandler.copy(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Listener Implementation
    public void onTestFailure(ITestResult result){
        takeScreenshot(result.getName());
    }

}

