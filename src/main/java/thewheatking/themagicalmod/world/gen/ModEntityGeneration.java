package thewheatking.themagicalmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import thewheatking.themagicalmod.entity.ModEntities;

public class ModEntityGeneration {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), SpawnGroup.MONSTER,
                ModEntities.WIZARD, 35,4, 8);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), SpawnGroup.MONSTER,
                ModEntities.WIZARD, 35,4, 8);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS), SpawnGroup.MONSTER,
                ModEntities.WIZARD, 35,4, 8);

        SpawnRestriction.register(ModEntities.WIZARD, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PathAwareEntity::canMobSpawn);
    }
}
