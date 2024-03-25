package features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

@Given("I want to write a step with precondition")
  public void test() {
	  System.out.println("Given1");
  }

@Given("some other precondition")
public void some_other_precondition() {
	 System.out.println("Given2");

}

@When("I complete action")
public void i_complete_action() {
	 System.out.println("When1");

}

@When("some other action")
public void some_other_action() {
	 System.out.println("When2");

}

@When("yet another action")
public void yet_another_action() {
	 System.out.println("when3");

}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
	 System.out.println("Then1");

}

@Then("check more outcomes")
public void check_more_outcomes() {
   
	 System.out.println("Then2");

}

}