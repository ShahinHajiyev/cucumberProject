package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class CreateAccountStepDefs extends AbstractStepDefs{
    
    
    @Given("{string} filled with {string}")
    public void fieldFilledWithParameters(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @And("the Create an Account button is clicked")
    public void theCreateAnAccountButtonIsClicked() {
        homePage.getCreateAccButton().click();
    }

    @Given("second {string} filled with {string}")
    public void secondAreaFilledWithParams(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @And("third {string} filled with {string}")
    public void thirdSectionFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @And("fourth {string} filled with {string}")
    public void fourthPartFilledWithText(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("{string} should be shown")
    public void msgShouldBeShown(String arg0) {
        Optional<String> errorMessage = homePage.getRegister();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(arg0, errorMessage.get());
        } else {
            fail();
        }
    }

    @When("Register Button is clicked")
    public void registerButtonIsClicked() {
        homePage.getRegisterButton().click();
    }

    @Then("{string} message is showed")
    public void messageIsShowed(String arg0) {
        Optional<String> errorMessage = homePage.getCreateAccount();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(arg0, errorMessage.get());
        } else {
            fail();
        }
    }

    @When("Create an account button is clicked")
    public void createAnAccountButtonIsClicked() {
        homePage.getCreateAccButton().click();
    }


    @Given("Email address is filled with {string} address")
    public void emailAddressIsFilledWithAddress(String arg0) {
        homePage.fillField("email_create", arg0);
    }
}
