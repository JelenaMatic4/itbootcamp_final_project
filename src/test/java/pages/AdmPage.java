package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdmPage extends BasePage {
    private By logoutButton = By.className("btnLogout");
    private By citiesButton = By.className("btnAdminCities");

    private By newItemButton = By.className("btnNewItem");

    private By cityNameField = By.id("name");

    //v-input v-input--has-state theme--light v-text-field v-text-field--is-booted error--text
    private By saveButton = By.className("btnSave");

    private By infoSave = By.xpath("//* [contains (text(), ' Saved successfully ')]");
            // Saved successfully
private By searchField = By.id("search");


    public AdmPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLogoutButton() {
        return getDriver().findElement(logoutButton);
    }

    public WebElement getCitiesButton() {

        return getDriver().findElement(citiesButton);
    }

    public WebElement getNewItemButton() {
        return getDriver().findElement(newItemButton);
    }

    public WebElement getCityNameField() {
        return getDriver().findElement(cityNameField);
    }
        public WebElement getSaveButton () {
            return getDriver().findElement(saveButton);

        }
        public WebElement getInfoSave (){
        return getDriver().findElement(infoSave);
        }
        public WebElement getSearchField (){
        return getDriver().findElement(searchField);
        }


    public void clickCitiesButton() {
        WebElement citiesButton = getCitiesButton();
        citiesButton.click();
    }

    public void clickNewItemButton() {
        WebElement newItemButton = getNewItemButton();
        newItemButton.click();
    }

    public void enterName(String name) {
        WebElement cityNameField1 = getCityNameField();
        //cityNameField1.click();
        cityNameField1.sendKeys(name);
    }

    public void clickSaveButton () {
        WebElement saveButton = getSaveButton();
        saveButton.click();

    }


}
//WebElement cellAddress = Rowtable.findElement(By.xpath(“//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/div/div/table[1]/tbody/tr[4]/td[3]”));
//String value = cellAddress.getText();
   // Actions action = new Actions(getDriver());

/*WebElement citiesButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]"));
action.moveToElement(citiesButton).click().build().perform();

WebElement citiesItem = getDriver().findElement(By.className("btnAdminCities"));
action.moveToElement().click().build().perform();*/

//Finding number of Rows
//        //List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/div/div/table[1]/tbody/tr[1]/td[1]"));
//        // int rowCount = rowsNumber.size();

