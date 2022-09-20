package yt.sehrschlecht.schlechteutils.string;

import org.jetbrains.annotations.NotNull;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.1
 */
public class StringUtils {

    @NotNull
    public static String renderDamage(int amount) {
        StringBuilder builder = new StringBuilder();
        if((amount % 2) == 0) {
            for (int i = 0; i < (amount / 2); i++) {
                builder.append("§4❤");
            }
        } else {
            amount--;
            for (int i = 0; i < (amount / 2); i++) {
                builder.append("§4❤");
            }
            builder.append("§c❤");
        }
        return builder.toString();
    }

}
