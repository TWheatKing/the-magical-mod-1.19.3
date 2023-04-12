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

        addDrop(ModBlocks.MAGICAL_WOOD_LOG, drops(ModBlocks.MAGICAL_WOOD_LOG, ModItems.MAGICAL_WOOD));
        addDrop(ModBlocks.MAGICAL_WOOD_WOOD, drops(ModBlocks.MAGICAL_WOOD_WOOD, ModItems.MAGICAL_WOOD));
        addDrop(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG);
        addDrop(ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD);
        addDrop(ModBlocks.MAGICAL_WOOD_LEAVES, leavesDrops(ModBlocks.MAGICAL_WOOD_LEAVES,ModBlocks.MAGICAL_WOOD_LEAVES,0.06F));
        addDrop(ModBlocks.MAGICAL_WOOD_SAPLING);

        addDrop(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG, drops(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG, ModItems.ANCIENT_MAGICAL_WOOD));
        addDrop(ModBlocks.ANCIENT_MAGICAL_WOOD_WOOD, drops(ModBlocks.ANCIENT_MAGICAL_WOOD_WOOD, ModItems.ANCIENT_MAGICAL_WOOD));
        addDrop(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_LOG);
        addDrop(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_WOOD);
        addDrop(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES, leavesDrops(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES,ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES,0.06F));
        addDrop(ModBlocks.ANCIENT_MAGICAL_WOOD_SAPLING);

        addDrop(ModBlocks.DARK_MAGICAL_WOOD_LOG, drops(ModBlocks.DARK_MAGICAL_WOOD_LOG, ModItems.DARK_MAGICAL_WOOD));
        addDrop(ModBlocks.DARK_MAGICAL_WOOD_WOOD, drops(ModBlocks.DARK_MAGICAL_WOOD_WOOD, ModItems.DARK_MAGICAL_WOOD));
        addDrop(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_WOOD);
        addDrop(ModBlocks.DARK_MAGICAL_WOOD_LEAVES, leavesDrops(ModBlocks.DARK_MAGICAL_WOOD_LEAVES,ModBlocks.DARK_MAGICAL_WOOD_LEAVES,0.06F));
        addDrop(ModBlocks.DARK_MAGICAL_WOOD_SAPLING);
    }
}
