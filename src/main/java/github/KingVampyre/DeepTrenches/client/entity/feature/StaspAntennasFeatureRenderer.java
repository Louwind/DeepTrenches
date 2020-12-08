package github.KingVampyre.DeepTrenches.client.entity.feature;

import com.mojang.blaze3d.platform.GlStateManager;
import github.KingVampyre.DeepTrenches.client.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class StaspAntennasFeatureRenderer extends FeatureRenderer<StaspEntity, StaspModel>  {

    private static final RenderLayer BLACK_STASP_ANTENNAS = RenderLayer.getEyes(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = RenderLayer.getEyes(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    public StaspAntennasFeatureRenderer(FeatureRendererContext<StaspEntity, StaspModel> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, StaspEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SrcFactor.ONE.field_22545, GlStateManager.DstFactor.ONE.field_22528);
        GlStateManager.depthMask(!entity.isInvisible());

        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(entity.getType() == EntityTypes.BLACK_STASP ? BLACK_STASP_ANTENNAS : STASP_ANTENNAS);

        this.getContextModel().render(matrices, vertexConsumer, 15728640, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);

        GlStateManager.disableBlend();
    }

}