package thewheatking.themagicalmod.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.entity.custom.WizardEntity;

public class WizardModel extends GeoModel<WizardEntity> {
    @Override
    public Identifier getModelResource(WizardEntity animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "geo/wizard.geo.json");
    }

    @Override
    public Identifier getTextureResource(WizardEntity animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "textures/entity/wizard.png");
    }

    @Override
    public Identifier getAnimationResource(WizardEntity animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "animations/wizard.animation.json");
    }

    @Override
    public void setCustomAnimations(WizardEntity animatable, long instanceId, AnimationState<WizardEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
