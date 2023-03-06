package thewheatking.themagicalmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.item.ModItemGroup;
import thewheatking.themagicalmod.world.tree.MagicalWoodSaplingGenerator;

public class ModBlocks {
    public static final Block MAGICAL_WOOD_BLOCK = registerBlock("magical_wood_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);

    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.THEMAGICALMOD);
    public static final Block DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(4, 9)), ModItemGroup.THEMAGICALMOD);

    public static final Block MAGICAL_WOOD_LOG = registerBlock("magical_wood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);
    public static final Block MAGICAL_WOOD_WOOD = registerBlock("magical_wood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);
    public static final Block STRIPPED_MAGICAL_WOOD_LOG = registerBlock("stripped_magical_wood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);
    public static final Block STRIPPED_MAGICAL_WOOD_WOOD = registerBlock("stripped_magical_wood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);

    public static final Block MAGICAL_WOOD_PLANKS = registerBlock("magical_wood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);
    public static final Block MAGICAL_WOOD_LEAVES = registerBlock("magical_wood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);

    public static final Block MAGICAL_WOOD_SAPLING = registerBlock("magical_wood_sapling",
            new SaplingBlock(new MagicalWoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.THEMAGICALMOD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TheMagicalMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TheMagicalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TheMagicalMod.LOGGER.info("Registering ModBlocks for " + TheMagicalMod.MOD_ID);
    }
}
