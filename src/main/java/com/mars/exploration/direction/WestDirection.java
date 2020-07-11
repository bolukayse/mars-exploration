package com.mars.exploration.direction;

import com.mars.exploration.rover.Rover;

public class WestDirection implements Direction{
    @Override
    public Direction turnLeft() {
        return new SouthDirection();
    }

    @Override
    public Direction turnRight() {
        return new NorthDirection();
    }

    @Override
    public void move(Rover rover) {
        rover.getCurrentCoordinates().setX(rover.getCurrentCoordinates().getX() - 1);
    }

    @Override
    public String toString() {
        return "W";
    }
}
