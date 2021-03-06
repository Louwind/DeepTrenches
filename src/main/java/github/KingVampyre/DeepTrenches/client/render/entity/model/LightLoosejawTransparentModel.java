// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class LightLoosejawTransparentModel extends AnimatedEntityModel<LightLoosejawEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Upper_Jaw;
    private final AnimatedModelRenderer Eyeinnerside2;
    private final AnimatedModelRenderer Eyeouterside2;
    private final AnimatedModelRenderer Eyeinnerside1;
    private final AnimatedModelRenderer Eyeouterside1;
    private final AnimatedModelRenderer Upper_teeth_side_1;
    private final AnimatedModelRenderer Upper_teeth_side_2;
    private final AnimatedModelRenderer Front_upper_teeth;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Fronttooth;
    private final AnimatedModelRenderer Front_tooth_side_1;
    private final AnimatedModelRenderer Front_tooth_side_2;
    private final AnimatedModelRenderer Teeth_side_1;
    private final AnimatedModelRenderer Teeth_side_2;
    private final AnimatedModelRenderer Tail;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Anal_fin;
    private final AnimatedModelRenderer Pelvic_fin_side_1;
    private final AnimatedModelRenderer Pelvic_fin_side_2;

    public LightLoosejawTransparentModel() {
        textureWidth = 128;
        textureHeight = 64;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Upper_Jaw = new AnimatedModelRenderer(this);
        Upper_Jaw.setRotationPoint(0.0F, 16.0F, -12.0F);
        root.addChild(Upper_Jaw);
        Upper_Jaw.setTextureOffset(0, 22).addBox(-2.5F, -3.0F, -11.0F, 5.0F, 6.0F, 10.0F, 0.0F, false);
        Upper_Jaw.setModelRendererName("Upper_Jaw");
        this.registerModelRenderer(Upper_Jaw);

        Eyeinnerside2 = new AnimatedModelRenderer(this);
        Eyeinnerside2.setRotationPoint(-2.0F, -1.8F, -9.5F);
        Upper_Jaw.addChild(Eyeinnerside2);
        Eyeinnerside2.setTextureOffset(13, 17).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        Eyeinnerside2.setModelRendererName("Eyeinnerside2");
        this.registerModelRenderer(Eyeinnerside2);

        Eyeouterside2 = new AnimatedModelRenderer(this);
        Eyeouterside2.setRotationPoint(0.0F, -0.3F, 1.0F);
        Eyeinnerside2.addChild(Eyeouterside2);
        Eyeouterside2.setTextureOffset(0, 15).addBox(-1.4F, 0.0F, -1.4F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Eyeouterside2.setModelRendererName("Eyeouterside2");
        this.registerModelRenderer(Eyeouterside2);

        Eyeinnerside1 = new AnimatedModelRenderer(this);
        Eyeinnerside1.setRotationPoint(2.5F, -1.8F, -9.5F);
        Upper_Jaw.addChild(Eyeinnerside1);
        Eyeinnerside1.setTextureOffset(13, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        Eyeinnerside1.setModelRendererName("Eyeinnerside1");
        this.registerModelRenderer(Eyeinnerside1);

        Eyeouterside1 = new AnimatedModelRenderer(this);
        Eyeouterside1.setRotationPoint(0.0F, -0.3F, -0.4F);
        Eyeinnerside1.addChild(Eyeouterside1);
        Eyeouterside1.setTextureOffset(0, 15).addBox(-2.2F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);
        Eyeouterside1.setModelRendererName("Eyeouterside1");
        this.registerModelRenderer(Eyeouterside1);

        Upper_teeth_side_1 = new AnimatedModelRenderer(this);
        Upper_teeth_side_1.setRotationPoint(2.4F, 2.3F, -10.7F);
        Upper_Jaw.addChild(Upper_teeth_side_1);
        Upper_teeth_side_1.setTextureOffset(0, 35).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        Upper_teeth_side_1.setModelRendererName("Upper_teeth_side_1");
        this.registerModelRenderer(Upper_teeth_side_1);

        Upper_teeth_side_2 = new AnimatedModelRenderer(this);
        Upper_teeth_side_2.setRotationPoint(-2.4F, 2.3F, -10.7F);
        Upper_Jaw.addChild(Upper_teeth_side_2);
        Upper_teeth_side_2.setTextureOffset(0, 35).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        Upper_teeth_side_2.setModelRendererName("Upper_teeth_side_2");
        this.registerModelRenderer(Upper_teeth_side_2);

        Front_upper_teeth = new AnimatedModelRenderer(this);
        Front_upper_teeth.setRotationPoint(0.0F, 2.3F, -10.7F);
        Upper_Jaw.addChild(Front_upper_teeth);
        Front_upper_teeth.setTextureOffset(0, 43).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, false);
        Front_upper_teeth.setModelRendererName("Front_upper_teeth");
        this.registerModelRenderer(Front_upper_teeth);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, -3.1F, -1.0F);
        Upper_Jaw.addChild(Body);
        Body.setTextureOffset(0, 39).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 16.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 7.0F, 2.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.3187F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(30, 26).addBox(-2.5F, -1.5F, -12.0F, 5.0F, 1.0F, 12.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Fronttooth = new AnimatedModelRenderer(this);
        Fronttooth.setRotationPoint(0.0F, -1.0F, -12.3F);
        Lower_jaw.addChild(Fronttooth);
        setRotationAngle(Fronttooth, 0.2731F, 0.0F, 0.0F);
        Fronttooth.setTextureOffset(31, 33).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Fronttooth.setModelRendererName("Fronttooth");
        this.registerModelRenderer(Fronttooth);

        Front_tooth_side_1 = new AnimatedModelRenderer(this);
        Front_tooth_side_1.setRotationPoint(2.4F, -1.5F, -11.49F);
        Lower_jaw.addChild(Front_tooth_side_1);
        setRotationAngle(Front_tooth_side_1, 0.192F, 0.0F, 0.0F);
        Front_tooth_side_1.setTextureOffset(34, 32).addBox(0.0F, -3.32F, 0.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
        Front_tooth_side_1.setModelRendererName("Front_tooth_side_1");
        this.registerModelRenderer(Front_tooth_side_1);

        Front_tooth_side_2 = new AnimatedModelRenderer(this);
        Front_tooth_side_2.setRotationPoint(-2.4F, -1.5F, -11.49F);
        Lower_jaw.addChild(Front_tooth_side_2);
        setRotationAngle(Front_tooth_side_2, 0.192F, 0.0F, 0.0F);
        Front_tooth_side_2.setTextureOffset(34, 32).addBox(0.0F, -3.32F, 0.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
        Front_tooth_side_2.setModelRendererName("Front_tooth_side_2");
        this.registerModelRenderer(Front_tooth_side_2);

        Teeth_side_1 = new AnimatedModelRenderer(this);
        Teeth_side_1.setRotationPoint(2.4F, -1.0F, -10.2F);
        Lower_jaw.addChild(Teeth_side_1);
        setRotationAngle(Teeth_side_1, 0.1703F, 0.0F, 0.0F);
        Teeth_side_1.setTextureOffset(0, 30).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
        Teeth_side_1.setModelRendererName("Teeth_side_1");
        this.registerModelRenderer(Teeth_side_1);

        Teeth_side_2 = new AnimatedModelRenderer(this);
        Teeth_side_2.setRotationPoint(-2.4F, -1.0F, -10.2F);
        Lower_jaw.addChild(Teeth_side_2);
        setRotationAngle(Teeth_side_2, 0.1703F, 0.0F, 0.0F);
        Teeth_side_2.setTextureOffset(0, 30).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
        Teeth_side_2.setModelRendererName("Teeth_side_2");
        this.registerModelRenderer(Teeth_side_2);

        Tail = new AnimatedModelRenderer(this);
        Tail.setRotationPoint(0.0F, 3.0F, 15.7F);
        Body.addChild(Tail);
        Tail.setTextureOffset(43, 41).addBox(-1.0F, -2.8F, 0.0F, 2.0F, 6.0F, 15.0F, 0.0F, false);
        Tail.setModelRendererName("Tail");
        this.registerModelRenderer(Tail);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 0.0F, 14.3F);
        Tail.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(88, 37).addBox(0.0F, -6.3F, 0.0F, 0.0F, 13.0F, 12.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, -3.0F, 6.0F);
        Tail.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(69, 34).addBox(0.0F, -3.7F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Anal_fin = new AnimatedModelRenderer(this);
        Anal_fin.setRotationPoint(0.0F, 2.9F, 6.0F);
        Tail.addChild(Anal_fin);
        Anal_fin.setTextureOffset(69, 28).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, false);
        Anal_fin.setModelRendererName("Anal_fin");
        this.registerModelRenderer(Anal_fin);

        Pelvic_fin_side_1 = new AnimatedModelRenderer(this);
        Pelvic_fin_side_1.setRotationPoint(2.5F, 6.6F, 8.0F);
        Body.addChild(Pelvic_fin_side_1);
        setRotationAngle(Pelvic_fin_side_1, 0.5465F, 0.0F, -0.1396F);
        Pelvic_fin_side_1.setTextureOffset(8, -3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 4.0F, 0.0F, false);
        Pelvic_fin_side_1.setModelRendererName("Pelvic_fin_side_1");
        this.registerModelRenderer(Pelvic_fin_side_1);

        Pelvic_fin_side_2 = new AnimatedModelRenderer(this);
        Pelvic_fin_side_2.setRotationPoint(-2.5F, 6.6F, 8.0F);
        Body.addChild(Pelvic_fin_side_2);
        setRotationAngle(Pelvic_fin_side_2, 0.5465F, 0.0F, 0.1396F);
        Pelvic_fin_side_2.setTextureOffset(8, -3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 4.0F, 0.0F, false);
        Pelvic_fin_side_2.setModelRendererName("Pelvic_fin_side_2");
        this.registerModelRenderer(Pelvic_fin_side_2);

        this.rootBones.add(root);
    }


    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/light_loosejaw_luring.json");
    }

}