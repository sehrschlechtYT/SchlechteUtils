package yt.sehrschlecht.schlechteutils.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    @DisplayName("Should return an empty string when the amount is zero")
    void renderDamageWithZeroAmount() {
        int amount = 0;
        String expected = "";

        String result = StringUtils.renderDamage(amount);

        assertEquals(expected, result, "Expected an empty string when the amount is zero");
    }

    @Test
    @DisplayName("Should render even number of damage correctly")
    void renderDamageWithEvenAmount() {
        int amount = 4;
        String expected = "§4❤§4❤";

        String result = StringUtils.renderDamage(amount);

        assertEquals(
                expected,
                result,
                "The rendered damage string should match the expected string for even amount of damage");
    }

    @Test
    @DisplayName("Should render odd number of damage correctly")
    void renderDamageWithOddAmount() {
        int amount = 5;
        String expected = "§4❤§4❤§c❤";

        String result = StringUtils.renderDamage(amount);

        assertEquals(
                expected,
                result,
                "The rendered damage string should match the expected string for odd amount of damage");
    }
}