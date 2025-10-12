package testingInterview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    static WebDriver driver;

    public static void main(String[] args) {
       driver = new ChromeDriver();

       //timeouts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


       Alert alert =  driver.switchTo().alert();  //Important line and make WebDriver driver as static
       alert.accept();
       alert.dismiss();
       alert.sendKeys("Test");
       alert.getText();

       try{
           wait.until(ExpectedConditions.alertIsPresent());
           alert.accept();
       }
       catch (NoAlertPresentException e){
           System.out.println("No alert appeared");
       }

    }
}
