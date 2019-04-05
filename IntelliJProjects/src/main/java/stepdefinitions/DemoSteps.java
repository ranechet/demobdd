package stepdefinitions;

import cucumber.api.java.en.*;

public class DemoSteps {

    @Given("^my first given$")
    public void my_first_given()  {
        System.out.println("given executed succesfully");
    }

    @When("^user does something$")
    public void user_does_something()  {
        System.out.println("when executed succesfully");
    }

    @Then("^results published$")
    public void results_published()  {
        System.out.println("then executed succesfully");
    }
}
