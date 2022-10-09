package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage{

    public By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[3]");
    public By adminButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]");

    public By logoutButton = By.className("btnLogout");

    public By languageButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button");
    ////*[@id="app"]/div[2]/div
    ////*[@id="app"]/div[2]
public By enButton = By.id("list-item-93");
public By esButton = By.id("list-item-95");
public By frButton = By.id("list-item-97");
    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLoginButton(){
        return getDriver().findElement(loginButton);
    }

    public WebElement getAdminButton(){
        return getDriver().findElement(adminButton);
    }
    public WebElement getLogoutButton (){
        return getDriver().findElement(logoutButton);
    }
    public WebElement getLanguageButton (){
        return getDriver().findElement(languageButton) ;
    }
    public WebElement getEsButton (){
        return getDriver().findElement(esButton);
    }
    public WebElement getEnButton (){
        return getDriver().findElement(enButton);
    }
    public WebElement getFrButton (){
        return getDriver().findElement(frButton);
    }

    public void openLogin (){

        WebElement loginButton = getLoginButton();
        loginButton.click();

    }
    public void clickAdminButton () {
        WebElement adminButton = getAdminButton();
        adminButton.click();}
    public void clickLogoutButton (){
        WebElement logOutButton =getLogoutButton();
        logOutButton.click();
    }

    public void  clickLanguageButton (){
        WebElement languagesButton = getLanguageButton();
        languagesButton.click();
    }
    public void changeLanguageES (){
WebElement esLanguageBtn = getEsButton();
        esLanguageBtn.click();
        }
        public void changeLanguageEN (){
        WebElement enLanguageBtn = getEnButton();
        enLanguageBtn.click();
        }
        public void changeLanguageFR (){
        WebElement frLanguageBtn = getFrButton();
        frLanguageBtn.click();
        }
    }


