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
        adminPage.enterName(city);
        adminPage.clickSaveButton();
        String expectedResultMessage = "Saved successfully";
        String actualResultMessage = adminPage.getInfoSave().getText();
        Assert.assertTrue(actualResultMessage.contains(expectedResultMessage));
    }
    @Test
    public void editCity (){
        List<WebElement> editButtons =



    }
    @Test
    public void searchCity (){

    }
    @Test
    public void deleteCity (){

    }
}
