package stepDefinitions;


import config.MyConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FeatureGoogle extends MyConfig {



    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

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
