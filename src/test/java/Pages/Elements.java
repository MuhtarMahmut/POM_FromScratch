package Pages;

import Utilities.ExcelCredential;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        driver.navigate().to(ExcelCredential.WebSite);

        wait.until(ExpectedConditions.visibilityOf(signin));
        signin.click();

        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(ExcelCredential.UserName + Keys.ENTER);


        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(ExcelCredential.Password+Keys.ENTER);

    }




}
