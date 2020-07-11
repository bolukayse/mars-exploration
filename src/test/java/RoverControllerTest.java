import com.mars.exploration.coordinate.Coordinate;
import com.mars.exploration.Plateau;
import com.mars.exploration.rover.Rover;
import com.mars.exploration.direction.EastDirection;
import com.mars.exploration.direction.NorthDirection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverControllerTest {
    Plateau plateau;

    @Before
    public void setUp() {
        Coordinate plateauLowerCoordinates = new Coordinate(0, 0);
        Coordinate plateauUpperCoordinates = new Coordinate(5, 5);
        plateau = new Plateau(plateauLowerCoordinates, plateauUpperCoordinates);
    }

    @Test
    public void should_return_current_coordinates_after_exploring_mars() {
        Coordinate rover1Coordinate = new Coordinate(3, 3);
        Rover rover1 = new Rover(plateau, new EastDirection(), rover1Coordinate);
        rover1.addCommand("MMRMMRMRRM");
        plateau.addRover(rover1);

        Coordinate rover2Coordinate = new Coordinate(1, 2);
        Rover rover2 = new Rover(plateau, new NorthDirection(), rover2Coordinate);
        rover2.addCommand("LMLMLMLMM");
        plateau.addRover(rover2);

        plateau.explore();
        Assert.assertEquals("5 1 E", rover1.getCurrentCoordinatesAsString());
        Assert.assertEquals("1 3 N", rover2.getCurrentCoordinatesAsString());

    }
}
