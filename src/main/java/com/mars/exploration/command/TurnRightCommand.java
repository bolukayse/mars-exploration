package com.mars.exploration.command;

import com.mars.exploration.rover.Rover;
import com.mars.exploration.annotation.RoverCommand;

@RoverCommand(tag = CommandType.RIGHT, clazz = TurnRightCommand.class)
public class TurnRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
