package yt.sehrschlecht.schlechteutils.items;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.1
 */
@SuppressWarnings("ConstantConditions")
public class ItemBuilder {

    private ItemStack stack;

    public ItemBuilder(@NotNull Material material) {
        stack = new ItemStack(material);
    }

    public ItemBuilder(@NotNull ItemStack stack) {
        this.stack = stack;
    }

    public ItemBuilder(@NotNull Material material, int amount) {
        stack = new ItemStack(material, amount);
    }

    public ItemMeta getItemMeta() {
        return stack.getItemMeta();
    }

    @NotNull
    public ItemBuilder setColor(@NotNull Color color) {
        LeatherArmorMeta meta = (LeatherArmorMeta) getItemMeta();
        meta.setColor(color);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setGlow(boolean glow) {
        if (glow) {
            addEnchant(Enchantment.DURABILITY, 1);
            addItemFlag(ItemFlag.HIDE_ENCHANTS);
        } else {
            ItemMeta meta = getItemMeta();
            for (Enchantment enchantment : meta.getEnchants().keySet()) {
                meta.removeEnchant(enchantment);
            }
        }
        return this;
    }

    @NotNull
    public ItemBuilder setUnbreakable(boolean unbreakable) {
        ItemMeta meta = stack.getItemMeta();
        meta.setUnbreakable(unbreakable);
        stack.setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setAmount(int amount) {
        stack.setAmount(amount);
        return this;
    }

    @NotNull
    public ItemBuilder setItemMeta(@NotNull ItemMeta meta) {
        stack.setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setSkullOwner(@NotNull String owner) {
        SkullMeta meta = (SkullMeta) stack.getItemMeta();
        meta.setOwner(owner);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setSkullOwner(@NotNull OfflinePlayer owner) {
        SkullMeta meta = (SkullMeta) stack.getItemMeta();
        meta.setOwningPlayer(owner);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setMHFSkull(MHFSkulls mhfSkull) {
        mhfSkull.apply(stack);
        return this;
    }

    @NotNull
    public ItemBuilder setDisplayName(@NotNull String name) {
        ItemMeta meta = getItemMeta();
        meta.setDisplayName(name);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setItemStack(@NotNull ItemStack stack) {
        this.stack = stack;
        return this;
    }

    @NotNull
    public ItemBuilder setLore(@NotNull List<String> lore) {
        ItemMeta meta = getItemMeta();
        meta.setLore(lore);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setLore(@NotNull String... lore) {
        ItemMeta meta = getItemMeta();
        meta.setLore(Arrays.asList(lore));
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder setLore(@NotNull String lore) {
        ItemMeta meta = getItemMeta();
        meta.setLore(Collections.singletonList(lore));
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder addEnchant(@NotNull Enchantment enchantment, int level) {
        ItemMeta meta = getItemMeta();
        meta.addEnchant(enchantment, level, true);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder addItemFlag(@NotNull ItemFlag flag) {
        ItemMeta meta = getItemMeta();
        meta.addItemFlags(flag);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemBuilder addItemFlags(@NotNull ItemFlag... itemFlags) {
        getItemMeta().addItemFlags(itemFlags);
        return this;
    }

    @NotNull
    public ItemBuilder setCustomModelData(int data) {
        ItemMeta meta = getItemMeta();
        meta.setCustomModelData(data);
        setItemMeta(meta);
        return this;
    }

    @NotNull
    public ItemStack build() {
        return stack;
    }

}

