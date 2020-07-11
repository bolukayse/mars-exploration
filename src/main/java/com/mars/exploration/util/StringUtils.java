package com.mars.exploration.util;

public class StringUtils {

    public static boolean isNullOrEmpty(final String commandString) {
        return (null == commandString || commandString.trim().length() == 0);
    }

}
