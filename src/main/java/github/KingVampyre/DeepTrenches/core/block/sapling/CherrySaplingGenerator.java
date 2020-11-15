package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CHERRY_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class CherrySaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_CHERRY = new Identifier("deep_trenches:big_cherry");
    private static final Identifier MEDIUM_CHERRY = new Identifier("deep_trenches:medium_cherry");

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_CHERRY = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_cherry"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_cherry_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_cherry_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_cherry_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(BIG_CHERRY);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if(random.nextInt(5) == 0)
            return CONFIGURED_FEATURE.get(MEDIUM_CHERRY);

        Identifier id = SMALL_CHERRY.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return CHERRY_SAPLING;
    }

}