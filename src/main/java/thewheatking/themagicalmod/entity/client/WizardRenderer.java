package thewheatking.themagicalmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.entity.custom.WizardEntity;

public class WizardRenderer extends GeoEntityRenderer<WizardEntity> {
    public WizardRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WizardModel());
    }

    @Override
    public Identifier getTextureLocation(WizardEntity animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "textures/entity/wizard.png");
    }

    @Override
    public void render(WizardEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f,0.4f,0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
