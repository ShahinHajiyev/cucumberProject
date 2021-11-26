package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class TshirtsStepDefinition extends AbstractStepDefs{

    @Given("Tshirts button is clicked")
    public void tshirtsButtonIsClicked(){
        homePage.getTshirt().click();
    }

    @When("ADD to cart button is clicked")
    public void addToCartButtonIsClicked() {
        homePage.getAddToCart().click();
    }

    @Then("{string} error message is shown")
    public void messageIsShown(String arg0) {
        Optional<String> errorMessage = homePage.getAddToCartMSG();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(arg0, errorMessage.get());
        }
        else {
            fail();
        }
    }

    @And("list button is clicked")
    public void listButtonIsClicked() {
        homePage.getList().click();
    }
}
