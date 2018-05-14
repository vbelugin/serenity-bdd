package life.at;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellSteps {
    private boolean cellIsDead;
    private int numberOfLiveNeighbours;

    @Given("a dead cell")
    public void givenADeadCell() {
        this.cellIsDead = true;
    }

    @Given("the cell has $liveCells live neighbours")
    public void givenTheCellHasLiveNeighbours(int liveCells) {
        this.numberOfLiveNeighbours = liveCells;
    }

    @When("the cell evolves to the next generation")
    public void whenTheCellEvolvesToTheNextGeneration() {
        this.cellIsDead = numberOfLiveNeighbours > 3;
    }

    @Then("the cell is now alive")
    public void thenTheCellIsNowAlive() {
        assertFalse(cellIsDead);
    }

    @Given("a live cell")
    public void givenALiveCell() {
        this.cellIsDead = false;
    }

    @Then("the cell is now dead")
    public void thenTheCellIsNowDead() {
        assertTrue(cellIsDead);
    }

}
