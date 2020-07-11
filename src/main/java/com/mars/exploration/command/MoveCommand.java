package com.mars.exploration.command;

import com.mars.exploration.rover.Rover;
import com.mars.exploration.annotation.RoverCommand;

@RoverCommand(tag = CommandType.MOVE, clazz = MoveCommand.class)
public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}
