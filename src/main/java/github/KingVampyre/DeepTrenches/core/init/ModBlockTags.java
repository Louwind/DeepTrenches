package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final Tag<Block> AQUEAN_LOGS = TagRegistry.block(new Identifier("deep_trenches:aquean_logs"));

    public static final Tag<Block> DRITEAN = TagRegistry.block(new Identifier("deep_trenches:dritean"));

    public static final Tag<Block> FUCHSITRA_LOGS = TagRegistry.block(new Identifier("deep_trenches:fuchsitra_logs"));

    public static final Tag<Block> STASP_POLLEN_SOURCE = TagRegistry.block(new Identifier("deep_trenches:stasp_pollen_source"));

    public static final Tag<Block> STASP_POLLEN_TARGET = TagRegistry.block(new Identifier("deep_trenches:stasp_pollen_target"));

}
