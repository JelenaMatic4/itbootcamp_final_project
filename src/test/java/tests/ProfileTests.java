package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends Base{
    @Test
    public void editsProfile (){
        signupPage.clickSignup();
        String name = "Jelena Matic";
        String email = faker.internet().emailAddress();
        String password = "123654";
        String confirmPassword = "123654";
        signupPage.enterData(name, email, password, confirmPassword);
        signupPage.clickCloseButton();
        profilePage.clickProfileButton();
        //String nameField = faker.name();
        String phone = faker.phoneNumber().phoneNumber();
        String city = faker.address().city();
        String country = faker.address().country();
        String twitter = faker.internet().url();
        String gitHub = faker.internet().url();
        profilePage.enterData(phone,city,country,twitter,gitHub);
        profilePage.clickSaveButton();
        String expectedMess = "Profile saved successfuly";
        String actualMess = profilePage.getMessageBox().getText();
        Assert.assertEquals(expectedMess,actualMess);
        //String actualName = profilePage.getNameField().getAttribute("autocomplete");
        //String actualEmail = profilePage.getEmailField().getAttribute("autocomplete");
        String actualPhone = profilePage.getPhoneField().getAttribute("autocomplete");
        //String actualCity = profilePage.getCityField().;//??
        String actualCountry = profilePage.getCountryField().getAttribute("autocomplete");
        String actualTwitter = profilePage.getTwitterField().getAttribute("autocomplete");
        String actualGitHub = profilePage.getGitHubField().getAttribute("autocomplete");
        Assert.assertEquals(phone,actualPhone);
        //Assert.assertEquals(city,actualCity);
        Assert.assertEquals(country,actualCountry);
        Assert.assertEquals(twitter,actualTwitter);
        Assert.assertEquals(gitHub,actualGitHub);

    }
}
