package com.mars.exploration.command;

public enum CommandType {
    LEFT("L"),
    RIGHT("R"),
    MOVE("M");

    private final String type;

    private CommandType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static CommandType fromString(String text) {
        if (text != null) {
            for (CommandType commandType : CommandType.values()) {
                if (text.equalsIgnoreCase(commandType.type)) {
                    return commandType;
                }
            }
        }
        return null;
    }
}
