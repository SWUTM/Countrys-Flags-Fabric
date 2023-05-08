package net.swutm.countrysflags.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.countrysflags.countrysflags;

public class ModItems {

















    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(countrysflags.MOD_ID, name), item);
    }

    public static void registerModItems() {
        countrysflags.LOGGER.info("1" + countrysflags.MOD_ID);
    }
}
