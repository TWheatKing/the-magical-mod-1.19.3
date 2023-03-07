package thewheatking.themagicalmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import thewheatking.themagicalmod.block.ModBlocks;
import thewheatking.themagicalmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.MAGICAL_WOOD_LOG).log(ModBlocks.MAGICAL_WOOD_LOG).wood(ModBlocks.MAGICAL_WOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG).log(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG).wood(ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MAGICAL_WOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG).log(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG).wood(ModBlocks.ANCIENT_MAGICAL_WOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_LOG).log(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_LOG).wood(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_MAGICAL_WOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ANCIENT_MAGICAL_WOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.DARK_MAGICAL_WOOD_LOG).log(ModBlocks.DARK_MAGICAL_WOOD_LOG).wood(ModBlocks.DARK_MAGICAL_WOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_LOG).log(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_LOG).wood(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_MAGICAL_WOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_MAGICAL_WOOD_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.DARK_MAGICAL_WOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICAL_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_MAGICAL_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_MAGICAL_WOOD, Models.GENERATED);
    }
}
