package thewheatking.themagicalmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGICAL_WOOD_KEY = registerKey("magical_wood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_MAGICAL_WOOD_KEY = registerKey("ancient_magical_wood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_MAGICAL_WOOD_KEY = registerKey("dark_magical_wood_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAGICAL_WOOD_LOG),
                new LargeOakTrunkPlacer(9,5,4),
                BlockStateProvider.of(ModBlocks.MAGICAL_WOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 7),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, ANCIENT_MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG),
                new ForkingTrunkPlacer(5, 6, 7),
                BlockStateProvider.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, DARK_MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DARK_MAGICAL_WOOD_LOG),
                new DarkOakTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.DARK_MAGICAL_WOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheMagicalMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
