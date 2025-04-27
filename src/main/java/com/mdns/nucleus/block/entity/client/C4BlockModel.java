package com.mdns.nucleus.block.entity.client;

import com.mdns.nucleus.Nucleus;
import com.mdns.nucleus.block.entity.C4BlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class C4BlockModel extends GeoModel<C4BlockEntity> {
    @Override
    public Identifier getModelResource(C4BlockEntity animatable) {
        return new Identifier(Nucleus.MOD_ID, "geo/c4_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(C4BlockEntity animatable) {
        return new Identifier(Nucleus.MOD_ID, "textures/block/c4_block.png");
    }

    @Override
    public Identifier getAnimationResource(C4BlockEntity animatable) {
        return new Identifier(Nucleus.MOD_ID, "animations/c4_block.animation.json");
    }
}
