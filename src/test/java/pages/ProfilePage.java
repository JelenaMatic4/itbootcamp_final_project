package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{

    private By profileButton = By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[3]");
    private By formData = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]");

    private By nameField = By.xpath("//*[@id=\"name\"]");

    private By emailField = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div/div[1]/span/div");
    private By phoneField = By.id("phone");
    private By cityField = By.id("city");
    private By countryField = By.id("country");
    private By twitterField = By.id("urlTwitter");
    private By gitHubField = By.id("urlGitHub");
    private By saveButton = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div/div[8]/button");

    private By messageBox = By.xpath("//* [contains (text(), 'Profile saved successfuly ')]");
// Profile saved successfuly

    public ProfilePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getProfileButton (){
        return getDriver().findElement(profileButton);
    }
    public WebElement getFormData(){
        return getDriver().findElement(formData);
    }

    public WebElement getNameField (){
        return getDriver().findElement(nameField);
    }
    public WebElement getEmailField () {
        return getDriver().findElement(emailField);
    }
    public WebElement getPhoneField (){
        return getDriver().findElement(phoneField);
    }
    public Select getCityField(){
        WebElement cityFieldEl = getDriver().findElement(cityField);
        Select selectCity = new Select(cityFieldEl);
        return selectCity;
    }
    public WebElement getCountryField (){
        return getDriver().findElement(countryField);
    }
    public WebElement getTwitterField () {
        return getDriver().findElement(twitterField);
    }
    public WebElement getGitHubField () {
        return getDriver().findElement(gitHubField);
    }
    public WebElement getSaveButton () {
        return getDriver().findElement(saveButton);
    }
    public WebElement getMessageBox (){
        return getDriver().findElement(messageBox);
    }
    public void clickProfileButton (){
        WebElement profileBtnEl = getProfileButton();
        profileBtnEl.click();
    }
    public void clickSaveButton (){
        WebElement saveButtonEl = getSaveButton();
        saveButtonEl.click();
    }
    public boolean isFormDataPresented () {
        return getFormData().isDisplayed();
    }
    public void enterData(String phone, String city, String country, String twitter, String gitHub) {
        //getNameField().sendKeys(name);
        //getEmailField().sendKeys(email);
       getPhoneField().sendKeys(phone);
       Select citySelect = getCityField();
       citySelect.selectByVisibleText(city);
       getCountryField().sendKeys(country);
       getTwitterField().sendKeys(twitter);
       getGitHubField().sendKeys(gitHub);
    }
}
