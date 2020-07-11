package com.mars.exploration.direction;

import com.mars.exploration.rover.Rover;

public interface Direction {
    public abstract Direction turnLeft();

    public abstract Direction turnRight();

    public abstract void move(Rover rover);

}