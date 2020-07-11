package com.mars.exploration.direction;

import com.mars.exploration.rover.Rover;

public class SouthDirection implements Direction{
    @Override
    public Direction turnLeft() {
        return new EastDirection();
    }

    @Override
    public Direction turnRight() {
        return new WestDirection();
    }

    @Override
    public void move(Rover rover) {
        rover.getCurrentCoordinates().setY(rover.getCurrentCoordinates().getY() - 1);
    }

    @Override
    public String toString() {
        return "S";
    }
}
