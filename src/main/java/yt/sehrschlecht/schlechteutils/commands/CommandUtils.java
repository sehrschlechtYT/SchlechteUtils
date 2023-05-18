package yt.sehrschlecht.schlechteutils.commands;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class with some useful methods for commands.
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0.7
 */
public class CommandUtils {
    /**
     * Filters a list of available options to only include options that start with the given argument.
     * @param availableOptions A list of available options
     * @param argument The argument to tab complete
     * @param ignoreCase Whether to ignore the case of the argument
     * @return A list of possible options that can be tab completed
     */
    public static List<String> tabComplete(List<String> availableOptions, String argument, boolean ignoreCase) {
        if (!ignoreCase) return availableOptions.stream().filter(s -> s.startsWith(argument)).collect(Collectors.toList());
        return availableOptions.stream().filter(s -> s.toLowerCase().startsWith(argument.toLowerCase())).collect(Collectors.toList());
    }

    /**
     * Filters a list of available options to only include options that start with the given argument.
     * @param availableOptions A list of available options
     * @param argument The argument to tab complete
     * @return A list of possible options that can be tab completed
     */
    public static List<String> tabComplete(List<String> availableOptions, String argument) {
        return tabComplete(availableOptions, argument, true);
    }

    /**
     * Filters a list of available options to only include options that start with the given argument.
     * @param availableOptions An array of available options
     * @param argument The argument to tab complete
     * @param ignoreCase Whether to ignore the case of the argument
     * @return A list of possible options that can be tab completed
     */
    public static List<String> tabComplete(String[] availableOptions, String argument, boolean ignoreCase) {
        return tabComplete(Arrays.asList(availableOptions), argument, ignoreCase);
    }

    /**
     * Filters a list of available options to only include options that start with the given argument.
     * @param availableOptions An array of available options
     * @param argument The argument to tab complete
     * @return A list of possible options that can be tab completed
     */
    public static List<String> tabComplete(String[] availableOptions, String argument) {
        return tabComplete(Arrays.asList(availableOptions), argument, true);
    }
}
