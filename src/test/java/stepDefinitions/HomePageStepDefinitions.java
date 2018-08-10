package stepDefinitions;

import config.MyConfig;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePageStepDefinitions extends MyConfig {

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


    @Given("^user opens HomePage$")
    public void user_opens_HomePage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies HomePage is opened$")
    public void verifies_HomePage_is_opened() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user click main Logo$")
    public void user_click_main_Logo() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
