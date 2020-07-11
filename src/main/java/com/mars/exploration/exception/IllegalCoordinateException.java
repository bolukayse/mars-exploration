package com.mars.exploration.exception;

public class IllegalCoordinateException extends RuntimeException{
    public IllegalCoordinateException() {
        super("Given coordinate is invalid!");
    }
}
