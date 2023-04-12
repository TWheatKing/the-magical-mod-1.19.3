package thewheatking.themagicalmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import thewheatking.themagicalmod.block.ModBlocks;
import thewheatking.themagicalmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_AMETHYST), RecipeCategory.MISC, ModItems.AMETHYST,
                1f, 200, "amethyst");
        offerSmelting(exporter, List.of(ModBlocks.AMETHYST_ORE), RecipeCategory.MISC, Items.AMETHYST_SHARD,
                1f, 200, "amethyst");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE), RecipeCategory.MISC, Items.AMETHYST_SHARD,
                1f, 200, "amethyst");
        offerBlasting(exporter, List.of(ModItems.RAW_AMETHYST), RecipeCategory.MISC, ModItems.AMETHYST,
                1f, 100, "amethyst");
        offerBlasting(exporter, List.of(ModBlocks.AMETHYST_ORE), RecipeCategory.MISC, Items.AMETHYST_BLOCK,
                1f, 100, "amethyst");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE), RecipeCategory.MISC, Items.AMETHYST_BLOCK,
                1f, 100, "amethyst");

        offerSmelting(exporter, List.of(ModBlocks.MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.CHARCOAL,
                1f, 200, "magic");
        offerBlasting(exporter, List.of(ModBlocks.MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.COAL,
                1f, 100, "magic");

        offerSmelting(exporter, List.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.COAL,
                1f, 200, "ancient_magic");
        offerBlasting(exporter, List.of(ModBlocks.ANCIENT_MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.COAL_BLOCK,
                1f, 100, "ancient_magic");

        offerSmelting(exporter, List.of(ModBlocks.DARK_MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.FERMENTED_SPIDER_EYE,
                1f, 200, "dark_magic");
        offerBlasting(exporter, List.of(ModBlocks.DARK_MAGICAL_WOOD_LOG), RecipeCategory.MISC, Items.SPIDER_SPAWN_EGG,
                1f, 100, "dark_magic");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MAGICAL_WOOD, RecipeCategory.DECORATIONS,
                ModBlocks.MAGICAL_WOOD_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANCIENT_MAGICAL_WOOD, RecipeCategory.DECORATIONS,
                ModBlocks.ANCIENT_MAGICAL_WOOD_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_MAGICAL_WOOD, RecipeCategory.DECORATIONS,
                ModBlocks.DARK_MAGICAL_WOOD_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_AMETHYST)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('A', ModItems.AMETHYST)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.AMETHYST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AMETHYST))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_AMETHYST)));

    }
}
