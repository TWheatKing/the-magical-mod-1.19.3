package thewheatking.themagicalmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import thewheatking.themagicalmod.block.ModBlocks;
import thewheatking.themagicalmod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAGICAL_WOOD_BLOCK);

        addDrop(ModBlocks.AMETHYST_ORE, oreDrops(ModBlocks.AMETHYST_ORE, ModItems.RAW_AMETHYST));
        addDrop(ModBlocks.DEEPSLATE_AMETHYST_ORE, oreDrops(ModBlocks.DEEPSLATE_AMETHYST_ORE, ModItems.RAW_AMETHYST));
    }
}
