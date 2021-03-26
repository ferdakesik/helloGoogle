package google.step_def;

import google.pages.GoogleSearch;
import google.utilities.BrowserUtils;
import google.utilities.ConfigurationReader;
import google.utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_Search_Step_Def {

     GoogleSearch googleSearch= new GoogleSearch();

    @Given("I am on the google page")
    public void iam_on_the_google_page() {
        String url = ConfigurationReader.getProperty("url");
        DriverFactory.getDriver().get(url);
        String expectedTitle= "Google";
        BrowserUtils.assertTitle(expectedTitle);
    }


    @When("I enter {string} and enter search area")
    public void ienter_and_enter_search_area(String string) {
        string="Iphone";
        googleSearch.searchTopic(string);

    }
    @Then("I should be able to see the search results")
    public void I_should_be_able_to_see_the_search_result() {
        String expectedTitle="Iphone - Google Search";
        BrowserUtils.assertTitle(expectedTitle);

    }


}





