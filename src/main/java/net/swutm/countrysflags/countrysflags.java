package net.swutm.countrysflags;

import net.fabricmc.api.ModInitializer;
import net.swutm.countrysflags.block.ModBlocks;
import net.swutm.countrysflags.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class countrysflags implements ModInitializer {
	public static final String MOD_ID = "countrysflags";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
