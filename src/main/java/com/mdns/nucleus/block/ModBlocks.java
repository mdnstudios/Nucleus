package com.mdns.nucleus.block;

import com.mdns.nucleus.Nucleus;
import com.mdns.nucleus.block.custom.C4Block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block C4_BLOCK = registerBlock("c4_block",
            new C4Block(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).strength(50.0f).requiresTool().nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Nucleus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Nucleus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Nucleus.LOGGER.info("Registering ModBlocks after " + Nucleus.MOD_ID);
    }
}
