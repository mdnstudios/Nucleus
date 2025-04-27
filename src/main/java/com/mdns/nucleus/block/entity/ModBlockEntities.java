package com.mdns.nucleus.block.entity;

import com.mdns.nucleus.Nucleus;
import com.mdns.nucleus.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<C4BlockEntity> C4_BLOCK_ENTITY;

    public static void registerAllBlockEntities() {
        C4_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Nucleus.MOD_ID, "c4_block_entity"),
                FabricBlockEntityTypeBuilder.create(C4BlockEntity::new,
                        ModBlocks.C4_BLOCK).build());
    }
}
