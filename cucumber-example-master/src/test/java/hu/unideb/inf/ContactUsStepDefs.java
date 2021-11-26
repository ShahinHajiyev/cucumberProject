package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class ContactUsStepDefs extends AbstractStepDefs {

    @And("the Contact Us link is clicked")
    public void theContactUsLinkIsClicked() {
        homePage.getContactUsLink().click();
    }

    @When("the Send button is clicked")
    public void theSendButtonIsClicked() {
        homePage.getSendButton().click();
    }

    @Given("the {string} is filled with the {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @And("the {string} is filled w {string}")
    public void FieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("the {string} error messages are shown")
    public void theMsgErrorMessagesAreShown(String msg) {
        Optional<String> errorMessage = homePage.getContactError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        }else
            fail();
    }
}
