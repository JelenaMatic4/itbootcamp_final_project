package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage{
    private By signupButton = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[4]");
////*[@id="app"]/div/div/header/div/div[3]/a[4]
    private By signMeUpButton = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div/div[2]/span/form/div/div[5]/button");
    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");

    private By passwordConfirmField = By.id("confirmPassword");
    private By nameField = By.xpath("//*[@id=\"name\"]");

    private By messageBox = By.xpath("//* [contains (text(), 'E-mail already exists')]");

    private By alertMessage = By.xpath(("//*[contains (text(), ' IMPORTANT: Verify your account ')]"));
    ////*[@id="app"]/div[4]/div/div/div[1]
    public SignupPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getSignupButton (){
        return getDriver().findElement(signupButton);
    }
    public WebElement getEmailField (){
        return getDriver().findElement(emailField);
    }
    public WebElement getPasswordField (){
        return getDriver().findElement(passwordField);
    }
    public WebElement getPasswordConfirmField (){
        return getDriver().findElement(passwordConfirmField);
    }
    public WebElement getSignMeUpButton (){
        return getDriver().findElement(signMeUpButton);
    }
    public WebElement getNameField(){
        return getDriver().findElement(nameField);
    }
    public WebElement getMessageBox (){
        return getDriver().findElement(messageBox);
    }
    public WebElement getAlertMessage(){
        return getDriver().findElement(alertMessage);
    }
    public void clickSignup (){
        WebElement signUpButton = getSignupButton();
        signUpButton.click();
    }
    public void enterData (String name, String email, String password, String confirmPassword){
        WebElement nameFieldEl = getNameField();
        nameFieldEl.sendKeys(name);
        WebElement emailFieldEl = getEmailField();
        emailFieldEl.sendKeys(email);
        WebElement passwordFieldEl = getPasswordField();
        passwordFieldEl.sendKeys(password);
        WebElement confirmPasswordEl = getPasswordConfirmField();
        confirmPasswordEl.sendKeys(confirmPassword);
        WebElement signMeUpButton1 = getSignMeUpButton();
        signMeUpButton1.click();
    }

}
