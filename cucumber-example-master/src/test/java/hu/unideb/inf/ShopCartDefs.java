package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class ShopCartDefs extends AbstractStepDefs{

    @When("the Cart button is clicked")
    public void theEmailButtonIsClicked() {
        homePage.getCartButton().click();
    }

    @Then("the {string} error msg is shown")
    public void aErrorMessageIsShown(String arg0) {
        Optional<String> errorMessage = homePage.getCartError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(arg0, errorMessage.get());
        } else {
            fail();
        }
    }

    @And("the Add to cart button is clicked")
    public void theAddToCartButtonIsClicked() {
        homePage.getAddToCard().click();
    }


    @And("Proceed to check out link is clicked")
    public void proceedToCheckOutLinkIsClicked() {
        homePage.getProceedToCheckOut().click();
    }

    @When("the Proceed button is clicked")
    public void theProceedButtonIsClicked() {
        homePage.getProceed().click();
    }

    @Given("the object is hovered")
    public void theObjectIsHovered() {
        homePage.getMenu(homePage.hoverOver());
    }
}
