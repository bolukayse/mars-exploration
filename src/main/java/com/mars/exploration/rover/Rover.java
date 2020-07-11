package com.mars.exploration.rover;

import com.mars.exploration.coordinate.Coordinate;
import com.mars.exploration.Plateau;
import com.mars.exploration.command.Command;
import com.mars.exploration.direction.Direction;
import com.mars.exploration.command.util.CommandParser;
import com.mars.exploration.coordinate.CoordinateValidator;

import java.util.List;

public class Rover {

    private Coordinate currentCoordinates;
    private Direction currentDirection;
    private Plateau plateau;
    private List<Command> roverCommands;

    public Rover(final Plateau plateau, final Direction direction, final Coordinate coordinates) {
        this.plateau = plateau;
        this.currentDirection = direction;
        this.currentCoordinates = coordinates;
    }

    public void run() {
        roverCommands.stream().forEach(command -> command.execute(this));
    }

    public void addCommand(final String commandString) {
        this.roverCommands = new CommandParser(commandString).toCommands();
    }

    public String getCurrentCoordinatesAsString() {
        return currentCoordinates.toString() + " " + currentDirection.toString();
    }

    public Coordinate getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void move() {
        currentDirection.move(this);
        CoordinateValidator.validateLocation(currentCoordinates, plateau);
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }
}
