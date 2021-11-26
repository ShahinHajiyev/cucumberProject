package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class MainPageEmailStepDefs extends AbstractStepDefs {

    @Given("the email address filled with {string}")
    public void theEmailAddressIsFilledWith(String arg0) {
        homePage.fillField("newsletter-input", arg0);
    }

    @When("the Email button is clicked")
    public void theEmailButtonIsClicked() {
        homePage.getMainPageEmailButton().click();
    }

    @Then("the {string} error message shown")
    public void aErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getEmailError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }

    @Given("the {string} email address filled with {string}")
    public void theAreaEmailAddressFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }
}
