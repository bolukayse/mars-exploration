package com.mars.exploration.command.util;

import com.mars.exploration.command.Command;
import com.mars.exploration.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandParser {
    public static final String COMMAND_SPLIT_DELIMITER = "";

    private String commandString;

    public CommandParser(final String commandString) {
        this.commandString = commandString;
    }

    public List<Command> toCommands() {
        if (StringUtils.isNullOrEmpty(commandString)) {
            return new ArrayList<Command>();
        }
        return Stream.of(parseCommandString(commandString)).map(commandCharacter -> CommandFactory.getCommand(commandCharacter.toUpperCase())).collect(Collectors.toList());
    }

    private String[] parseCommandString(final String commandString) {
        return commandString.split(COMMAND_SPLIT_DELIMITER);
    }

}
