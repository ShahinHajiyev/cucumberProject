package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExternalLinkStepDefs extends AbstractStepDefs{

    @Then("check if the right one is opened")
    public void externalLinkClick(){
        homePage.assertURL(homePage.getNEXT_PAGE_URL());
    }

    @When("the fb button is clicked")
    public void theFbButtonIsClicked() {
        homePage.getFbLink().click();
    }
}
