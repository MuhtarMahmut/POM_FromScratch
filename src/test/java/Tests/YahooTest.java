package Tests;

import Pages.Elements;
import Utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {

    @BeforeMethod
   public void setup2(){
        Elements e=new Elements();
        e.loginprocess();
   }

    @Test(priority = 1)
    public void firstTest() {
       act.pause(3000).perform();

    }

    @Test(priority = 2)
    public void SecondTest(){

    }

    @Test(priority = 3)
    public void ThirdTest(){

    }


}