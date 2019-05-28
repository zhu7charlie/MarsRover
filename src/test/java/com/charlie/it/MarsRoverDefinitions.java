package com.charlie.it;

import static org.junit.Assert.assertEquals;

import com.charlie.it.MarsRover;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MarsRoverDefinitions {
	
	MarsRover mr = new MarsRover();
	
	@Given("^xMax (\\d+) yMax (\\d+)$")
	public void xmax_yMax(int arg1, int arg2) {
		mr.setMax(arg1,  arg2);
	}

	@Given("^start with position (\\d+) (\\d+) \"([^\"]*)\"$")
	public void start_with_position(int arg1, int arg2, String arg3) {
		mr.setPos(arg1,  arg2, arg3.charAt(0));
	}

	@When("^moves string is \"([^\"]*)\"$")
	public void moves_string_is(String arg1) {
		mr.runMoves(arg1);
	}

	@Then("^final position is (\\d+) (\\d+) \"([^\"]*)\"$")
	public void final_position_is(int arg1, int arg2, String arg3) {
		assertEquals(mr.getX(), arg1);
		assertEquals(mr.getY(), arg2);
		assertEquals(mr.getDir(), arg3.charAt(0));
	}
	
}
