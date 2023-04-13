package thewheatking.themagicalmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.entity.ModEntities;
import thewheatking.themagicalmod.item.custom.AnimatedItem;

public class ModItems {
    public static final Item MAGICAL_WOOD = registerItem("magical_wood",
            new Item(new FabricItemSettings()));
    public static final Item ANCIENT_MAGICAL_WOOD = registerItem("ancient_magical_wood",
            new Item(new FabricItemSettings()));
    public static final Item DARK_MAGICAL_WOOD = registerItem("dark_magical_wood",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST = registerItem("amethyst",
            new Item(new FabricItemSettings()));
    public static final Item RAW_AMETHYST = registerItem("raw_amethyst",
            new Item(new FabricItemSettings()));
    public static final Item WIZARD_SPAWN_EGG = registerItem("wizard_spawn_egg",
            new SpawnEggItem(ModEntities.WIZARD,0x080808, 0x372721,
        new FabricItemSettings()));

    public static final Item DARK_SPELLSTAFF = registerItem("dark_spellstaff",
            new AnimatedItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheMagicalMod.MOD_ID, name), item);
    }

    public static void  addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, MAGICAL_WOOD);
        addToItemGroup(ItemGroups.INGREDIENTS, ANCIENT_MAGICAL_WOOD);
        addToItemGroup(ItemGroups.INGREDIENTS, DARK_MAGICAL_WOOD);
        addToItemGroup(ItemGroups.INGREDIENTS, AMETHYST);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_AMETHYST);

        addToItemGroup(ModItemGroup.THEMAGICALMOD, MAGICAL_WOOD);
        addToItemGroup(ModItemGroup.THEMAGICALMOD, ANCIENT_MAGICAL_WOOD);
        addToItemGroup(ModItemGroup.THEMAGICALMOD, DARK_MAGICAL_WOOD);
        addToItemGroup(ModItemGroup.THEMAGICALMOD, AMETHYST);
        addToItemGroup(ModItemGroup.THEMAGICALMOD, RAW_AMETHYST);

        addToItemGroup(ModItemGroup.THEMAGICALMOD, WIZARD_SPAWN_EGG);
        addToItemGroup(ModItemGroup.THEMAGICALMOD, DARK_SPELLSTAFF);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        TheMagicalMod.LOGGER.info("Registering Mod Items for " + TheMagicalMod.MOD_ID);

        addItemsToItemGroup();
    }
}
