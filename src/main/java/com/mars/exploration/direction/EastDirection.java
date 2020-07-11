package com.mars.exploration.direction;

import com.mars.exploration.rover.Rover;

public class EastDirection implements Direction{
    @Override
    public Direction turnLeft() {
        return new NorthDirection();
    }

    @Override
    public Direction turnRight() {
        return new SouthDirection();
    }

    @Override
    public void move(Rover rover) {
        rover.getCurrentCoordinates().setX(rover.getCurrentCoordinates().getX() + 1);
    }

    @Override
    public String toString() {
        return "E";
    }
}
