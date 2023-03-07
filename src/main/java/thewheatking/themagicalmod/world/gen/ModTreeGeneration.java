package thewheatking.themagicalmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import thewheatking.themagicalmod.world.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGICAL_WOOD_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ANCIENT_MAGICAL_WOOD_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP, BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DARK_MAGICAL_WOOD_PLACED_KEY);
    }
}
