package com.mars.exploration;

import com.mars.exploration.coordinate.Coordinate;
import com.mars.exploration.rover.Rover;

import java.util.HashSet;
import java.util.Set;

public class Plateau {

    private final Coordinate lowerCoordinates;
    private final Coordinate upperCoordinates;
    private Set<Rover> rovers = new HashSet<>();

    public Plateau(Coordinate lowerCoordinates, Coordinate upperCoordinates) {
        this.lowerCoordinates = lowerCoordinates;
        this.upperCoordinates = upperCoordinates;
    }

    public void addRover(Rover rover) {
        rovers.add(rover);
    }

    public void explore() {
        for (Rover rover : this.rovers) {
            rover.run();
        }
    }

    public Coordinate getLowerCoordinates() {
        return lowerCoordinates;
    }

    public Coordinate getUpperCoordinates() {
        return upperCoordinates;
    }
}
