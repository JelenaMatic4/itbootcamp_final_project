package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    public By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[3]");
    public By adminButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]");

    public By logoutButton = By.className("btnLogout");

    public By languageButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button");

    public By titleField = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {

        super(driver, driverWait);
    }

    public WebElement getLoginButton() {

        return getDriver().findElement(loginButton);
    }

    public WebElement getAdminButton() {

        return getDriver().findElement(adminButton);
    }

    public WebElement getLogoutButton() {

        return getDriver().findElement(logoutButton);
    }

    public WebElement getLanguageButton() {
        return getDriver().findElement(languageButton);
    }

    public WebElement getTitleField() {
        return getDriver().findElement(titleField);
    }


    public void openLogin() {

        WebElement loginButton = getLoginButton();
        loginButton.click();

    }

    public void clickAdminButton() {
        WebElement adminButton = getAdminButton();
        adminButton.click();
    }

    public void clickLogoutButton() {
        WebElement logOutButton = getLogoutButton();
        logOutButton.click();
    }

    public void clickLanguageButton() {
        WebElement languagesButton = getLanguageButton();
        languagesButton.click();
    }


    public void changeLanguageES(String languageID) {
        List<WebElement> languageList = getDriver().findElements(By.className("v-list-item"));
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getText().contains(languageID.toUpperCase())) {
                languageList.get(i).click();
            }
        }
    }

    public void changeLanguageEN(String languageID) {
        List<WebElement> languageList = getDriver().findElements(By.className("v-list-item"));
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getText().contains(languageID.toUpperCase())) {
                languageList.get(i).click();
            }
        }
    }

    public void changeLanguageFR(String languageID) {
        List<WebElement> languageList = getDriver().findElements(By.className("v-list-item"));
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getText().contains(languageID.toUpperCase())) {
                languageList.get(i).click();
            }
        }
    }


}



