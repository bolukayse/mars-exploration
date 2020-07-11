package com.mars.exploration.coordinate;

import com.mars.exploration.coordinate.Coordinate;
import com.mars.exploration.Plateau;
import com.mars.exploration.exception.IllegalCoordinateException;

public class CoordinateValidator {
    public static void validateLocation(Coordinate coordinate, Plateau plateau) {
        if (coordinate.getX() > plateau.getUpperCoordinates().getX()
                || coordinate.getY() > plateau.getUpperCoordinates().getY()
                || coordinate.getX() < plateau.getLowerCoordinates().getX()
                || coordinate.getY() < plateau.getLowerCoordinates().getY())
            throw new IllegalCoordinateException();
    }
}
