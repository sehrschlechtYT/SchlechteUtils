package yt.sehrschlecht.schlechteutils.items;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.1
 */
public class ItemDataUtils {

    @NotNull
    public static ItemStack writeStringData(@NotNull ItemStack stack, @NotNull JavaPlugin plugin, @NotNull String key, @NotNull String value) {
        ItemMeta meta = stack.getItemMeta();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        Objects.requireNonNull(meta, "The item meta musn't be null!")
                .getPersistentDataContainer().set(namespacedKey, PersistentDataType.STRING, value);
        return stack;
    }

    @Nullable
    public static String getStringData(@NotNull ItemStack stack, @NotNull JavaPlugin plugin, @NotNull String key) {
        PersistentDataContainer container = Objects.requireNonNull(stack.getItemMeta(), "The item meta musn't be null!")
                .getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        if (container.has(namespacedKey, PersistentDataType.STRING)) {
            return container.get(namespacedKey, PersistentDataType.STRING);
        }
        return null;
    }

}
