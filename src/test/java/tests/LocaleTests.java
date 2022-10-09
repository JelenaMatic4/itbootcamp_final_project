package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends Base {
    @Test
    public void setLocaleToES (){
        homePage.clickLanguageButton();
        homePage.changeLanguageES();
        String expectedTitle = "Página de aterrizaje";
        String actualTitle = homePage.getDriver(). getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test
    public void setLocaleToEN (){
        homePage.clickLanguageButton();
        homePage.changeLanguageEN();
        String expectedTitle ="Landing";
        String actualTitle = homePage.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test
    public void setLocaleToFR (){
        homePage.clickLanguageButton();
        homePage.changeLanguageFR();
        String expectedTitle = "Page d'atterrissage";
        String actualTitle = homePage.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
