package thewheatking.themagicalmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.entity.custom.WizardEntity;

public class ModEntities {
    public static final EntityType<WizardEntity> WIZARD = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(TheMagicalMod.MOD_ID, "wizard"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WizardEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.8f)).build());
}
