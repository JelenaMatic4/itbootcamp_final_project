package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends Base {
    @Test
    public void forbidsVisitsToHomeURLIfNotAuthenticated() {
        driver.get("https://vue-demo.daniel-avellaneda.com/home");
        String expectedResultURL = "/login";
        String actualResultURL = driver.getCurrentUrl();
        Assert.assertTrue(actualResultURL.contains(expectedResultURL));
    }

    @Test
    public void forbidsVisitsToProfileURLIfNotAuthenticated() {
        driver.get("https://vue-demo.daniel-avellaneda.com/profile");
        String expectedResultURL = "/login";
        String actualResultURL = driver.getCurrentUrl();
        Assert.assertTrue(actualResultURL.contains(expectedResultURL));

    }

    @Test
    public void forbidsVisitsToAdminCitiesURLIfNotAuthenticated() {
        driver.get("https://vue-demo.daniel-avellaneda.com/admin/cities");
        String expectedResultURL = "/login";
        String actualResultURL = driver.getCurrentUrl();
        Assert.assertTrue(actualResultURL.contains(expectedResultURL));

    }

    @Test
    public void forbidsVisitsToAdminUsersURLIfNotAuthenticated() {
        driver.get("https://vue-demo.daniel-avellaneda.com/admin/users");
        String expectedResultURL = "/login";
        String actualResultURL = driver.getCurrentUrl();
        Assert.assertTrue(actualResultURL.contains(expectedResultURL));

    }


}
