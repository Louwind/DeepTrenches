package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUNERANITE_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class FuneraniteSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> FUNERANITE = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:funeranite"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:funeranite_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:funeranite_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:funeranite_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = FUNERANITE.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return FUNERANITE_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
