package de.penguinpiz.betterqualityguns;

import org.bukkit.Bukkit;

public class Logger {


    private static final String PREFIX = "&l&fBQG ";

    private static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + message);
    }

    public static void alert(String message) {
        log("&e" + message);
    }

    public static void warning(String message) {
        log("&c" + message);
    }

    public static void info(String message) {
        log("&a" + message);
    }

}
