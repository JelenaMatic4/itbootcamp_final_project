package pages;

import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CityPage extends BasePage {
    private By editButton = By.xpath("//*[@id=\"edit\"]");

    private By deleteButton = By.id("delete");
    private By nameField = By.id("name");
    private By saveButton = By.className("btnSave");

    private By infoMessage = By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]");

    private By searchField = By.id("search");

    private By cityNameField = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]");
    ////*[@id="app"]/div[1]/main/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]
    private By warningBox = By.xpath("//* [contains (text(), 'Do you really want to delete this item?')] ");
    //Do you really want to delete this item?
    private By deleteBtnWarningBox = By.xpath("//*[@id=\"app\"]/div[7]/div/div/div[2]/button[2]");
    ////*[@id="app"]/div[7]/div/div/div[2]/button[2]

    private By messageBoxDelete = By.xpath(" //* [contains (text(), 'Deleted successfully')] ");

    //Deleted successfully
    public CityPage(WebDriver driver, WebDriverWait driverWait) {

        super(driver, driverWait);
    }

    public WebElement getEditButton() {
        return getDriver().findElement(editButton);
    }

    public WebElement getDeleteButton() {
        return getDriver().findElement(deleteButton);
    }

    public WebElement getNameField() {

        return getDriver().findElement(nameField);
    }

    public WebElement getSaveButton() {
        return getDriver().findElement(saveButton);
    }

    public WebElement getInfoMessage() {
        return getDriver().findElement(infoMessage);
    }

    public WebElement getDeleteBtnWarningBox() {
        return getDriver().findElement(deleteBtnWarningBox);
    }

    public WebElement getMessageBoxDelete() {
        return getDriver().findElement(messageBoxDelete);
    }

    public WebElement getSearchField() {

        return getDriver().findElement(searchField);
    }

    public WebElement getCityNameField() {
        return getDriver().findElement(cityNameField);
    }
    public WebElement getWarningBox (){
        return getDriver().findElement(warningBox);
    }

    public void editCity(String edited) {
        WebElement editButtonEl = getEditButton();
        editButtonEl.click();
        WebElement nameFieldEl = getNameField();
        nameFieldEl.sendKeys(edited);
        WebElement saveButtonEl = getSaveButton();
        saveButtonEl.click();
    }

    public void searchCity(String cityName) {
        WebElement searchFieldEl = getSearchField();
        searchFieldEl.sendKeys(cityName);
    }

    public void deleteCity() {
        WebElement deleteButtonEl = getDeleteButton();
        deleteButtonEl.click();
    }

    public void deleteComplete() {
        getDeleteBtnWarningBox().click();
    }

    public void findCityField(String cityName) {
        List<WebElement> tableRow = getDriver().findElements(By.className("v-data-table"));
        for (int i = 0; i < tableRow.size(); i++) {
            if (tableRow.get(i).getText().contains(cityName)) {
                tableRow.get(i).getText();
            }
        }
    }

}


