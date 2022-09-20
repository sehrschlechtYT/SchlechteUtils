package yt.sehrschlecht.schlechteutils.utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0
 */
public enum Debug {
    CONFIG;

    public void send(JavaPlugin plugin, String message) {
        plugin.getLogger().log(Level.INFO, message);
    }

}