package tests;

import org.openqa.selenium.remote.http.UrlPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends Base {
    @Test
    public void visitsTheSignupPage(){
        signupPage.clickSignup();
        String expectedURL ="https://vue-demo.daniel-avellaneda.com/signup";
        String actualURL = signupPage.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }
    @Test
    public void checksInputFields(){
        signupPage.clickSignup();
        String expectedEmailSignup = "email";
        String expectedPasswordSignup = "password";
        String expectedConfirmPasswordSignup = "password";
        String actualEmailSignup = signupPage.getEmailField().getAttribute("type");
        String actualPasswordSignup = signupPage.getPasswordField().getAttribute("type");
        String actualConfirmPasswordSignup = signupPage.getPasswordConfirmField().getAttribute("type");
        Assert.assertEquals(actualEmailSignup, expectedEmailSignup);
        Assert.assertEquals(actualPasswordSignup, expectedPasswordSignup);
        Assert.assertEquals(actualConfirmPasswordSignup,expectedConfirmPasswordSignup);

    }
    @Test
    public void displaysErrorWhenUserAlreadyExists(){
        signupPage.clickSignup();
        String name = "Test Test";
        String email = "admin@admin.com";
        String password = "123654";
        String confirmPassword = "123654";
        signupPage.enterData(name, email, password, confirmPassword);
        String expectedMessage = "E-mail already exists";
        String actualMessage = signupPage.getMessageBox().getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        String expectedURL = "https://vue-demo.daniel-avellaneda.com/signup";
        //driverWait.until(ExpectedConditions.urlContains("/signup"));
        String actualURL = signupPage.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    @Test
    public void signUp (){
        signupPage.clickSignup();
        String name = "Jelena Matic";
        String email = faker.internet().emailAddress();
        String password = "123654";
        String confirmPassword = "123654";
        signupPage.enterData(name, email, password, confirmPassword);
String expectedAlert = "IMPORTANT: Verify your account";
String actualAlert = signupPage.getAlertMessage().getText();
Assert.assertEquals(expectedAlert, actualAlert);


    }
}
