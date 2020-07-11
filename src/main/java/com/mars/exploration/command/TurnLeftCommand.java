package com.mars.exploration.command;

import com.mars.exploration.rover.Rover;
import com.mars.exploration.annotation.RoverCommand;

@RoverCommand(tag = CommandType.LEFT, clazz = TurnLeftCommand.class)
public class TurnLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
