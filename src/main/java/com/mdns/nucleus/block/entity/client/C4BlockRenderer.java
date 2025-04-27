package com.mdns.nucleus.block.entity.client;

import com.mdns.nucleus.block.entity.C4BlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class C4BlockRenderer extends GeoBlockRenderer<C4BlockEntity> {
    public C4BlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new C4BlockModel());
    }
}
