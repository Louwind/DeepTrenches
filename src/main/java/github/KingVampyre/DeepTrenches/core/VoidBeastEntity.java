package github.KingVampyre.DeepTrenches.core;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class VoidBeastEntity extends PathAwareEntity implements IAnimatedEntity {

    public VoidBeastEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return null;
    }

}
