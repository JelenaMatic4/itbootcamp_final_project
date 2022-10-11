package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected Faker faker;
    protected AdmPage adminPage;

    protected CityPage cityPage;
    protected SignupPage signupPage;
    protected ProfilePage profilePage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
        faker = new Faker();
        adminPage = new AdmPage(driver, driverWait);
        cityPage = new CityPage(driver, driverWait);
        signupPage = new SignupPage(driver, driverWait);
        profilePage = new ProfilePage(driver, driverWait);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethode() {
        driver.get("https://vue-demo.daniel-avellaneda.com");
    }
   /* @AfterMethod
    public void afterMethod (){
        homePage.getLogoutButton().click();
    }*/

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
