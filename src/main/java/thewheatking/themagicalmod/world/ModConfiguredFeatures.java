package thewheatking.themagicalmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGICAL_WOOD_KEY = registerKey("magical_wood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_MAGICAL_WOOD_KEY = registerKey("ancient_magical_wood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_MAGICAL_WOOD_KEY = registerKey("dark_magical_wood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETHYST_ORE_KEY = registerKey("amethyst_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_AMETHYST_ORE_KEY = registerKey("deepslate_amethyst_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldAmethystOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AMETHYST_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.getDefaultState()));

        register(context, MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAGICAL_WOOD_LOG),
                new LargeOakTrunkPlacer(14,7,4),
                BlockStateProvider.of(ModBlocks.MAGICAL_WOOD_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, ANCIENT_MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG),
                new ForkingTrunkPlacer(5, 7, 12),
                BlockStateProvider.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1, 0, 3)).build());
        register(context, DARK_MAGICAL_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DARK_MAGICAL_WOOD_LOG),
                new StraightTrunkPlacer(4, 6, 3),
                BlockStateProvider.of(ModBlocks.DARK_MAGICAL_WOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, AMETHYST_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmethystOres, 12));
        register(context, DEEPSLATE_AMETHYST_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmethystOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheMagicalMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
