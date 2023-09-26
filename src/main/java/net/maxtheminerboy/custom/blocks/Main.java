package net.maxtheminerboy.custom.blocks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	// Setup logger
    public static final Logger LOGGER = LoggerFactory.getLogger("custom-blocks");

	// When the mod loads
	@Override
	public void onInitialize() {

		LOGGER.info("Hello, world!");
	}
}