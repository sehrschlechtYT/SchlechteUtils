package yt.sehrschlecht.schlechteutils.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * <a href="https://pastebin.com/5mug6EBu">List of names</a>
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0
 */
@SuppressWarnings("unused")
public enum MHFSkulls {
    /* Mobs */
    MHF_ALEX,
    MHF_BLAZE,
    MHF_CAVESPIDER,
    MHF_CHICKEN,
    MHF_COW,
    MHF_CREEPER,
    MHF_ENDERMAN,
    MHF_GHAST,
    MHF_GOLEM,
    MHF_HEROBRINE,
    MHF_LAVASLIME,
    MHF_MUSHROOMCOW,
    MHF_OCELOT,
    MHF_PIG,
    MHF_PIGZOMBIE,
    MHF_SHEEP,
    MHF_SKELETON,
    MHF_SLIME,
    MHF_SPIDER,
    MHF_SQUID,
    MHF_STEVE,
    MHF_VILLAGER,
    MHF_WSKELETON,
    MHF_ZOMBIE,

    /* Blocks */
    MHF_CACTUS,
    MHF_CAKE,
    MHF_CHEST,
    MHF_COCONUTB,
    MHF_COCONUTG,
    MHF_MELON,
    MHF_OAKLOG,
    MHF_PRESENT1,
    MHF_PRESENT2,
    MHF_PUMPKIN,
    MHF_TNT,
    MHF_TNT2,

    /* Misc */
    MHF_ARROWUP,
    MHF_ARROWDOWN,
    MHF_ARROWLEFT,
    MHF_ARROWRIGHT,
    MHF_EXCLAMATION,
    MHF_QUESTION;


    public void apply(ItemStack stack) {
        ItemMeta meta = stack.getItemMeta();
        if (!(meta instanceof SkullMeta)) {
            throw new IllegalArgumentException("MHFSkulls can only be applied to skulls!");
        }
        SkullMeta skullMeta = (SkullMeta) meta;
        skullMeta.setOwner(this.name());
        stack.setItemMeta(skullMeta);
    }
}
