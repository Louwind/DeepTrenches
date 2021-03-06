package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.DragonfishRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class LightLoosejawRenderer extends DragonfishRenderer<LightLoosejawEntity, LightLoosejawModel> {

    public LightLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LightLoosejawModel(), 0.4F);
    }

    @Override
    protected void setupTransforms(LightLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.005F);
    }

}
