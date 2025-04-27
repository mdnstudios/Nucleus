package com.mdns.nucleus;

import com.mdns.nucleus.block.entity.ModBlockEntities;
import com.mdns.nucleus.block.entity.client.C4BlockRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class NucleusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.C4_BLOCK_ENTITY, C4BlockRenderer::new);
    }
}
