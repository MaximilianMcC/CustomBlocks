package net.maxtheminerboy.custom.blocks;

import net.fabricmc.api.ModInitializer;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	// Setup logger
    public static final Logger LOGGER = LoggerFactory.getLogger("custom-blocks");

	// When the mod loads
	@Override
	public void onInitialize() {

		LOGGER.info("Loading custom mod blocks...");
		LoadBlocks();
	}


	// Load all of the blocks from the settings file
	// TODO: Make the path be able to be changed
	private void LoadBlocks()
	{
		try {

			// Get the path to the custom blocks json
			Path modBlocksJsonPath = Path.of("./mods/customBlocks/blocks.json");

			// Check for if the parent exists, if not create it
			if (Files.exists(modBlocksJsonPath.getParent()) == false)
			{
				LOGGER.warn("No parent directory present. Creating");
				Files.createDirectory(modBlocksJsonPath.getParent());
				LOGGER.warn("Created parent directory");
			}

			// Check for if it exists, if not create it
			if (Files.exists(modBlocksJsonPath) == false)
			{
				LOGGER.warn("No JSON present. Creating");
				Files.createFile(modBlocksJsonPath);
				Files.writeString(modBlocksJsonPath, "[\n\t\n]");
				LOGGER.warn("Created JSON");
			}
			
			// Open the JSON, then parse it to get the block data
			String modBlocksJson = Files.readString(modBlocksJsonPath);
			


		} catch (Exception error) {
			LOGGER.error("Couldn't load JSON", error);
		}



	}
}