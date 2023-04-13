package thewheatking.themagicalmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thewheatking.themagicalmod.block.ModBlocks;
import thewheatking.themagicalmod.block.ModFlammableBlockRegistry;
import thewheatking.themagicalmod.block.ModStrippableBlockRegistry;
import thewheatking.themagicalmod.entity.ModEntities;
import thewheatking.themagicalmod.entity.custom.WizardEntity;
import thewheatking.themagicalmod.item.ModItemGroup;
import thewheatking.themagicalmod.item.ModItems;
import thewheatking.themagicalmod.world.gen.ModWorldGeneration;

public class TheMagicalMod implements ModInitializer {
		public static final String MOD_ID = "themagicalmod";
		public static final Logger LOGGER = LoggerFactory.getLogger("themagicalmod");

		@Override
		public void onInitialize() {
			ModItemGroup.registerItemGroups();
			ModItems.registerModItems();
			ModBlocks.registerModBlocks();

			ModWorldGeneration.generateModWorldGen();

			ModFlammableBlockRegistry.registerFlammableBlocks();
			ModStrippableBlockRegistry.registerStrippableBlocks();

			FabricDefaultAttributeRegistry.register(ModEntities.WIZARD, WizardEntity.setAttributes());
		}
	}