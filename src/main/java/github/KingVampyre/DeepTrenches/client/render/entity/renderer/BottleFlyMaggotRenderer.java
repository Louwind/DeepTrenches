package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyMaggotModel;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyMaggotEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BottleFlyMaggotRenderer extends MobEntityRenderer<BottleFlyMaggotEntity, BottleFlyMaggotModel> {

    public static final Identifier TEXTURE = new Identifier("deep_trenches:textures/entity/bottle_fly_maggot.png");

    public BottleFlyMaggotRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BottleFlyMaggotModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BottleFlyMaggotEntity entity) {
        return TEXTURE;
    }

}
