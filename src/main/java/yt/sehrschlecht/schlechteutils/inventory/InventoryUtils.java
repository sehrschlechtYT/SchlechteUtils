package yt.sehrschlecht.schlechteutils.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.1
 */
public class InventoryUtils {

    @NotNull
    public static Inventory setBackground(@NotNull Inventory inventory, @NotNull ItemStack stack) {
        while (inventory.firstEmpty() != -1) {
            inventory.setItem(inventory.firstEmpty(), stack);
        }
        return inventory;
    }

}
