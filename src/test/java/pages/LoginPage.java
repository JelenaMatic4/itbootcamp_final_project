package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private By email = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button");

    private By messageStatus = By.xpath("//* [contains (text(), 'User does not exists')]");

    private By messagePasswordStatus = By.xpath("//* [contains (text(), 'Wrong password')]");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {

        super(driver, driverWait);
    }

    public WebElement getEmail() {

        return getDriver().findElement(email);
    }

    public WebElement getPassword() {

        return getDriver().findElement(password);
    }

    public WebElement getLoginButton() {
        return getDriver().findElement(loginButton);
    }

    public WebElement getMessageStatus() {
        return getDriver().findElement(messageStatus);
    }

    public WebElement getMessagePasswordStatus() {
        return getDriver().findElement(messagePasswordStatus);
    }

    public void login(String email, String password) {
        WebElement emailElement = getEmail();
        emailElement.sendKeys(email);
        WebElement passwordElement = getPassword();
        passwordElement.sendKeys(password);
        WebElement loginButtonElement = getLoginButton();
        loginButtonElement.click();
    }
}
