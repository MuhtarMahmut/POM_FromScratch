package Tests;

import Utilities.MyLibrary;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {


    @Test(priority = 1)
    public void firstTest() {

       driver.get("https://www.yahoo.com");
        mylib.TakeScreenshotsplease("22223333");

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
