package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FeatureGoogle {


     WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^User opens google$")
    public void user_opens_google()   {
driver.get("https://www.google.com.ua/");

    }

    @Then("^Verifies google is opened$")
    public void verifies_google_is_opened()   {
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }


}
