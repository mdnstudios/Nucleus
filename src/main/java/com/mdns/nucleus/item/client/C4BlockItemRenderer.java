package com.mdns.nucleus.item.client;

import com.mdns.nucleus.item.custom.C4BlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class C4BlockItemRenderer extends GeoItemRenderer<C4BlockItem> {
    public C4BlockItemRenderer() {
        super(new C4BlockItemModel());
    }
}
