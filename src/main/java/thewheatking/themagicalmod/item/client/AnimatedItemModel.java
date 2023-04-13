package thewheatking.themagicalmod.item.client;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import thewheatking.themagicalmod.TheMagicalMod;
import thewheatking.themagicalmod.item.custom.AnimatedItem;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public Identifier getModelResource(AnimatedItem animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "geo/dark_spellstaff.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedItem animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "textures/item/dark_spellstaff.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedItem animatable) {
        return new Identifier(TheMagicalMod.MOD_ID, "animations/dark_spellstaff.animation.json");
    }
}
