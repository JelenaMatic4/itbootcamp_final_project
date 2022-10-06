package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends Base{
    @Test
    public void visitTheLogInPage () {

        homePage.openLogin();
        String expectedResult = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResult = homePage.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult, actualResult);
    }

        @Test
        public void checkInputTypes () {
            homePage.openLogin();
            String expectedResultEmail = "email";
String expectedResultPassword = "password";
String actualResultEmail = loginPage.getEmail().getAttribute("type");
String actualResultPassword = loginPage.getPassword().getAttribute("type");
Assert.assertEquals(actualResultEmail, expectedResultEmail);
Assert.assertEquals(actualResultPassword, expectedResultPassword);
    }
    @Test
    public void displaysErrorsWhenUserDoesNotExist (){
        homePage.openLogin();
        String randomEmail = faker.internet().emailAddress();
        String randomPassword =faker.internet().password();
        loginPage.login(randomEmail,randomPassword);
        String expectedResultLogin = "User does not exists";
        String actualResultLogin = loginPage.getMessageStatus().getText();
        String expectedResultURL = "https://vue-demo.daniel-avellaneda.com/login";
        String actualResultURL = homePage.getDriver().getCurrentUrl();
        Assert.assertEquals(actualResultURL,expectedResultURL);
        Assert.assertEquals(expectedResultLogin, actualResultLogin);

    }
    @Test
    public void displaysErrorsWhenPasswordIsWrong(){
homePage.openLogin();
String email = "admin@admin.com";
String password = faker.internet().password();
loginPage.login(email, password);
String expectedMessage = "Wrong password";
String actualMessage = loginPage.getMessagePasswordStatus().getText();
Assert.assertEquals(expectedMessage, actualMessage);
String expectedResultURL = "https://vue-demo.daniel-avellaneda.com/login";
String actualResultURL = homePage.getDriver().getCurrentUrl();
Assert.assertEquals(actualResultURL,expectedResultURL);
    }
    @Test

    public void login(String email, String password){
        homePage.openLogin();
        loginPage.login("admin@admin.com", "12345");
        Assert.assertEquals("https://vue-demo.daniel-avellaneda.com/home",loginPage.getDriver().getCurrentUrl());
    }

    @Test

    public void logout(){

    }


    }


