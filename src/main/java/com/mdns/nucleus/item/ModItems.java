package com.mdns.nucleus.item;

import com.mdns.nucleus.Nucleus;
import com.mdns.nucleus.block.ModBlocks;
import com.mdns.nucleus.item.custom.C4BlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item C4_BLOCK_ITEM = registerItem("c4_block_item",
            new C4BlockItem(ModBlocks.C4_BLOCK, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Nucleus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Nucleus.LOGGER.info("Registering Mod Items for " + Nucleus.MOD_ID);
    }
}
