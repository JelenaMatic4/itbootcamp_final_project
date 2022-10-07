package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AdminCitiesTests extends Base {
    @Test
    public void visitTheAdminCitiesPageAndListCities (){
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        homePage.clickAdminButton();
        adminPage.clickCitiesButton();
        String expectedResultURL = "https://vue-demo.daniel-avellaneda.com/admin/cities";
        String actualResultURL = adminPage.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResultURL, actualResultURL);
        Assert.assertTrue(adminPage.getLogoutButton().isDisplayed());
    }
    @Test
    public void createNewCity (){
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        homePage.clickAdminButton();
        adminPage.clickCitiesButton();
        adminPage.clickNewItemButton();
        String city = faker.address().city();
        try {
            Thread.sleep(3000);} catch (InterruptedException e){
            e.printStackTrace();
        }
        adminPage.enterName(city);
        adminPage.clickSaveButton();
        String expectedResultMessage = "Saved successfully";
        String actualResultMessage = adminPage.getInfoSave().getText();
        Assert.assertTrue(actualResultMessage.contains(expectedResultMessage));
    }
    @Test
    public void editCity (){
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        homePage.clickAdminButton();
        adminPage.clickCitiesButton();
        String edited = " -edited";
        cityPage.editCity(edited);
        String expectedMessage = "Saved successfully";
        String actualMessage = cityPage.getInfoMessage().getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        //wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]"),
        //        "Saved successfully\nCLOSE"));


        //Finding number of Rows
        //List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/div/div/table[1]/tbody/tr[1]/td[1]"));
        // int rowCount = rowsNumber.size();

        //
        //Finding number of Columns

        //List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/div/div/table[1]/thead/tr/th[1]"));
        //int columnCount = columnsNumber.size();
        //System.out.println("No of columns in this table : " + columnCount);
////*[@id="edit"]/div/div/table[1]/tbody/tr[1]/td[1]"));

    }
    @Test
    public void searchCity (){
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        homePage.clickAdminButton();
        adminPage.clickCitiesButton();
        String cityName = "Timacus";
        cityPage.searchCity(cityName);
    }
    @Test
    public void deleteCity (){

    }
}
