package Utilities;

import Pages.ExcelCredential;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

     static WebDriver driver;

    public static WebDriver getDriver(){
        String browsername = configReader.getinfo("Browser").toLowerCase();
        String browsername2= ExcelCredential.Browsername.toLowerCase();
        if(browsername.equals("chrome") || browsername2.equals("chrome") ){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }else if(browsername.equals("firefox")||browsername2.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }else if(browsername.equals("ie") || browsername2.equals("ie")){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        } else {
            System.err.println("\t\t\t\tInvalid Browser,\n \t\t\tPlease check the browsers name");
            System.exit(0);
        }
        return driver;
    }

    public static void CloseDriver(){
        driver.quit();
        driver=null;

    }

}
