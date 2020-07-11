package com.mars.exploration.command;

import com.mars.exploration.rover.Rover;

public interface Command {
    public abstract void execute(Rover rover);
}
