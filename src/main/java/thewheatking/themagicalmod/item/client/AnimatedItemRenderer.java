package thewheatking.themagicalmod.item.client;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import thewheatking.themagicalmod.item.custom.AnimatedItem;

public class AnimatedItemRenderer extends GeoItemRenderer<AnimatedItem> {
    public AnimatedItemRenderer() {
        super(new AnimatedItemModel());
    }
}
