package com.mars.exploration.command.util;

import com.mars.exploration.annotation.RoverCommand;
import com.mars.exploration.command.Command;
import com.mars.exploration.command.CommandType;
import com.mars.exploration.exception.CommandNotFoundException;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommandFactory {
    private static final String projectRootPackage = "com.mars";
    private static final Map<CommandType, Command> commandInstances = new HashMap<CommandType, Command>();

    static {
        loadCommandClasses();
    }

    private static void loadCommandClasses() {
        Reflections reflections = new Reflections(projectRootPackage);
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(RoverCommand.class);

        for (Class<?> controller : annotated) {
            RoverCommand annotation = controller.getAnnotation(RoverCommand.class);
            CommandType tag = annotation.tag();
            Class<Command> clazz = annotation.clazz();
            register(tag, clazz);
        }
    }

    public static void register(CommandType commandType, Class<? extends Command> command) {
        try {
            commandInstances.put(commandType, command.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Command getCommand(final String commandString) {
        CommandType type = CommandType.fromString(commandString);
        if (type == null) {
            throw new CommandNotFoundException();
        }

        return commandInstances.get(type);
    }

}
