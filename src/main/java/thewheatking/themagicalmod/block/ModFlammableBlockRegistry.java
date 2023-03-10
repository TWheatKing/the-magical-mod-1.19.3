package thewheatking.themagicalmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.MAGICAL_WOOD_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD, 5, 5);

        registry.add(ModBlocks.MAGICAL_WOOD_LEAVES, 30, 60);
        registry.add(ModBlocks.MAGICAL_WOOD_PLANKS, 5, 20);

        registry.add(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.ANCIENT_MAGICAL_WOOD_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_ANCIENT_MAGICAL_WOOD_WOOD, 5, 5);

        registry.add(ModBlocks.ANCIENT_MAGICAL_WOOD_LEAVES, 30, 60);
        registry.add(ModBlocks.ANCIENT_MAGICAL_WOOD_PLANKS, 5, 20);

        registry.add(ModBlocks.DARK_MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.DARK_MAGICAL_WOOD_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_DARK_MAGICAL_WOOD_WOOD, 5, 5);

        registry.add(ModBlocks.DARK_MAGICAL_WOOD_LEAVES, 30, 60);
        registry.add(ModBlocks.DARK_MAGICAL_WOOD_PLANKS, 5, 20);
    }
}
