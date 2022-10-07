package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.AdmPage;
import pages.CityPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class Base {
    private WebDriver driver;
    private WebDriverWait driverWait;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected Faker faker;
    protected AdmPage adminPage;

    protected CityPage cityPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
        faker = new Faker();
        adminPage = new AdmPage(driver,driverWait);
        cityPage = new CityPage(driver, driverWait);
    }
    @BeforeMethod
    public void beforeMethode(){
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void afterClass (){
        driver.quit();
    }
}
