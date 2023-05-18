package yt.sehrschlecht.schlechteutils.commands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommandUtilsTest {

    @Test
    @DisplayName("Should return an empty list when no options match the argument")
    void tabCompleteWithNoMatchingOptions() {
        List<String> availableOptions = Arrays.asList("apple", "banana", "cherry", "date");
        String argument = "e";
        boolean ignoreCase = true;

        List<String> result = CommandUtils.tabComplete(availableOptions, argument, ignoreCase);

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Should return a list of matching options with case sensitivity")
    void tabCompleteWithCaseSensitivity() {
        List<String> availableOptions =
                Arrays.asList("apple", "Amogus", "cherry", "date", "elderberry");
        String argument = "a";
        boolean ignoreCase = false;

        List<String> expected = Collections.singletonList("apple");

        List<String> actual = CommandUtils.tabComplete(availableOptions, argument, ignoreCase);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return all options when the argument is an empty string")
    void tabCompleteWithEmptyArgument() {
        List<String> availableOptions = Arrays.asList("option1", "option2", "option3");
        String argument = "";
        boolean ignoreCase = true;

        List<String> result = CommandUtils.tabComplete(availableOptions, argument, ignoreCase);

        assertEquals(3, result.size());
        assertTrue(result.contains("option1"));
        assertTrue(result.contains("option2"));
        assertTrue(result.contains("option3"));
    }

    @Test
    @DisplayName("Should return a list of matching options without case sensitivity")
    void tabCompleteWithoutCaseSensitivity() {
        List<String> availableOptions =
                Arrays.asList("apple", "Amogus", "cherry", "orange", "pear");
        String argument = "a";
        boolean ignoreCase = true;

        List<String> expected = Arrays.asList("apple", "Amogus");

        List<String> actual = CommandUtils.tabComplete(availableOptions, argument, ignoreCase);

        assertEquals(expected, actual);
    }
}