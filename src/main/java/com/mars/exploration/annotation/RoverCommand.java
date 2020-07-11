package com.mars.exploration.annotation;

import com.mars.exploration.command.CommandType;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RoverCommand {
    public CommandType tag();
    public Class clazz();
}
