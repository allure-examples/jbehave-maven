package com.example.jbehave.steps;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GameSteps {

    @Given("a $width by $height game")
    @Aliases(values = {"a new game: $width by $height"})
    public void theGameIsRunning(int width, int height) {
    }

    @When("I toggle the cell at ($column, $row)")
    public void toggleTheCellAt(int column, int row) {
    }

    @Then("the grid should look like $grid")
    @Aliases(values = {"the grid should be $grid"})
    public void theGridShouldLookLike(String grid) {
    }
}
