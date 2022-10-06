package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage{

    public By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[3]");
    public By adminButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]");


    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLoginButton(){
        return getDriver().findElement(loginButton);
    }

    public WebElement getAdminButton(){
        return getDriver().findElement(adminButton);
    }

    public void openLogin (){

        WebElement loginButton = getLoginButton();
        loginButton.click();

    }
    public void clickAdminButton () {
        WebElement adminButton = getAdminButton();
        adminButton.click();}

}
