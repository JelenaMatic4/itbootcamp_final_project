package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends Base {
    @Test
    public void editsProfile() {
        /*signupPage.clickSignup();
        String name = "Jelena Matic";
        String email = faker.internet().emailAddress();
        String password = "123654";
        String confirmPassword = "123654";
        signupPage.enterData(name, email, password, confirmPassword);
        signupPage.clickCloseButton();*/
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        profilePage.clickProfileButton();
        String nameProfile = faker.name().fullName();
        String emailProfile = faker.internet().emailAddress();
        String phone = faker.phoneNumber().phoneNumber();
        String city = "Bogotá";
        String country = faker.address().country();
        String twitter = "https://" + faker.internet().url();
        String gitHub = "https://" + faker.internet().url();
        profilePage.enterData(emailProfile, nameProfile, phone, city, country, twitter, gitHub);
        profilePage.clickSaveButton();
        String expectedMess = "Profile saved successfuly";
        String actualMess = profilePage.getMessageBox().getText();
        Assert.assertEquals(expectedMess, actualMess);
        String actualName = profilePage.getNameField().getAttribute("value");
        String actualEmail = profilePage.getEmailField().getAttribute("value");
        String actualPhone = profilePage.getPhoneField().getAttribute("value");
        String actualCity = profilePage.getCityField().getAttribute("value");
        String actualCountry = profilePage.getCountryField().getAttribute("value");
        String actualTwitter = profilePage.getTwitterField().getAttribute("value");
        String actualGitHub = profilePage.getGitHubField().getAttribute("value");
        Assert.assertEquals(nameProfile, actualName);
        Assert.assertEquals(emailProfile, actualEmail);
        Assert.assertEquals(phone, actualPhone);
        Assert.assertEquals(city, actualCity);
        Assert.assertEquals(country, actualCountry);
        Assert.assertEquals(twitter, actualTwitter);
        Assert.assertEquals(gitHub, actualGitHub);

    }
}
