package com.mars.exploration.direction;

import com.mars.exploration.rover.Rover;

public class NorthDirection implements Direction {
    @Override
    public Direction turnLeft() {
        return new WestDirection();
    }

    @Override
    public Direction turnRight() {
        return new EastDirection();
    }

    @Override
    public void move(Rover rover) {
        rover.getCurrentCoordinates().setY(rover.getCurrentCoordinates().getY() + 1);
    }

    @Override
    public String toString() {
        return "N";
    }
}
