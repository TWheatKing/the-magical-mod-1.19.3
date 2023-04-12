package thewheatking.themagicalmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MAGICAL_WOOD_PLACED_KEY = registerKey("magical_wood_tree_placed");
    public static final RegistryKey<PlacedFeature> ANCIENT_MAGICAL_WOOD_PLACED_KEY = registerKey("ancient_magical_wood_tree_placed");
    public static final RegistryKey<PlacedFeature> DARK_MAGICAL_WOOD_PLACED_KEY = registerKey("dark_magical_wood_tree_placed");
    public static final RegistryKey<PlacedFeature> AMETHYST_ORE_PLACED_KEY = registerKey("amethyst_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_AMETHYST_ORE_PLACED_KEY = registerKey("deepslate_amethyst_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MAGICAL_WOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGICAL_WOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.MAGICAL_WOOD_SAPLING));
        register(context, ANCIENT_MAGICAL_WOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANCIENT_MAGICAL_WOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.ANCIENT_MAGICAL_WOOD_SAPLING));
        register(context, DARK_MAGICAL_WOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARK_MAGICAL_WOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.DARK_MAGICAL_WOOD_SAPLING));
        register(context, AMETHYST_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMETHYST_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_AMETHYST_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_AMETHYST_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheMagicalMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
