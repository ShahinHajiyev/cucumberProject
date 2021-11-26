package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class MainPageSearchStepDefs extends AbstractStepDefs{


    @When("the ok button is clicked")
    public void searchButtonIsClicked(){
        homePage.getSearchButton().click();
    }

    @Given("the {string} filled with {string}")
    public void FieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("a {string} error messages are shown")
    public void theMsgErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getSearchError();
        String secondErrorMessage = homePage.getSearch();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        }
        else if (secondErrorMessage.equals(msg)) {
            Assert.assertEquals(msg, secondErrorMessage);
        }
            else {
            fail();
        }
    }


    @Given("the search field filled with {string}")
    public void theSearchFieldFilledWith(String arg0) {
        homePage.fillField("search_query_top", arg0);
    }

    @Then("{string} error message will be shown")
    public void errorMessageWillBeShown(String arg0) {
        String errorMessage = homePage.getSearch();
        if (errorMessage.equals(arg0)) {
            Assert.assertEquals(arg0, errorMessage);
        } else {
            fail();
        }
    }
}
