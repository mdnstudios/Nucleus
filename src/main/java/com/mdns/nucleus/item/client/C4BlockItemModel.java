package com.mdns.nucleus.item.client;

import com.mdns.nucleus.Nucleus;
import com.mdns.nucleus.item.custom.C4BlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class C4BlockItemModel extends GeoModel<C4BlockItem> {
    @Override
    public Identifier getModelResource(C4BlockItem animatable) {
        return new Identifier(Nucleus.MOD_ID, "geo/c4_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(C4BlockItem animatable) {
        return new Identifier(Nucleus.MOD_ID, "textures/block/c4_block.png");
    }

    @Override
    public Identifier getAnimationResource(C4BlockItem animatable) {
        return new Identifier(Nucleus.MOD_ID, "animations/c4_block.animation.json");
    }
}
