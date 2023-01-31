package yt.sehrschlecht.schlechteutils.config;

import dev.dejvokep.boostedyaml.YamlDocument;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;
import yt.sehrschlecht.schlechteutils.utils.Debug;

import java.lang.reflect.Field;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0
 */
@Deprecated // Replace with sehrschlechtYT/ClassConfig
public abstract class AbstractConfig {

    public AbstractConfig(YamlDocument configDocument) {
        load(configDocument);
    }

    protected void load(YamlDocument configDocument) {
        for (Field field : getClass().getFields()) {
            if(field.isAnnotationPresent(ConfigOption.class)) {
                ConfigOption annotation = field.getAnnotation(ConfigOption.class);
                String key = annotation.key();
                Class<?> type = annotation.type();
                try {
                    Object object = configDocument.get(key, type);
                    debug("Config: " + field.getName() + " -> " + object);
                    if(!type.isInstance(object)) {
                       debug("Config option " + key + " is not of type " + type.getName() + "!");
                        continue;
                    }
                    field.set(this, object);
                } catch (Exception e) {
                    debug("Could not set config value for key " + key + " to type " + type.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    protected void debug(String message) {
        if(!enableDebugLogging() || getPlugin() == null) return;
        Debug.CONFIG.send(getPlugin(), message);
    }

    protected boolean enableDebugLogging() {
        return false;
    }

    @Nullable
    protected JavaPlugin getPlugin() {
        return null;
    }

}
