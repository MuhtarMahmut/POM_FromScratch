package Tests;

import Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {


    @Test(priority = 1)
    public void firstTest() {

       driver.get("https://www.yahoo.com");

    }

    @Test(priority = 2)
    public void SecondTest(){
        driver.get("https://www.google.com");

    }

    @Test(priority = 3)
    public void ThirdTest(){
        driver.get("https://www.facebook.com");


    }



}
