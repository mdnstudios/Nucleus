package com.mdns.nucleus;

import com.mdns.nucleus.block.ModBlocks;
import com.mdns.nucleus.block.entity.ModBlockEntities;
import com.mdns.nucleus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Nucleus implements ModInitializer {
	public static final String MOD_ID = "nucleus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerAllBlockEntities();
		GeckoLib.initialize();
		LOGGER.info("Hello Fabric world!");
	}
}