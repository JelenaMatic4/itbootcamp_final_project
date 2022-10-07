package pages;

import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CityPage extends BasePage {
    private By editButton = By.xpath("//*[@id=\"edit\"]");
    private By nameField = By.id("name");
    private By saveButton = By.className("btnSave");

    private By infoMessage = By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]");

    private By searchField = By.id("search");

    public CityPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

        public WebElement getEditButton (){
            return getDriver().findElement(editButton);
    }


    public WebElement getNameField() {
        return getDriver().findElement(nameField);
    }
    public WebElement getSaveButton (){
        return getDriver().findElement(saveButton);
    }
    public WebElement getInfoMessage(){
        return getDriver().findElement(infoMessage);
    }
    public WebElement getSearchField (){
        return getDriver().findElement(searchField);
    }

    public void editCity (String edited){
        WebElement editButtonEl = getEditButton();
        editButtonEl.click();
        WebElement nameFieldEl = getNameField();
        nameFieldEl.sendKeys(edited);
        WebElement saveButtonEl = getSaveButton();
        saveButtonEl.click ();


    }
    public void searchCity (String cityName){
        WebElement searchFieldEl = getSearchField();
        searchFieldEl.sendKeys(cityName);
    }

}
