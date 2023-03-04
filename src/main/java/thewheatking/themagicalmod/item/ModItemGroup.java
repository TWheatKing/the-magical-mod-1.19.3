package thewheatking.themagicalmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import thewheatking.themagicalmod.TheMagicalMod;

public class ModItemGroup {
    public static ItemGroup THEMAGICALMOD;

    public static void registerItemGroups() {
        THEMAGICALMOD = FabricItemGroup.builder(new Identifier(TheMagicalMod.MOD_ID, "themagicalmod"))
                .displayName(Text.translatable("itemgroup.themagicalmod"))
                .icon(() -> new ItemStack(ModItems.MAGICAL_WOOD)).build();
    }
}
