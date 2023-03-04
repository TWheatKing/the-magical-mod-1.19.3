package thewheatking.themagicalmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thewheatking.themagicalmod.block.ModBlocks;
import thewheatking.themagicalmod.item.ModItemGroup;
import thewheatking.themagicalmod.item.ModItems;

public class TheMagicalMod implements ModInitializer {
		public static final String MOD_ID = "themagicalmod";
		public static final Logger LOGGER = LoggerFactory.getLogger("themagicalmod");

		@Override
		public void onInitialize() {
			ModItemGroup.registerItemGroups();
			ModItems.registerModItems();
			ModBlocks.registerModBlocks();
		}
	}