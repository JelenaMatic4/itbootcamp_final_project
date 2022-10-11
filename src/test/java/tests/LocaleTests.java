package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends Base {
    @Test
    public void setLocaleToES() {
        homePage.clickLanguageButton();
        homePage.changeLanguageES("ES");
        String expectedTitle = "Página de aterrizaje";
        String actualTitle = homePage.getTitleField().getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test
    public void setLocaleToEN() {
        homePage.clickLanguageButton();
        homePage.changeLanguageEN("EN");
        String expectedTitle = "Landing";
        String actualTitle = homePage.getTitleField().getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test
    public void setLocaleToFR() {
        homePage.clickLanguageButton();
        homePage.changeLanguageFR("FR");
        String expectedTitle = "Page d'atterrissage";
        String actualTitle = homePage.getTitleField().getText();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
