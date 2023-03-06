package thewheatking.themagicalmod.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks(){
        StrippableBlockRegistry.register(ModBlocks.MAGICAL_WOOD_LOG, ModBlocks.STRIPPED_MAGICAL_WOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.MAGICAL_WOOD_WOOD, ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD);
    }
}
