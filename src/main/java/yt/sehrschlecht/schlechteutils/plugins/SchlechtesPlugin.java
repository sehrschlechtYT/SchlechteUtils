package yt.sehrschlecht.schlechteutils.plugins;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0.2
 */
public abstract class SchlechtesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        createConfig();
        registerListeners();
        registerCommands();
    }

    protected void createConfig() {

    };

    protected void registerListeners() {

    }

    protected void registerCommands() {

    }

}
