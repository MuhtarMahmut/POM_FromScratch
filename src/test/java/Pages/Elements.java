package Pages;

import Utilities.TestBase;
import Utilities.configReader;
import Utilities.credentials;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class Elements extends TestBase {
    public Elements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='uh-signin']")
    WebElement signin;

     @FindBy(xpath = "//*[@id='login-username']")
    WebElement username;

     @FindBy(xpath = "//*[@id='login-passwd']")
    WebElement password;

    public void loginprocess(){
        driver.navigate().to(configReader.getinfo("WebsiteAddress"));

        wait.until(ExpectedConditions.visibilityOf(signin));
        signin.click();

        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(configReader.getinfo("UserName") + Keys.ENTER);


        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(configReader.getinfo("PassWord")+Keys.ENTER);

    }




}
