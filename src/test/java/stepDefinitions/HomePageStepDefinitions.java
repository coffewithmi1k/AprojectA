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

   /* @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(){
        driver.quit();
    }
*/

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

    @Then("^verifies Norway Home Page is opened$")
    public void verifies_Norway_Home_Page_is_opened() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies all needed categories are present on the page$")
    public void verifies_all_needed_categories_are_present_on_the_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies Best Artist block is present on the page$")
    public void verifies_Best_Artist_block_is_present_on_the_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user clicks left Best Artist block arrow$")
    public void user_clicks_left_Best_Artist_block_arrow() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^verifies block page is changed$")
    public void verifies_block_page_is_changed() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user clicks right Best artist block arrow$")
    public void user_clicks_right_Best_artist_block_arrow() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies Search is present on the page$")
    public void verifies_Search_is_present_on_the_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies Why choose us block is present$")
    public void verifies_Why_choose_us_block_is_present() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^clicks Become an Artist link$")
    public void clicks_Become_an_Artist_link() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies sign up form is opened with preselected choice for Artist$")
    public void verifies_sign_up_form_is_opened_with_preselected_choice_for_Artist() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies How we work block is present$")
    public void verifies_How_we_work_block_is_present() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^use choose locale Norway$")
    public void use_choose_locale_Norway() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verifies SOme little story text is present and correct$")
    public void verifies_SOme_little_story_text_is_present_and_correct() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
