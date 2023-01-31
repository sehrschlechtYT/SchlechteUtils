package yt.sehrschlecht.schlechteutils.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Deprecated // Replace with sehrschlechtYT/ClassConfig
public @interface ConfigOption {
    String key();
    Class<?> type();
}

