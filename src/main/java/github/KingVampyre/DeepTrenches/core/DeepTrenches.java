package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.core.init.*;
import github.KingVampyre.DeepTrenches.core.util.DefaultAttributeHelper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static github.KingVampyre.DeepTrenches.core.init.ItemGroups.GENERAL;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.*;
import static github.KingVampyre.DeepTrenches.core.init.PaintingMotives.*;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.*;
import static net.minecraft.util.registry.Registry.*;

public class  DeepTrenches implements ModInitializer {

    @Override
    public void onInitialize() {
		/* -------------------------------- Loot Conditions ------------------------------------------- */
		Registry.register(LOOT_CONDITION_TYPE, new Identifier("deep_trenches:check_wood_type"), LootConditionTypes.CHECK_WOOD_TYPE);

		/* -------------------------------- Attributes ------------------------------------------- */
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:blink_interval"), ModEntityAttributes.BLINK_INTERVAL);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:blink_range"), ModEntityAttributes.BLINK_RANGE);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:blink_delay"), ModEntityAttributes.BLINK_DELAY);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:max_blinks"), ModEntityAttributes.MAX_BLINKS);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:min_blinks"), ModEntityAttributes.MIN_BLINKS);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_attraction"), ModEntityAttributes.LURE_ATTRACTION);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_delay"), ModEntityAttributes.LURE_DELAY);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_max_lit"), ModEntityAttributes.LURE_MAX_LIT);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_max_unlit"), ModEntityAttributes.LURE_MAX_UNLIT);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_min_lit"), ModEntityAttributes.LURE_MIN_LIT);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:lure_min_unlit"), ModEntityAttributes.LURE_MIN_UNLIT);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:max_luring"), ModEntityAttributes.MAX_LURING);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:min_luring"), ModEntityAttributes.MIN_LURING);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:prey_detection"), ModEntityAttributes.PREY_DETECTION);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:suborbital_delay"), ModEntityAttributes.SUBORBITAL_DELAY);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:suborbital_max_lit"), ModEntityAttributes.SUBORBITAL_MAX_LIT);
		Registry.register(ATTRIBUTE, new Identifier("deep_trenches:suborbital_min_lit"), ModEntityAttributes.SUBORBITAL_MIN_LIT);

		/* -------------------------------- Default Attributes ------------------------------------------- */
		FabricDefaultAttributeRegistry.register(EntityTypes.BEARDED_SEADEVIL, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.ATLANTIC_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.GLOWING_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.GRIMALDIS_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.MANY_RAYED_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.SHINY_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.TITTMANNS_BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BLACK_BLUE_BETTA, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BLUE_BETTA, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.COLORFUL_BETTA, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.ICARUS, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.ICARUS_JUNIOR, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.ICARUS_THE_THIRD, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.RED_BETTA, DefaultAttributeHelper.createBettaAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BLACK_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.NORTHERN_BLACK_LOOSEJAW, DefaultAttributeHelper.createBlackLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.SOUTHERN_BLACK_LOOSEJAW, DefaultAttributeHelper.createBlackLoosejawAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BLACK_SCABBARD, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BLACK_SEADEVIL, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BLOBFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BLUE_WHALE, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BOTTLE_FLY, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BOTTLE_FLY_MAGGOT, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BROWN_BEAR, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.CETACHSAL, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.DEEP_LAKE_BETTA, DefaultAttributeHelper.createDeepLakeBettaAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.FANGTOOTH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.FINANGITE, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.FLY, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.GIANT_HATCHETFISH, DefaultAttributeHelper.createGiantHatchetfishAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.GIANT_SEED_SHRIMP, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.HONEYCOMB_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.LACERATOR, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.LANCETFISH, DefaultAttributeHelper.createMobAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BIGLAMP_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.GOODYEARS_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.GUERNES_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.LIEMS_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.REMARKABLE_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.SMALL_LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.MAGGOT, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.PRINCE_AXELS_WONDERFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.SMALLTOOTH_DRAGONFISH, DefaultAttributeHelper.createSmalltoothDragonfishAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.BLACK_STASP, DefaultAttributeHelper.createStaspAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.BLUE_WINGED_STASP, DefaultAttributeHelper.createStaspAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.FUCHSITRA_STASP, DefaultAttributeHelper.createStaspAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.ORANGE_WINGED_STASP, DefaultAttributeHelper.createStaspAttributes());

		FabricDefaultAttributeRegistry.register(EntityTypes.TELESCOPEFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.THREADFIN_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.VIPERFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.VOID_BEAST, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(EntityTypes.WOLFTRAP_SEADEVIL, DefaultAttributeHelper.createMobAttributes());

		/* -------------------------------- Enchantments ------------------------------------------- */
		Registry.register(ENCHANTMENT, new Identifier("deep_trenches:soul_draining"), ModEnchantments.SOUL_DRAINING);

		/* -------------------------------- Entity Types ------------------------------------------- */
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:adaigger"), EntityTypes.ADAIGGER);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:bearded_seadevil"), EntityTypes.BEARDED_SEADEVIL);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:atlantic_barbeled_loosejaw"), EntityTypes.ATLANTIC_BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:glowing_barbeled_loosejaw"), EntityTypes.GLOWING_BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:grimaldis_barbeled_loosejaw"), EntityTypes.GRIMALDIS_BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:many_rayed_barbeled_loosejaw"), EntityTypes.MANY_RAYED_BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:shiny_barbeled_loosejaw"), EntityTypes.SHINY_BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:tittmanns_barbeled_loosejaw"), EntityTypes.TITTMANNS_BARBELED_LOOSEJAW);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:black_blue_betta"), EntityTypes.BLACK_BLUE_BETTA);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:blue_betta"), EntityTypes.BLUE_BETTA);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:colorful_betta"), EntityTypes.COLORFUL_BETTA);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:icarus"), EntityTypes.ICARUS);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:icarus_junior"), EntityTypes.ICARUS_JUNIOR);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:icarus_the_third"), EntityTypes.ICARUS_THE_THIRD);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:red_betta"), EntityTypes.RED_BETTA);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:black_dragonfish"), EntityTypes.BLACK_DRAGONFISH);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:northern_black_loosejaw"), EntityTypes.NORTHERN_BLACK_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:southern_black_loosejaw"), EntityTypes.SOUTHERN_BLACK_LOOSEJAW);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:black_scabbard"), EntityTypes.BLACK_SCABBARD);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:black_seadevil"), EntityTypes.BLACK_SEADEVIL);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:blobfish"), EntityTypes.BLOBFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:blue_whale"), EntityTypes.BLUE_WHALE);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:boat"), EntityTypes.BOAT);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:bottle_fly"), EntityTypes.BOTTLE_FLY);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:bottle_fly_maggot"), EntityTypes.BOTTLE_FLY_MAGGOT);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:brown_bear"), EntityTypes.BROWN_BEAR);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:cetachsal"), EntityTypes.CETACHSAL);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:deep_lake_betta"), EntityTypes.DEEP_LAKE_BETTA);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:fangtooth"), EntityTypes.FANGTOOTH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:finangite"), EntityTypes.FINANGITE);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:fly"), EntityTypes.FLY);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:giant_hatchetfish"), EntityTypes.GIANT_HATCHETFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:giant_seed_shrimp"), EntityTypes.GIANT_SEED_SHRIMP);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:honeycomb_dragonfish"), EntityTypes.HONEYCOMB_DRAGONFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:lacerator"), EntityTypes.LACERATOR);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:lancetfish"), EntityTypes.LANCETFISH);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:biglamp_light_loosejaw"), EntityTypes.BIGLAMP_LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:goodyears_light_loosejaw"), EntityTypes.GOODYEARS_LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:guernes_light_loosejaw"), EntityTypes.GUERNES_LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:liems_light_loosejaw"), EntityTypes.LIEMS_LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:remarkable_light_loosejaw"), EntityTypes.REMARKABLE_LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:small_light_loosejaw"), EntityTypes.SMALL_LIGHT_LOOSEJAW);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:maggot"), EntityTypes.MAGGOT);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:prince_axels_wonderfish"), EntityTypes.PRINCE_AXELS_WONDERFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:smalltooth_dragonfish"), EntityTypes.SMALLTOOTH_DRAGONFISH);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:black_stasp"), EntityTypes.BLACK_STASP);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:blue_winged_stasp"), EntityTypes.BLUE_WINGED_STASP);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:fuchsitra_stasp"), EntityTypes.FUCHSITRA_STASP);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:orange_winged_stasp"), EntityTypes.ORANGE_WINGED_STASP);

		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:telescopefish"), EntityTypes.TELESCOPEFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:threadfin_dragonfish"), EntityTypes.THREADFIN_DRAGONFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:viperfish"), EntityTypes.VIPERFISH);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:void_beast"), EntityTypes.VOID_BEAST);
		Registry.register(ENTITY_TYPE, new Identifier("deep_trenches:wolftrap_seadevil"), EntityTypes.WOLFTRAP_SEADEVIL);

		/* -------------------------------- Status Effects ------------------------------------------- */
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:braitor_beauty"), BRAITOR_BEAUTY);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:cosmos_beauty"), COSMOS_BEAUTY);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:cycawler_beauty"), CYCAWLER_BEAUTY);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:flower_beauty"), FLOWER_BEAUTY);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:sleepy"), SLEEPY);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:softbones"), SOFTBONES);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:soul_draining"), SOUL_DRAINING);
		Registry.register(STATUS_EFFECT, new Identifier("deep_trenches:soul_ravening"), SOUL_RAVENING);

		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:beach"), BEACH);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:beethoven_piano"), BEETHOVEN_PIANO);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:beethoven_upright_piano"), BEETHOVEN_UPRIGHT_PIANO);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:black_loosejaw_and_giant_seed_shrimp"), BLACK_LOOSEJAW_AND_GIANT_SEED_SHRIMP);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:black_loosejaw_in_marine_snow"), BLACK_LOOSEJAW_IN_MARINE_SNOW);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:black_seadevil"), BLACK_SEADEVIL);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:blue_violet_garden"), BLUE_VIOLET_GARDEN);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:icheel"), ICHEEL);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:scutigera"), SCUTIGERA);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:storcean_island"), STORCEAN_ISLAND);
		Registry.register(PAINTING_MOTIVE, new Identifier("deep_trenches:sunset_and_flowers"), SUNSET_AND_FLOWERS);

		/* -------------------------------- Potions ------------------------------------------- */

		Registry.register(POTION, new Identifier("deep_trenches:long_softbones"), ModPotions.LONG_SOFTBONES);
		Registry.register(POTION, new Identifier("deep_trenches:long_strong_softbones"), ModPotions.LONG_STRONG_SOFTBONES);
		Registry.register(POTION, new Identifier("deep_trenches:softbones"), ModPotions.SOFTBONES);
		Registry.register(POTION, new Identifier("deep_trenches:strong_softbones"), ModPotions.STRONG_SOFTBONES);

        /* -------------------------------- Blocks ------------------------------------------- */

        // Woods
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_button"), ALMOND_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_door"), ALMOND_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_fence"), ALMOND_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_fence_gate"), ALMOND_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_leaves"), ALMOND_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_log"), ALMOND_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_planks"), ALMOND_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_pressure_plate"), ALMOND_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_sapling"), ALMOND_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_sign"), ALMOND_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_slab"), ALMOND_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_stairs"), ALMOND_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_trapdoor"), ALMOND_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_wall_sign"), ALMOND_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:almond_wood"), ALMOND_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_button"), ANAMEATA_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_cap"), ANAMEATA_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_door"), ANAMEATA_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_fence"), ANAMEATA_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_fence_gate"), ANAMEATA_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_log"), ANAMEATA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_planks"), ANAMEATA_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_pressure_plate"), ANAMEATA_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_sapling"), ANAMEATA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_sign"), ANAMEATA_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_slab"), ANAMEATA_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_stairs"), ANAMEATA_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_trapdoor"), ANAMEATA_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_wall_sign"), ANAMEATA_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:anameata_wood"), ANAMEATA_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_button"), AQUEAN_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_door"), AQUEAN_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_fence"), AQUEAN_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_fence_gate"), AQUEAN_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_leaves"), AQUEAN_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_log"), AQUEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_planks"), AQUEAN_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_pressure_plate"), AQUEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_sapling"), AQUEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_sign"), AQUEAN_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_slab"), AQUEAN_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_stairs"), AQUEAN_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_trapdoor"), AQUEAN_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_wall_sign"), AQUEAN_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:aquean_wood"), AQUEAN_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_button"), BARSHROOKLE_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_cap"), BARSHROOKLE_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_door"), BARSHROOKLE_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_fence"), BARSHROOKLE_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_fence_gate"), BARSHROOKLE_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_log"), BARSHROOKLE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_planks"), BARSHROOKLE_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_pressure_plate"), BARSHROOKLE_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_sapling"), BARSHROOKLE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_sign"), BARSHROOKLE_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_slab"), BARSHROOKLE_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_stairs"), BARSHROOKLE_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_trapdoor"), BARSHROOKLE_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_wall_sign"), BARSHROOKLE_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:barshrookle_wood"), BARSHROOKLE_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_button"), BLACK_BIRCH_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_door"), BLACK_BIRCH_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_fence"), BLACK_BIRCH_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_fence_gate"), BLACK_BIRCH_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_leaves"), BLACK_BIRCH_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_log"), BLACK_BIRCH_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_planks"), BLACK_BIRCH_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_pressure_plate"), BLACK_BIRCH_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_sapling"), BLACK_BIRCH_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_sign"), BLACK_BIRCH_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_slab"), BLACK_BIRCH_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_stairs"), BLACK_BIRCH_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_trapdoor"), BLACK_BIRCH_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_wall_sign"), BLACK_BIRCH_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:black_birch_wood"), BLACK_BIRCH_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_button"), CHERRY_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_door"), CHERRY_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_fence"), CHERRY_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_fence_gate"), CHERRY_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_leaves"), CHERRY_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_log"), CHERRY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_planks"), CHERRY_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_pressure_plate"), CHERRY_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_sapling"), CHERRY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_sign"), CHERRY_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_slab"), CHERRY_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_stairs"), CHERRY_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_trapdoor"), CHERRY_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_wall_sign"), CHERRY_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cherry_wood"), CHERRY_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_button"), COOK_PINE_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_door"), COOK_PINE_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_fence"), COOK_PINE_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_fence_gate"), COOK_PINE_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_leaves"), COOK_PINE_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_log"), COOK_PINE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_planks"), COOK_PINE_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_pressure_plate"), COOK_PINE_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_sapling"), COOK_PINE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_sign"), COOK_PINE_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_slab"), COOK_PINE_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_stairs"), COOK_PINE_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_trapdoor"), COOK_PINE_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_wall_sign"), COOK_PINE_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cook_pine_wood"), COOK_PINE_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_button"), CROLOOD_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_door"), CROLOOD_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_fence"), CROLOOD_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_fence_gate"), CROLOOD_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_leaves"), CROLOOD_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_log"), CROLOOD_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_planks"), CROLOOD_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_pressure_plate"), CROLOOD_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_sapling"), CROLOOD_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_sign"), CROLOOD_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_slab"), CROLOOD_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_stairs"), CROLOOD_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_trapdoor"), CROLOOD_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_wall_sign"), CROLOOD_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:crolood_wood"), CROLOOD_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_button"), DARK_CROLOOD_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_door"), DARK_CROLOOD_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_fence"), DARK_CROLOOD_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_fence_gate"), DARK_CROLOOD_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_leaves"), DARK_CROLOOD_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_log"), DARK_CROLOOD_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_planks"), DARK_CROLOOD_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_pressure_plate"), DARK_CROLOOD_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_sapling"), DARK_CROLOOD_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_sign"), DARK_CROLOOD_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_slab"), DARK_CROLOOD_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_stairs"), DARK_CROLOOD_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_trapdoor"), DARK_CROLOOD_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_wall_sign"), DARK_CROLOOD_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dark_crolood_wood"), DARK_CROLOOD_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_button"), EBONY_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_door"), EBONY_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_fence"), EBONY_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_fence_gate"), EBONY_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_leaves"), EBONY_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_log"), EBONY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_planks"), EBONY_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_pressure_plate"), EBONY_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_sapling"), EBONY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_sign"), EBONY_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_slab"), EBONY_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_stairs"), EBONY_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_trapdoor"), EBONY_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_wall_sign"), EBONY_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ebony_wood"), EBONY_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_button"), FUCHSITRA_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_door"), FUCHSITRA_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_fence"), FUCHSITRA_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_fence_gate"), FUCHSITRA_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_leaves"), FUCHSITRA_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_log"), FUCHSITRA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_planks"), FUCHSITRA_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_pressure_plate"), FUCHSITRA_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_sapling"), FUCHSITRA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_sign"), FUCHSITRA_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_slab"), FUCHSITRA_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_stairs"), FUCHSITRA_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_trapdoor"), FUCHSITRA_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_wall_sign"), FUCHSITRA_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:fuchsitra_wood"), FUCHSITRA_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_button"), FUNERANITE_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_cap"), FUNERANITE_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_door"), FUNERANITE_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_fence"), FUNERANITE_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_fence_gate"), FUNERANITE_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_log"), FUNERANITE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_planks"), FUNERANITE_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_pressure_plate"), FUNERANITE_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_sapling"), FUNERANITE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_sign"), FUNERANITE_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_slab"), FUNERANITE_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_stairs"), FUNERANITE_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_trapdoor"), FUNERANITE_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_wall_sign"), FUNERANITE_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:funeranite_wood"), FUNERANITE_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_button"), GHOSHROOM_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_cap"), GHOSHROOM_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_door"), GHOSHROOM_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_fence"), GHOSHROOM_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_fence_gate"), GHOSHROOM_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_log"), GHOSHROOM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_planks"), GHOSHROOM_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_pressure_plate"), GHOSHROOM_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_sapling"), GHOSHROOM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_sign"), GHOSHROOM_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_slab"), GHOSHROOM_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_stairs"), GHOSHROOM_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_trapdoor"), GHOSHROOM_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_wall_sign"), GHOSHROOM_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ghoshroom_wood"), GHOSHROOM_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_button"), PELTOGYNE_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_door"), PELTOGYNE_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_fence"), PELTOGYNE_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_fence_gate"), PELTOGYNE_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_leaves"), PELTOGYNE_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_log"), PELTOGYNE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_planks"), PELTOGYNE_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_pressure_plate"), PELTOGYNE_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_sapling"), PELTOGYNE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_sign"), PELTOGYNE_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_slab"), PELTOGYNE_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_stairs"), PELTOGYNE_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_trapdoor"), PELTOGYNE_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_wall_sign"), PELTOGYNE_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:peltogyne_wood"), PELTOGYNE_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_button"), PIN_CHERRY_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_door"), PIN_CHERRY_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_fence"), PIN_CHERRY_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_fence_gate"), PIN_CHERRY_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_leaves"), PIN_CHERRY_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_log"), PIN_CHERRY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_planks"), PIN_CHERRY_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_pressure_plate"), PIN_CHERRY_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_sapling"), PIN_CHERRY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_sign"), PIN_CHERRY_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_slab"), PIN_CHERRY_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_stairs"), PIN_CHERRY_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_trapdoor"), PIN_CHERRY_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_wall_sign"), PIN_CHERRY_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:pin_cherry_wood"), PIN_CHERRY_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:plum_button"), PLUM_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_door"), PLUM_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_fence"), PLUM_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_fence_gate"), PLUM_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_leaves"), PLUM_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_log"), PLUM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_planks"), PLUM_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_pressure_plate"), PLUM_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_sapling"), PLUM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_sign"), PLUM_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_slab"), PLUM_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_stairs"), PLUM_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_trapdoor"), PLUM_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_wall_sign"), PLUM_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:plum_wood"), PLUM_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_button"), PURFUNGA_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_cap"), PURFUNGA_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_door"), PURFUNGA_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_fence"), PURFUNGA_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_fence_gate"), PURFUNGA_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_log"), PURFUNGA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_planks"), PURFUNGA_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_pressure_plate"), PURFUNGA_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_sapling"), PURFUNGA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_sign"), PURFUNGA_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_slab"), PURFUNGA_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_stairs"), PURFUNGA_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_trapdoor"), PURFUNGA_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_wall_sign"), PURFUNGA_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:purfunga_wood"), PURFUNGA_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_button"), SPROOM_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_door"), SPROOM_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_fence"), SPROOM_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_fence_gate"), SPROOM_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_leaves"), SPROOM_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_log"), SPROOM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_planks"), SPROOM_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_pressure_plate"), SPROOM_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_sapling"), SPROOM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_sign"), SPROOM_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_slab"), SPROOM_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_stairs"), SPROOM_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_trapdoor"), SPROOM_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_wall_sign"), SPROOM_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_wood"), SPROOM_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_button"), STORTREEAN_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_door"), STORTREEAN_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_fence"), STORTREEAN_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_fence_gate"), STORTREEAN_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_leaves"), STORTREEAN_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_log"), STORTREEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_planks"), STORTREEAN_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_pressure_plate"), STORTREEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_sapling"), STORTREEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_sign"), STORTREEAN_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_slab"), STORTREEAN_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_stairs"), STORTREEAN_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_trapdoor"), STORTREEAN_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_wall_sign"), STORTREEAN_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:stortreean_wood"), STORTREEAN_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_almond_log"), STRIPPED_ALMOND_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_almond_wood"), STRIPPED_ALMOND_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_anameata_log"), STRIPPED_ANAMEATA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_anameata_wood"), STRIPPED_ANAMEATA_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_aquean_log"), STRIPPED_AQUEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_aquean_wood"), STRIPPED_AQUEAN_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_barshrookle_log"), STRIPPED_BARSHROOKLE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_barshrookle_wood"), STRIPPED_BARSHROOKLE_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_black_birch_log"), STRIPPED_BLACK_BIRCH_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_black_birch_wood"), STRIPPED_BLACK_BIRCH_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_cherry_log"), STRIPPED_CHERRY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_cherry_wood"), STRIPPED_CHERRY_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_cook_pine_log"), STRIPPED_COOK_PINE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_cook_pine_wood"), STRIPPED_COOK_PINE_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_crolood_log"), STRIPPED_CROLOOD_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_crolood_wood"), STRIPPED_CROLOOD_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_dark_crolood_log"), STRIPPED_DARK_CROLOOD_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_dark_crolood_wood"), STRIPPED_DARK_CROLOOD_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_ebony_log"), STRIPPED_EBONY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_ebony_wood"), STRIPPED_EBONY_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_fuchsitra_log"), STRIPPED_FUCHSITRA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_fuchsitra_wood"), STRIPPED_FUCHSITRA_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_funeranite_log"), STRIPPED_FUNERANITE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_funeranite_wood"), STRIPPED_FUNERANITE_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_ghoshroom_log"), STRIPPED_GHOSHROOM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_ghoshroom_wood"), STRIPPED_GHOSHROOM_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_peltogyne_log"), STRIPPED_PELTOGYNE_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_peltogyne_wood"), STRIPPED_PELTOGYNE_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_pin_cherry_log"), STRIPPED_PIN_CHERRY_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_pin_cherry_wood"), STRIPPED_PIN_CHERRY_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_plum_log"), STRIPPED_PLUM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_plum_wood"), STRIPPED_PLUM_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_purfunga_log"), STRIPPED_PURFUNGA_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_purfunga_wood"), STRIPPED_PURFUNGA_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_sproom_log"), STRIPPED_SPROOM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_sproom_wood"), STRIPPED_SPROOM_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_stortreean_log"), STRIPPED_STORTREEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_stortreean_wood"), STRIPPED_STORTREEAN_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_stroomean_log"), STRIPPED_STROOMEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_stroomean_wood"), STRIPPED_STROOMEAN_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_sunrise_fungus_log"), STRIPPED_SUNRISE_FUNGUS_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_sunrise_fungus_wood"), STRIPPED_SUNRISE_FUNGUS_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_teak_log"), STRIPPED_TEAK_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_teak_wood"), STRIPPED_TEAK_WOOD);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_thundercloud_plum_log"), STRIPPED_THUNDERCLOUD_PLUM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stripped_thundercloud_plum_wood"), STRIPPED_THUNDERCLOUD_PLUM_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_button"), STROOMEAN_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_cap"), STROOMEAN_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_door"), STROOMEAN_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_fence"), STROOMEAN_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_fence_gate"), STROOMEAN_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_log"), STROOMEAN_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_planks"), STROOMEAN_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_pressure_plate"), STROOMEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_sapling"), STROOMEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_sign"), STROOMEAN_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_slab"), STROOMEAN_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_stairs"), STROOMEAN_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_trapdoor"), STROOMEAN_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_wall_sign"), STROOMEAN_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:stroomean_wood"), STROOMEAN_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_button"), SUNRISE_FUNGUS_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_cap"), SUNRISE_FUNGUS_CAP);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_door"), SUNRISE_FUNGUS_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_fence"), SUNRISE_FUNGUS_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_fence_gate"), SUNRISE_FUNGUS_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_log"), SUNRISE_FUNGUS_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_planks"), SUNRISE_FUNGUS_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_pressure_plate"), SUNRISE_FUNGUS_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_sapling"), SUNRISE_FUNGUS_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_sign"), SUNRISE_FUNGUS_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_slab"), SUNRISE_FUNGUS_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_stairs"), SUNRISE_FUNGUS_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_trapdoor"), SUNRISE_FUNGUS_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_wall_sign"), SUNRISE_FUNGUS_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_fungus_wood"), SUNRISE_FUNGUS_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:teak_button"), TEAK_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_door"), TEAK_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_fence"), TEAK_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_fence_gate"), TEAK_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_leaves"), TEAK_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_log"), TEAK_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_planks"), TEAK_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_pressure_plate"), TEAK_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_sapling"), TEAK_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_sign"), TEAK_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_slab"), TEAK_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_stairs"), TEAK_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_trapdoor"), TEAK_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_wall_sign"), TEAK_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:teak_wood"), TEAK_WOOD);

		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_button"), THUNDERCLOUD_PLUM_BUTTON);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_door"), THUNDERCLOUD_PLUM_DOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_fence"), THUNDERCLOUD_PLUM_FENCE);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_fence_gate"), THUNDERCLOUD_PLUM_FENCE_GATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_leaves"), THUNDERCLOUD_PLUM_LEAVES);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_log"), THUNDERCLOUD_PLUM_LOG);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_planks"), THUNDERCLOUD_PLUM_PLANKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_pressure_plate"), THUNDERCLOUD_PLUM_PRESSURE_PLATE);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_sapling"), THUNDERCLOUD_PLUM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_sign"), THUNDERCLOUD_PLUM_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_slab"), THUNDERCLOUD_PLUM_SLAB);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_stairs"), THUNDERCLOUD_PLUM_STAIRS);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_trapdoor"), THUNDERCLOUD_PLUM_TRAPDOOR);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_wall_sign"), THUNDERCLOUD_PLUM_WALL_SIGN);
		Registry.register(BLOCK, new Identifier("deep_trenches:thundercloud_plum_wood"), THUNDERCLOUD_PLUM_WOOD);

		// Coral
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_blackgreen_tree_coral"), DEAD_BLACKGREEN_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_blackgreen_tree_coral_block"), DEAD_BLACKGREEN_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_blackgreen_tree_coral_fan"), DEAD_BLACKGREEN_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_blackgreen_tree_coral_wall_fan"), DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:blackgreen_tree_coral"), BLACKGREEN_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:blackgreen_tree_coral_block"), BLACKGREEN_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:blackgreen_tree_coral_fan"), BLACKGREEN_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:blackgreen_tree_coral_wall_fan"), BLACKGREEN_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_broccoli_coral"), DEAD_BROCCOLI_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_broccoli_coral_block"), DEAD_BROCCOLI_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_broccoli_coral_fan"), DEAD_BROCCOLI_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_broccoli_coral_wall_fan"), DEAD_BROCCOLI_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:broccoli_coral"), BROCCOLI_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:broccoli_coral_block"), BROCCOLI_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:broccoli_coral_fan"), BROCCOLI_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:broccoli_coral_wall_fan"), BROCCOLI_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_bubblegum_coral"), DEAD_BUBBLEGUM_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_bubblegum_coral_block"), DEAD_BUBBLEGUM_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_bubblegum_coral_fan"), DEAD_BUBBLEGUM_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_bubblegum_coral_wall_fan"), DEAD_BUBBLEGUM_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:bubblegum_coral"), BUBBLEGUM_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:bubblegum_coral_block"), BUBBLEGUM_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:bubblegum_coral_fan"), BUBBLEGUM_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:bubblegum_coral_wall_fan"), BUBBLEGUM_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_cabbage_tree_coral"), DEAD_CABBAGE_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_cabbage_tree_coral_block"), DEAD_CABBAGE_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_cabbage_tree_coral_fan"), DEAD_CABBAGE_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_cabbage_tree_coral_wall_fan"), DEAD_CABBAGE_TREE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cabbage_tree_coral"), CABBAGE_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:cabbage_tree_coral_block"), CABBAGE_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:cabbage_tree_coral_fan"), CABBAGE_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:cabbage_tree_coral_wall_fan"), CABBAGE_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_flowertube_coral"), DEAD_FLOWERTUBE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_flowertube_coral_block"), DEAD_FLOWERTUBE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_flowertube_coral_fan"), DEAD_FLOWERTUBE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_flowertube_coral_wall_fan"), DEAD_FLOWERTUBE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:flowertube_coral"), FLOWERTUBE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:flowertube_coral_block"), FLOWERTUBE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:flowertube_coral_fan"), FLOWERTUBE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:flowertube_coral_wall_fan"), FLOWERTUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_garnet_spiral_coral"), DEAD_GARNET_SPIRAL_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_garnet_spiral_coral_block"), DEAD_GARNET_SPIRAL_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_garnet_spiral_coral_fan"), DEAD_GARNET_SPIRAL_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_garnet_spiral_coral_wall_fan"), DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:garnet_spiral_coral"), GARNET_SPIRAL_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:garnet_spiral_coral_block"), GARNET_SPIRAL_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:garnet_spiral_coral_fan"), GARNET_SPIRAL_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:garnet_spiral_coral_wall_fan"), GARNET_SPIRAL_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glow_forest_coral"), DEAD_GLOW_FOREST_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glow_forest_coral_block"), DEAD_GLOW_FOREST_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glow_forest_coral_fan"), DEAD_GLOW_FOREST_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glow_forest_coral_wall_fan"), DEAD_GLOW_FOREST_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:glow_forest_coral"), GLOW_FOREST_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:glow_forest_coral_block"), GLOW_FOREST_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:glow_forest_coral_fan"), GLOW_FOREST_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:glow_forest_coral_wall_fan"), GLOW_FOREST_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glowtongue_tube_coral"), DEAD_GLOWTONGUE_TUBE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glowtongue_tube_coral_block"), DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glowtongue_tube_coral_fan"), DEAD_GLOWTONGUE_TUBE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_glowtongue_tube_coral_wall_fan"), DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:glowtongue_tube_coral"), GLOWTONGUE_TUBE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:glowtongue_tube_coral_block"), GLOWTONGUE_TUBE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:glowtongue_tube_coral_fan"), GLOWTONGUE_TUBE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:glowtongue_tube_coral_wall_fan"), GLOWTONGUE_TUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_ivory_coral"), DEAD_IVORY_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_ivory_coral_block"), DEAD_IVORY_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_ivory_coral_fan"), DEAD_IVORY_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_ivory_coral_wall_fan"), DEAD_IVORY_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ivory_coral"), IVORY_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:ivory_coral_block"), IVORY_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:ivory_coral_fan"), IVORY_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:ivory_coral_wall_fan"), IVORY_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lime_brain_coral"), DEAD_LIME_BRAIN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lime_brain_coral_block"), DEAD_LIME_BRAIN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lime_brain_coral_fan"), DEAD_LIME_BRAIN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lime_brain_coral_wall_fan"), DEAD_LIME_BRAIN_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:lime_brain_coral"), LIME_BRAIN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:lime_brain_coral_block"), LIME_BRAIN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:lime_brain_coral_fan"), LIME_BRAIN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:lime_brain_coral_wall_fan"), LIME_BRAIN_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lophelia_coral"), DEAD_LOPHELIA_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lophelia_coral_block"), DEAD_LOPHELIA_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lophelia_coral_fan"), DEAD_LOPHELIA_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_lophelia_coral_wall_fan"), DEAD_LOPHELIA_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:lophelia_coral"), LOPHELIA_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:lophelia_coral_block"), LOPHELIA_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:lophelia_coral_fan"), LOPHELIA_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:lophelia_coral_wall_fan"), LOPHELIA_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_pipe_organ_coral"), DEAD_PIPE_ORGAN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_pipe_organ_coral_block"), DEAD_PIPE_ORGAN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_pipe_organ_coral_fan"), DEAD_PIPE_ORGAN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_pipe_organ_coral_wall_fan"), DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_pipe_organ_tentacles"), DEAD_PIPE_ORGAN_TENTACLES);
		Registry.register(BLOCK, new Identifier("deep_trenches:pipe_organ_coral"), PIPE_ORGAN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:pipe_organ_coral_block"), PIPE_ORGAN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:pipe_organ_coral_fan"), PIPE_ORGAN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:pipe_organ_coral_wall_fan"), PIPE_ORGAN_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:pipe_organ_tentacles"), PIPE_ORGAN_TENTACLES);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_red_tree_coral"), DEAD_RED_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_red_tree_coral_block"), DEAD_RED_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_red_tree_coral_fan"), DEAD_RED_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_red_tree_coral_wall_fan"), DEAD_RED_TREE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_tree_coral"), RED_TREE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_tree_coral_block"), RED_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_tree_coral_fan"), RED_TREE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_tree_coral_wall_fan"), RED_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_seafan_coral"), DEAD_SEAFAN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_seafan_coral_block"), DEAD_SEAFAN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_seafan_coral_fan"), DEAD_SEAFAN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_seafan_coral_wall_fan"), DEAD_SEAFAN_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:seafan_coral"), SEAFAN_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:seafan_coral_block"), SEAFAN_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:seafan_coral_fan"), SEAFAN_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:seafan_coral_wall_fan"), SEAFAN_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_straight_willow_coral"), DEAD_STRAIGHT_WILLOW_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_straight_willow_coral_block"), DEAD_STRAIGHT_WILLOW_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_straight_willow_coral_fan"), DEAD_STRAIGHT_WILLOW_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_straight_willow_coral_wall_fan"), DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:straight_willow_coral"), STRAIGHT_WILLOW_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:straight_willow_coral_block"), STRAIGHT_WILLOW_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:straight_willow_coral_fan"), STRAIGHT_WILLOW_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:straight_willow_coral_wall_fan"), STRAIGHT_WILLOW_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_sunrise_coral"), DEAD_SUNRISE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_sunrise_coral_block"), DEAD_SUNRISE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_sunrise_coral_fan"), DEAD_SUNRISE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_sunrise_coral_wall_fan"), DEAD_SUNRISE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_coral"), SUNRISE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_coral_block"), SUNRISE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_coral_fan"), SUNRISE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:sunrise_coral_wall_fan"), SUNRISE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_table_coral"), DEAD_TABLE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_table_coral_block"), DEAD_TABLE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_table_coral_fan"), DEAD_TABLE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_table_coral_wall_fan"), DEAD_TABLE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:table_coral"), TABLE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:table_coral_block"), TABLE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:table_coral_fan"), TABLE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:table_coral_wall_fan"), TABLE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_thin_blade_coral"), DEAD_THIN_BLADE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_thin_blade_coral_block"), DEAD_THIN_BLADE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_thin_blade_coral_fan"), DEAD_THIN_BLADE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_thin_blade_coral_wall_fan"), DEAD_THIN_BLADE_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:thin_blade_coral"), THIN_BLADE_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:thin_blade_coral_block"), THIN_BLADE_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:thin_blade_coral_fan"), THIN_BLADE_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:thin_blade_coral_wall_fan"), THIN_BLADE_CORAL_WALL_FAN);

		Registry.register(BLOCK, new Identifier("deep_trenches:dead_trumpetear_coral"), DEAD_TRUMPETEAR_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_trumpetear_coral_block"), DEAD_TRUMPETEAR_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_trumpetear_coral_fan"), DEAD_TRUMPETEAR_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:dead_trumpetear_coral_wall_fan"), DEAD_TRUMPETEAR_CORAL_WALL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:trumpetear_coral"), TRUMPETEAR_CORAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:trumpetear_coral_block"), TRUMPETEAR_CORAL_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:trumpetear_coral_fan"), TRUMPETEAR_CORAL_FAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:trumpetear_coral_wall_fan"), TRUMPETEAR_CORAL_WALL_FAN);

		// Flowers, plants and pots
		Registry.register(BLOCK, new Identifier("deep_trenches:black_lily"), BLACK_LILY);
		Registry.register(BLOCK, new Identifier("deep_trenches:blue_poppy"), BLUE_POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:blue_violet"), BLUE_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:bonnet_spurge"), BONNET_SPURGE);
		Registry.register(BLOCK, new Identifier("deep_trenches:bullthorn"), BULLTHORN);
		Registry.register(BLOCK, new Identifier("deep_trenches:chocolate_cosmos_flower"), CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:cycawler"), CYCAWLER);
		Registry.register(BLOCK, new Identifier("deep_trenches:garden_pinks"), GARDEN_PINKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:gyldelion_flower"), GYLDELION_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:lime_spurge"), LIME_SPURGE);
		Registry.register(BLOCK, new Identifier("deep_trenches:lupin_flower"), LUPIN_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:native_violet"), NATIVE_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:opium_poppy"), OPIUM_POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:orange_lily"), ORANGE_LILY);
		Registry.register(BLOCK, new Identifier("deep_trenches:pink_braitor_flower"), PINK_BRAITOR_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:pink_rose"), PINK_ROSE);
		Registry.register(BLOCK, new Identifier("deep_trenches:pink_rose_bush"), PINK_ROSE_BUSH);
		Registry.register(BLOCK, new Identifier("deep_trenches:poppy"), POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:purpround"), PURPROUND);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_braitor_flower"), RED_BRAITOR_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_chocolate_cosmos_flower"), RED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:red_rose"), RED_ROSE);
		Registry.register(BLOCK, new Identifier("deep_trenches:reebloon"), REEBLOON);
		Registry.register(BLOCK, new Identifier("deep_trenches:spike_lavender"), SPIKE_LAVENDER);
		Registry.register(BLOCK, new Identifier("deep_trenches:sprinly"), SPRINLY);
		Registry.register(BLOCK, new Identifier("deep_trenches:sproom_spike"), SPROOM_SPIKE);
		Registry.register(BLOCK, new Identifier("deep_trenches:sweet_violet"), SWEET_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:topped_lavender"), TOPPED_LAVENDER);
		Registry.register(BLOCK, new Identifier("deep_trenches:vaslame"), VASLAME);
		Registry.register(BLOCK, new Identifier("deep_trenches:velvet_lily"), VELVET_LILY);
		Registry.register(BLOCK, new Identifier("deep_trenches:weepy_hollower"), WEEPY_HOLLOWER);

		Registry.register(BLOCK, new Identifier("deep_trenches:potted_almond_sapling"), POTTED_ALMOND_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_anameata_sapling"), POTTED_ANAMEATA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_aquean_sapling"), POTTED_AQUEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_barshrookle_sapling"), POTTED_BARSHROOKLE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_black_birch_sapling"), POTTED_BLACK_BIRCH_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_cherry_sapling"), POTTED_CHERRY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_cook_pine_sapling"), POTTED_COOK_PINE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_crolood_sapling"), POTTED_CROLOOD_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_dark_crolood_sapling"), POTTED_DARK_CROLOOD_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_ebony_sapling"), POTTED_EBONY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_fuchsitra_sapling"), POTTED_FUCHSITRA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_funeranite_sapling"), POTTED_FUNERANITE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_ghoshroom_sapling"), POTTED_GHOSHROOM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_peltogyne_sapling"), POTTED_PELTOGYNE_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_pin_cherry_sapling"), POTTED_PIN_CHERRY_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_plum_sapling"), POTTED_PLUM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_purfunga_sapling"), POTTED_PURFUNGA_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_sproom_sapling"), POTTED_SPROOM_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_stortreean_sapling"), POTTED_STORTREEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_stroomean_sapling"), POTTED_STROOMEAN_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_sunrise_fungus_sapling"), POTTED_SUNRISE_FUNGUS_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_teak_sapling"), POTTED_TEAK_SAPLING);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_thundercloud_plum_sapling"), POTTED_THUNDERCLOUD_PLUM_SAPLING);

		Registry.register(BLOCK, new Identifier("deep_trenches:potted_blue_poppy"), POTTED_BLUE_POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_blue_violet"), POTTED_BLUE_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_bonnet_spurge"), POTTED_BONNET_SPURGE);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_chocolate_cosmos_flower"), POTTED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_cycawler"), POTTED_CYCAWLER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_garden_pinks"), POTTED_GARDEN_PINKS);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_gyldelion_flower"), POTTED_GYLDELION_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_native_violet"), POTTED_NATIVE_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_opium_poppy"), POTTED_OPIUM_POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_poppy"), POTTED_POPPY);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_pink_braitor_flower"), POTTED_PINK_BRAITOR_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_pink_rose"), POTTED_PINK_ROSE);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_pink_rose_bush"), POTTED_PINK_ROSE_BUSH);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_spike_lavender"), POTTED_SPIKE_LAVENDER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_red_braitor_flower"), POTTED_RED_BRAITOR_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_red_chocolate_cosmos_flower"), POTTED_RED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_red_rose"), POTTED_RED_ROSE);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_sproom_spike"), POTTED_SPROOM_SPIKE);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_sweet_violet"), POTTED_SWEET_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_topped_lavender"), POTTED_TOPPED_LAVENDER);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_vaslame"), POTTED_VASLAME);
		Registry.register(BLOCK, new Identifier("deep_trenches:potted_weepy_hollower"), POTTED_WEEPY_HOLLOWER);

		Registry.register(BLOCK, new Identifier("deep_trenches:giant_violet"), GIANT_VIOLET);
		Registry.register(BLOCK, new Identifier("deep_trenches:giant_violet_leaf"), GIANT_VIOLET_LEAF);
		Registry.register(BLOCK, new Identifier("deep_trenches:giant_violet_petal"), GIANT_VIOLET_PETAL);
		Registry.register(BLOCK, new Identifier("deep_trenches:giant_violet_pistil"), GIANT_VIOLET_PISTIL);
		Registry.register(BLOCK, new Identifier("deep_trenches:giant_violet_steam"), GIANT_VIOLET_STEAM);

		// Miscellaneous Blocks
		Registry.register(BLOCK, new Identifier("deep_trenches:cyan_bioluminescent_block"), CYAN_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:green_bioluminescent_block"), GREEN_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, new Identifier("deep_trenches:light_blue_bioluminescent_block"), LIGHT_BLUE_BIOLUMINESCENT_BLOCK);

		Registry.register(BLOCK, new Identifier("deep_trenches:stasp_nest"), STASP_NEST);

		Registry.register(BLOCK, new Identifier("deep_trenches:dritean"), DRITEAN);
		Registry.register(BLOCK, new Identifier("deep_trenches:gyldelion_block"), GYLDELION_BLOCK);
        Registry.register(BLOCK, new Identifier("deep_trenches:mosoil"), MOSOIL);

        /* -------------------------------- Items ------------------------------------------- */
		Registry.register(ITEM, new Identifier("deep_trenches:adaigger"), ADAIGGER);
		Registry.register(ITEM, new Identifier("deep_trenches:almond"), ALMOND);
		Registry.register(ITEM, new Identifier("deep_trenches:almond_boat"), ALMOND_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:almond_drupe"), ALMOND_DRUPE);
		Registry.register(ITEM, new Identifier("deep_trenches:almond_stick"), ALMOND_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_boat"), ANAMEATA_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_stick"), ANAMEATA_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_boat"), AQUEAN_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_sap"), AQUEAN_SAP);
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_stick"), AQUEAN_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:barbeled_loosejaw"), BARBELED_LOOSEJAW);
		Registry.register(ITEM, new Identifier("deep_trenches:barbeled_loosejaw_bucket"), BARBELED_LOOSEJAW_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:barbeled_loosejaw_spawn_egg"), BARBELED_LOOSEJAW_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_boat"), BARSHROOKLE_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_stick"), BARSHROOKLE_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:betta"), BETTA);
		Registry.register(ITEM, new Identifier("deep_trenches:betta_bucket"), BETTA_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:betta_spawn_egg"), BETTA_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_boat"), BLACK_BIRCH_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_stick"), BLACK_BIRCH_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:black_loosejaw"), BLACK_LOOSEJAW);
		Registry.register(ITEM, new Identifier("deep_trenches:black_loosejaw_bucket"), BLACK_LOOSEJAW_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:black_loosejaw_spawn_egg"), BLACK_LOOSEJAW_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:bottle_of_aquean_sap"), BOTTLE_OF_AQUEAN_SAP);
		Registry.register(ITEM, new Identifier("deep_trenches:cherry"), CHERRY);
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_boat"), CHERRY_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_stick"), CHERRY_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_boat"), COOK_PINE_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_stick"), COOK_PINE_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:cooked_giant_hatchetfish"), COOKED_GIANT_HATCHETFISH);
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_boat"), CROLOOD_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_fruit"), CROLOOD_FRUIT);
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_stick"), CROLOOD_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:cyan_bioluminescent_goo"), CYAN_BIOLUMINESCENT_GOO);
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_boat"), DARK_CROLOOD_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_fruit"), DARK_CROLOOD_FRUIT);
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_stick"), DARK_CROLOOD_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:deep_lake_betta"), DEEP_LAKE_BETTA);
		Registry.register(ITEM, new Identifier("deep_trenches:deep_lake_betta_bucket"), DEEP_LAKE_BETTA_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:deep_lake_betta_spawn_egg"), DEEP_LAKE_BETTA_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_boat"), EBONY_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_stick"), EBONY_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_boat"), FUCHSITRA_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_stick"), FUCHSITRA_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_boat"),  FUNERANITE_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_stick"), FUNERANITE_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_boat"), GHOSHROOM_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_stick"), GHOSHROOM_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:giant_hatchetfish"), GIANT_HATCHETFISH);
		Registry.register(ITEM, new Identifier("deep_trenches:giant_hatchetfish_bucket"), GIANT_HATCHETFISH_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:giant_hatchetfish_spawn_egg"), GIANT_HATCHETFISH_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:green_bioluminescent_goo"), GREEN_BIOLUMINESCENT_GOO);
		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_dye"), GYLDELION_DYE);
		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_ingot"), GYLDELION_INGOT);
		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_nugget"), GYLDELION_NUGGET);
		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_stick"), GYLDELION_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:light_blue_bioluminescent_goo"), LIGHT_BLUE_BIOLUMINESCENT_GOO);
		Registry.register(ITEM, new Identifier("deep_trenches:light_loosejaw"), LIGHT_LOOSEJAW);
		Registry.register(ITEM, new Identifier("deep_trenches:light_loosejaw_bucket"), LIGHT_LOOSEJAW_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:light_loosejaw_spawn_egg"), LIGHT_LOOSEJAW_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:loosejaw_tooth"), LOOSEJAW_TOOTH);
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_boat"), PELTOGYNE_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_stick"), PELTOGYNE_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:persimmon_fruit"), PERSIMMON_FRUIT);
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry"), PIN_CHERRY);
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_boat"), PIN_CHERRY_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_stick"), PIN_CHERRY_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:plum"), PLUM);
		Registry.register(ITEM, new Identifier("deep_trenches:plum_boat"), PLUM_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:plum_stick"), PLUM_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_boat"), PURFUNGA_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_stick"), PURFUNGA_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:smalltooth_dragonfish"), SMALLTOOTH_DRAGONFISH);
		Registry.register(ITEM, new Identifier("deep_trenches:smalltooth_dragonfish_bucket"), SMALLTOOTH_DRAGONFISH_BUCKET);
		Registry.register(ITEM, new Identifier("deep_trenches:smalltooth_dragonfish_spawn_egg"), SMALLTOOTH_DRAGONFISH_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_boat"), SPROOM_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_stick"), SPROOM_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:stasp_spawn_egg"), STASP_SPAWN_EGG);
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_boat"), STORTREEAN_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_stick"), STORTREEAN_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_boat"), STROOMEAN_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_stick"), STROOMEAN_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_boat"), SUNRISE_FUNGUS_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_stick"), SUNRISE_FUNGUS_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:teak_boat"), TEAK_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:teak_stick"), TEAK_STICK);
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum"), THUNDERCLOUD_PLUM);
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_boat"), THUNDERCLOUD_PLUM_BOAT);
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_stick"), THUNDERCLOUD_PLUM_STICK);

		// Coral Items
		Registry.register(ITEM, new Identifier("deep_trenches:dead_blackgreen_tree_coral"), new BlockItem(DEAD_BLACKGREEN_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_blackgreen_tree_coral_block"), new BlockItem(DEAD_BLACKGREEN_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_blackgreen_tree_coral_fan"), new WallStandingBlockItem(DEAD_BLACKGREEN_TREE_CORAL_FAN, DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:blackgreen_tree_coral"), new BlockItem(BLACKGREEN_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:blackgreen_tree_coral_block"), new BlockItem(BLACKGREEN_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:blackgreen_tree_coral_fan"), new WallStandingBlockItem(BLACKGREEN_TREE_CORAL_FAN, BLACKGREEN_TREE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_broccoli_coral"), new BlockItem(DEAD_BROCCOLI_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_broccoli_coral_block"), new BlockItem(DEAD_BROCCOLI_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_broccoli_coral_fan"), new WallStandingBlockItem(DEAD_BROCCOLI_CORAL_FAN, DEAD_BROCCOLI_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:broccoli_coral"), new BlockItem(BROCCOLI_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:broccoli_coral_block"), new BlockItem(BROCCOLI_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:broccoli_coral_fan"), new WallStandingBlockItem(BROCCOLI_CORAL_FAN, BROCCOLI_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_bubblegum_coral"), new BlockItem(DEAD_BUBBLEGUM_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_bubblegum_coral_block"), new BlockItem(DEAD_BUBBLEGUM_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_bubblegum_coral_fan"), new WallStandingBlockItem(DEAD_BUBBLEGUM_CORAL_FAN, DEAD_BUBBLEGUM_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:bubblegum_coral"), new BlockItem(BUBBLEGUM_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:bubblegum_coral_block"), new BlockItem(BUBBLEGUM_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:bubblegum_coral_fan"), new WallStandingBlockItem(BUBBLEGUM_CORAL_FAN, BUBBLEGUM_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_cabbage_tree_coral"), new BlockItem(DEAD_CABBAGE_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_cabbage_tree_coral_block"), new BlockItem(DEAD_CABBAGE_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_cabbage_tree_coral_fan"), new WallStandingBlockItem(DEAD_CABBAGE_TREE_CORAL_FAN, DEAD_CABBAGE_TREE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cabbage_tree_coral"), new BlockItem(CABBAGE_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cabbage_tree_coral_block"), new BlockItem(CABBAGE_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cabbage_tree_coral_fan"), new BlockItem(CABBAGE_TREE_CORAL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_flowertube_coral"), new BlockItem(DEAD_FLOWERTUBE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_flowertube_coral_block"), new BlockItem(DEAD_FLOWERTUBE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_flowertube_coral_fan"), new WallStandingBlockItem(DEAD_FLOWERTUBE_CORAL_FAN, DEAD_FLOWERTUBE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:flowertube_coral"), new BlockItem(FLOWERTUBE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:flowertube_coral_block"), new BlockItem(FLOWERTUBE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:flowertube_coral_fan"), new WallStandingBlockItem(FLOWERTUBE_CORAL_FAN, FLOWERTUBE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_garnet_spiral_coral"), new BlockItem(DEAD_GARNET_SPIRAL_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_garnet_spiral_coral_block"), new BlockItem(DEAD_GARNET_SPIRAL_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_garnet_spiral_coral_fan"), new WallStandingBlockItem(DEAD_GARNET_SPIRAL_CORAL_FAN, DEAD_GARNET_SPIRAL_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:garnet_spiral_coral"), new BlockItem(GARNET_SPIRAL_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:garnet_spiral_coral_block"), new BlockItem(GARNET_SPIRAL_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:garnet_spiral_coral_fan"), new WallStandingBlockItem(GARNET_SPIRAL_CORAL_FAN, GARNET_SPIRAL_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_glow_forest_coral"), new BlockItem(DEAD_GLOW_FOREST_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_glow_forest_coral_block"), new BlockItem(DEAD_GLOW_FOREST_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_glow_forest_coral_fan"), new WallStandingBlockItem(DEAD_GLOW_FOREST_CORAL_FAN, DEAD_GLOW_FOREST_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glow_forest_coral"), new BlockItem(GLOW_FOREST_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glow_forest_coral_block"), new BlockItem(GLOW_FOREST_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glow_forest_coral_fan"), new WallStandingBlockItem(GLOW_FOREST_CORAL_FAN, GLOW_FOREST_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_glowtongue_tube_coral"), new BlockItem(DEAD_GLOWTONGUE_TUBE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_glowtongue_tube_coral_block"), new BlockItem(DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_glowtongue_tube_coral_fan"), new WallStandingBlockItem(DEAD_GLOWTONGUE_TUBE_CORAL_FAN, DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glowtongue_tube_coral"), new BlockItem(GLOWTONGUE_TUBE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glowtongue_tube_coral_block"), new BlockItem(GLOWTONGUE_TUBE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:glowtongue_tube_coral_fan"), new WallStandingBlockItem(GLOWTONGUE_TUBE_CORAL_FAN, GLOWTONGUE_TUBE_CORAL_WALL_FAN,new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_ivory_coral"), new BlockItem(DEAD_IVORY_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_ivory_coral_block"), new BlockItem(DEAD_IVORY_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_ivory_coral_fan"), new WallStandingBlockItem(DEAD_IVORY_CORAL_FAN, DEAD_IVORY_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ivory_coral"), new BlockItem(IVORY_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ivory_coral_block"), new BlockItem(IVORY_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ivory_coral_fan"), new WallStandingBlockItem(IVORY_CORAL_FAN, IVORY_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_lime_brain_coral"), new BlockItem(DEAD_LIME_BRAIN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_lime_brain_coral_block"), new BlockItem(DEAD_LIME_BRAIN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_lime_brain_coral_fan"), new WallStandingBlockItem(DEAD_LIME_BRAIN_CORAL_FAN, DEAD_LIME_BRAIN_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lime_brain_coral"), new BlockItem(LIME_BRAIN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lime_brain_coral_block"), new BlockItem(LIME_BRAIN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lime_brain_coral_fan"), new WallStandingBlockItem(LIME_BRAIN_CORAL_FAN, LIME_BRAIN_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_lophelia_coral"), new BlockItem(DEAD_LOPHELIA_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_lophelia_coral_block"), new BlockItem(DEAD_LOPHELIA_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_lophelia_coral_fan"), new WallStandingBlockItem(DEAD_LOPHELIA_CORAL_FAN, DEAD_LOPHELIA_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lophelia_coral"), new BlockItem(LOPHELIA_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lophelia_coral_block"), new BlockItem(LOPHELIA_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lophelia_coral_fan"), new WallStandingBlockItem(LOPHELIA_CORAL_FAN, LOPHELIA_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_pipe_organ_coral"), new BlockItem(DEAD_PIPE_ORGAN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_pipe_organ_coral_block"), new BlockItem(DEAD_PIPE_ORGAN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_pipe_organ_coral_fan"), new WallStandingBlockItem(DEAD_PIPE_ORGAN_CORAL_FAN, DEAD_PIPE_ORGAN_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_pipe_organ_tentacles"), new BlockItem(DEAD_PIPE_ORGAN_TENTACLES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pipe_organ_coral"), new BlockItem(PIPE_ORGAN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pipe_organ_coral_block"), new BlockItem(PIPE_ORGAN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pipe_organ_coral_fan"), new WallStandingBlockItem(PIPE_ORGAN_CORAL_FAN, PIPE_ORGAN_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pipe_organ_tentacles"), new BlockItem(PIPE_ORGAN_TENTACLES, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_red_tree_coral"), new BlockItem(DEAD_RED_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_red_tree_coral_block"), new BlockItem(DEAD_RED_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_red_tree_coral_fan"), new WallStandingBlockItem(DEAD_RED_TREE_CORAL_FAN, DEAD_RED_TREE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_tree_coral"), new BlockItem(RED_TREE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_tree_coral_block"), new BlockItem(RED_TREE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_tree_coral_fan"), new WallStandingBlockItem(RED_TREE_CORAL_FAN, RED_TREE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_seafan_coral"), new BlockItem(DEAD_SEAFAN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_seafan_coral_block"), new BlockItem(DEAD_SEAFAN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_seafan_coral_fan"), new WallStandingBlockItem(DEAD_SEAFAN_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN,new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:seafan_coral"), new BlockItem(SEAFAN_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:seafan_coral_block"), new BlockItem(SEAFAN_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:seafan_coral_fan"), new WallStandingBlockItem(SEAFAN_CORAL_FAN, SEAFAN_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_straight_willow_coral"), new BlockItem(DEAD_STRAIGHT_WILLOW_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_straight_willow_coral_block"), new BlockItem(DEAD_STRAIGHT_WILLOW_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_straight_willow_coral_fan"), new WallStandingBlockItem(DEAD_STRAIGHT_WILLOW_CORAL_FAN, DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:straight_willow_coral"), new BlockItem(STRAIGHT_WILLOW_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:straight_willow_coral_block"), new BlockItem(STRAIGHT_WILLOW_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:straight_willow_coral_fan"), new WallStandingBlockItem(STRAIGHT_WILLOW_CORAL_FAN, STRAIGHT_WILLOW_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_sunrise_coral"), new BlockItem(DEAD_SUNRISE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_sunrise_coral_block"), new BlockItem(DEAD_SUNRISE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_sunrise_coral_fan"), new WallStandingBlockItem(DEAD_SUNRISE_CORAL_FAN, DEAD_SUNRISE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_coral"), new BlockItem(SUNRISE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_coral_block"), new BlockItem(SUNRISE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_coral_fan"), new WallStandingBlockItem(SUNRISE_CORAL_FAN, SUNRISE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_table_coral"), new BlockItem(DEAD_TABLE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_table_coral_block"), new BlockItem(DEAD_TABLE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_table_coral_fan"), new WallStandingBlockItem(DEAD_TABLE_CORAL_FAN, DEAD_TABLE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:table_coral"), new BlockItem(TABLE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:table_coral_block"), new BlockItem(TABLE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:table_coral_fan"), new WallStandingBlockItem(TABLE_CORAL_FAN, TABLE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_thin_blade_coral"), new BlockItem(DEAD_THIN_BLADE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_thin_blade_coral_block"), new BlockItem(DEAD_THIN_BLADE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_thin_blade_coral_fan"), new WallStandingBlockItem(DEAD_THIN_BLADE_CORAL_FAN, DEAD_THIN_BLADE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thin_blade_coral"), new BlockItem(THIN_BLADE_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thin_blade_coral_block"), new BlockItem(THIN_BLADE_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thin_blade_coral_fan"), new WallStandingBlockItem(THIN_BLADE_CORAL_FAN, THIN_BLADE_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dead_trumpetear_coral"), new BlockItem(DEAD_TRUMPETEAR_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_trumpetear_coral_block"), new BlockItem(DEAD_TRUMPETEAR_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dead_trumpetear_coral_fan"), new WallStandingBlockItem(DEAD_TRUMPETEAR_CORAL_FAN, DEAD_TRUMPETEAR_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:trumpetear_coral"), new BlockItem(TRUMPETEAR_CORAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:trumpetear_coral_block"), new BlockItem(TRUMPETEAR_CORAL_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:trumpetear_coral_fan"), new WallStandingBlockItem(TRUMPETEAR_CORAL_FAN, TRUMPETEAR_CORAL_WALL_FAN, new Item.Settings().group(GENERAL)));

		// Wood Items
		Registry.register(ITEM, new Identifier("deep_trenches:almond_button"), new BlockItem(ALMOND_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_door"), new BlockItem(ALMOND_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_fence"), new BlockItem(ALMOND_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_fence_gate"), new BlockItem(ALMOND_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_leaves"), new BlockItem(ALMOND_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_log"), new BlockItem(ALMOND_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_planks"), new BlockItem(ALMOND_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_pressure_plate"), new BlockItem(ALMOND_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_sapling"), new BlockItem(ALMOND_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), ALMOND_SIGN, ALMOND_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_slab"), new BlockItem(ALMOND_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_stairs"), new BlockItem(ALMOND_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_trapdoor"), new BlockItem(ALMOND_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:almond_wood"), new BlockItem(ALMOND_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:anameata_button"), new BlockItem(ANAMEATA_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_cap"), new BlockItem(ANAMEATA_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_door"), new BlockItem(ANAMEATA_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_fence"), new BlockItem(ANAMEATA_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_fence_gate"), new BlockItem(ANAMEATA_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_log"), new BlockItem(ANAMEATA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_planks"), new BlockItem(ANAMEATA_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_pressure_plate"), new BlockItem(ANAMEATA_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_sapling"), new BlockItem(ANAMEATA_SAPLING, new Item.Settings().group(GENERAL)));
        Registry.register(ITEM, new Identifier("deep_trenches:anameata_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), ANAMEATA_SIGN, ANAMEATA_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_slab"), new BlockItem(ANAMEATA_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_stairs"), new BlockItem(ANAMEATA_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_trapdoor"), new BlockItem(ANAMEATA_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:anameata_wood"), new BlockItem(ANAMEATA_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:aquean_button"), new BlockItem(AQUEAN_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_door"), new BlockItem(AQUEAN_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_fence"), new BlockItem(AQUEAN_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_fence_gate"), new BlockItem(AQUEAN_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_leaves"), new BlockItem(AQUEAN_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_log"), new BlockItem(AQUEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_planks"), new BlockItem(AQUEAN_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_pressure_plate"), new BlockItem(AQUEAN_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_sapling"), new BlockItem(AQUEAN_SAPLING, new Item.Settings().group(GENERAL)));
        Registry.register(ITEM, new Identifier("deep_trenches:aquean_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), AQUEAN_SIGN, AQUEAN_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_slab"), new BlockItem(AQUEAN_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_stairs"), new BlockItem(AQUEAN_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_trapdoor"), new BlockItem(AQUEAN_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:aquean_wood"), new BlockItem(AQUEAN_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_button"), new BlockItem(BARSHROOKLE_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_cap"), new BlockItem(BARSHROOKLE_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_door"), new BlockItem(BARSHROOKLE_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_fence"), new BlockItem(BARSHROOKLE_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_fence_gate"), new BlockItem(BARSHROOKLE_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_log"), new BlockItem(BARSHROOKLE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_planks"), new BlockItem(BARSHROOKLE_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_pressure_plate"), new BlockItem(BARSHROOKLE_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_sapling"), new BlockItem(BARSHROOKLE_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), BARSHROOKLE_SIGN, BARSHROOKLE_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_slab"), new BlockItem(BARSHROOKLE_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_stairs"), new BlockItem(BARSHROOKLE_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_trapdoor"), new BlockItem(BARSHROOKLE_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:barshrookle_wood"), new BlockItem(BARSHROOKLE_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_button"), new BlockItem(BLACK_BIRCH_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_door"), new BlockItem(BLACK_BIRCH_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_fence"), new BlockItem(BLACK_BIRCH_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_fence_gate"), new BlockItem(BLACK_BIRCH_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_leaves"), new BlockItem(BLACK_BIRCH_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_log"), new BlockItem(BLACK_BIRCH_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_planks"), new BlockItem(BLACK_BIRCH_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_pressure_plate"), new BlockItem(BLACK_BIRCH_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_sapling"), new BlockItem(BLACK_BIRCH_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), BLACK_BIRCH_SIGN, BLACK_BIRCH_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_slab"), new BlockItem(BLACK_BIRCH_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_stairs"), new BlockItem(BLACK_BIRCH_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_trapdoor"), new BlockItem(BLACK_BIRCH_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:black_birch_wood"), new BlockItem(BLACK_BIRCH_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:cherry_button"), new BlockItem(CHERRY_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_door"), new BlockItem(CHERRY_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_fence"), new BlockItem(CHERRY_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_fence_gate"), new BlockItem(CHERRY_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_leaves"), new BlockItem(CHERRY_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_log"), new BlockItem(CHERRY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_planks"), new BlockItem(CHERRY_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_pressure_plate"), new BlockItem(CHERRY_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_sapling"), new BlockItem(CHERRY_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), CHERRY_SIGN, CHERRY_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_slab"), new BlockItem(CHERRY_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_stairs"), new BlockItem(CHERRY_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_trapdoor"), new BlockItem(CHERRY_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cherry_wood"), new BlockItem(CHERRY_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_button"), new BlockItem(COOK_PINE_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_door"), new BlockItem(COOK_PINE_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_fence"), new BlockItem(COOK_PINE_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_fence_gate"), new BlockItem(COOK_PINE_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_leaves"), new BlockItem(COOK_PINE_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_log"), new BlockItem(COOK_PINE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_planks"), new BlockItem(COOK_PINE_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_pressure_plate"), new BlockItem(COOK_PINE_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_sapling"), new BlockItem(COOK_PINE_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), COOK_PINE_SIGN, COOK_PINE_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_slab"), new BlockItem(COOK_PINE_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_stairs"), new BlockItem(COOK_PINE_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_trapdoor"), new BlockItem(COOK_PINE_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cook_pine_wood"), new BlockItem(COOK_PINE_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:crolood_button"), new BlockItem(CROLOOD_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_door"), new BlockItem(CROLOOD_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_fence"), new BlockItem(CROLOOD_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_fence_gate"), new BlockItem(CROLOOD_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_leaves"), new BlockItem(CROLOOD_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_log"), new BlockItem(CROLOOD_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_planks"), new BlockItem(CROLOOD_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_pressure_plate"), new BlockItem(CROLOOD_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_sapling"), new BlockItem(CROLOOD_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), CROLOOD_SIGN, CROLOOD_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_slab"), new BlockItem(CROLOOD_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_stairs"), new BlockItem(CROLOOD_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_trapdoor"), new BlockItem(CROLOOD_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:crolood_wood"), new BlockItem(CROLOOD_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_button"), new BlockItem(DARK_CROLOOD_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_door"), new BlockItem(DARK_CROLOOD_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_fence"), new BlockItem(DARK_CROLOOD_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_fence_gate"), new BlockItem(DARK_CROLOOD_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_leaves"), new BlockItem(DARK_CROLOOD_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_log"), new BlockItem(DARK_CROLOOD_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_planks"), new BlockItem(DARK_CROLOOD_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_pressure_plate"), new BlockItem(DARK_CROLOOD_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_sapling"), new BlockItem(DARK_CROLOOD_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), DARK_CROLOOD_SIGN, DARK_CROLOOD_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_slab"), new BlockItem(DARK_CROLOOD_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_stairs"), new BlockItem(DARK_CROLOOD_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_trapdoor"), new BlockItem(DARK_CROLOOD_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:dark_crolood_wood"), new BlockItem(DARK_CROLOOD_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:ebony_button"), new BlockItem(EBONY_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_door"), new BlockItem(EBONY_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_fence"), new BlockItem(EBONY_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_fence_gate"), new BlockItem(EBONY_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_leaves"), new BlockItem(EBONY_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_log"), new BlockItem(EBONY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_planks"), new BlockItem(EBONY_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_pressure_plate"), new BlockItem(EBONY_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_sapling"), new BlockItem(EBONY_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), EBONY_SIGN, EBONY_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_slab"), new BlockItem(EBONY_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_stairs"), new BlockItem(EBONY_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_trapdoor"), new BlockItem(EBONY_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ebony_wood"), new BlockItem(EBONY_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_button"), new BlockItem(FUCHSITRA_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_door"), new BlockItem(FUCHSITRA_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_fence"), new BlockItem(FUCHSITRA_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_fence_gate"), new BlockItem(FUCHSITRA_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_leaves"), new BlockItem(FUCHSITRA_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_log"), new BlockItem(FUCHSITRA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_planks"), new BlockItem(FUCHSITRA_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_pressure_plate"), new BlockItem(FUCHSITRA_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_sapling"), new BlockItem(FUCHSITRA_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), FUCHSITRA_SIGN, FUCHSITRA_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_slab"), new BlockItem(FUCHSITRA_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_stairs"), new BlockItem(FUCHSITRA_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_trapdoor"), new BlockItem(FUCHSITRA_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:fuchsitra_wood"), new BlockItem(FUCHSITRA_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_button"), new BlockItem(FUNERANITE_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_cap"), new BlockItem(FUNERANITE_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_door"), new BlockItem(FUNERANITE_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_fence"), new BlockItem(FUNERANITE_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_fence_gate"), new BlockItem(FUNERANITE_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_log"), new BlockItem(FUNERANITE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_planks"), new BlockItem(FUNERANITE_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_pressure_plate"), new BlockItem(FUNERANITE_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_sapling"), new BlockItem(FUNERANITE_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), FUNERANITE_SIGN, FUNERANITE_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_slab"), new BlockItem(FUNERANITE_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_stairs"), new BlockItem(FUNERANITE_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_trapdoor"), new BlockItem(FUNERANITE_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:funeranite_wood"), new BlockItem(FUNERANITE_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_button"), new BlockItem(GHOSHROOM_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_cap"), new BlockItem(GHOSHROOM_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_door"), new BlockItem(GHOSHROOM_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_fence"), new BlockItem(GHOSHROOM_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_fence_gate"), new BlockItem(GHOSHROOM_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_log"), new BlockItem(GHOSHROOM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_planks"), new BlockItem(GHOSHROOM_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_pressure_plate"), new BlockItem(GHOSHROOM_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_sapling"), new BlockItem(GHOSHROOM_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), GHOSHROOM_SIGN, GHOSHROOM_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_slab"), new BlockItem(GHOSHROOM_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_stairs"), new BlockItem(GHOSHROOM_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_trapdoor"), new BlockItem(GHOSHROOM_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:ghoshroom_wood"), new BlockItem(GHOSHROOM_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_button"), new BlockItem(PELTOGYNE_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_door"), new BlockItem(PELTOGYNE_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_fence"), new BlockItem(PELTOGYNE_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_fence_gate"), new BlockItem(PELTOGYNE_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_leaves"), new BlockItem(PELTOGYNE_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_log"), new BlockItem(PELTOGYNE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_planks"), new BlockItem(PELTOGYNE_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_pressure_plate"), new BlockItem(PELTOGYNE_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_sapling"), new BlockItem(PELTOGYNE_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), PELTOGYNE_SIGN, PELTOGYNE_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_slab"), new BlockItem(PELTOGYNE_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_stairs"), new BlockItem(PELTOGYNE_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_trapdoor"), new BlockItem(PELTOGYNE_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:peltogyne_wood"), new BlockItem(PELTOGYNE_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_button"), new BlockItem(PIN_CHERRY_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_door"), new BlockItem(PIN_CHERRY_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_fence"), new BlockItem(PIN_CHERRY_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_fence_gate"), new BlockItem(PIN_CHERRY_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_leaves"), new BlockItem(PIN_CHERRY_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_log"), new BlockItem(PIN_CHERRY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_planks"), new BlockItem(PIN_CHERRY_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_pressure_plate"), new BlockItem(PIN_CHERRY_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_sapling"), new BlockItem(PIN_CHERRY_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), PIN_CHERRY_SIGN, PIN_CHERRY_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_slab"), new BlockItem(PIN_CHERRY_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_stairs"), new BlockItem(PIN_CHERRY_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_trapdoor"), new BlockItem(PIN_CHERRY_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pin_cherry_wood"), new BlockItem(PIN_CHERRY_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:plum_button"), new BlockItem(PLUM_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_door"), new BlockItem(PLUM_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_fence"), new BlockItem(PLUM_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_fence_gate"), new BlockItem(PLUM_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_leaves"), new BlockItem(PLUM_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_log"), new BlockItem(PLUM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_planks"), new BlockItem(PLUM_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_pressure_plate"), new BlockItem(PLUM_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_sapling"), new BlockItem(PLUM_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), PLUM_SIGN, PLUM_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_slab"), new BlockItem(PLUM_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_stairs"), new BlockItem(PLUM_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_trapdoor"), new BlockItem(PLUM_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:plum_wood"), new BlockItem(PLUM_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_button"), new BlockItem(PURFUNGA_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_cap"), new BlockItem(PURFUNGA_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_door"), new BlockItem(PURFUNGA_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_fence"), new BlockItem(PURFUNGA_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_fence_gate"), new BlockItem(PURFUNGA_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_log"), new BlockItem(PURFUNGA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_planks"), new BlockItem(PURFUNGA_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_pressure_plate"), new BlockItem(PURFUNGA_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_sapling"), new BlockItem(PURFUNGA_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), PURFUNGA_SIGN, PURFUNGA_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_slab"), new BlockItem(PURFUNGA_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_stairs"), new BlockItem(PURFUNGA_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_trapdoor"), new BlockItem(PURFUNGA_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purfunga_wood"), new BlockItem(PURFUNGA_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:sproom_button"), new BlockItem(SPROOM_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_door"), new BlockItem(SPROOM_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_fence"), new BlockItem(SPROOM_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_fence_gate"), new BlockItem(SPROOM_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_leaves"), new BlockItem(SPROOM_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_log"), new BlockItem(SPROOM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_planks"), new BlockItem(SPROOM_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_pressure_plate"), new BlockItem(SPROOM_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_sapling"), new BlockItem(SPROOM_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), SPROOM_SIGN, SPROOM_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_slab"), new BlockItem(SPROOM_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_stairs"), new BlockItem(SPROOM_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_trapdoor"), new BlockItem(SPROOM_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_wood"), new BlockItem(SPROOM_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:stasp_nest"), new BlockItem(STASP_NEST, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_button"), new BlockItem(STORTREEAN_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_door"), new BlockItem(STORTREEAN_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_fence"), new BlockItem(STORTREEAN_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_fence_gate"), new BlockItem(STORTREEAN_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_leaves"), new BlockItem(STORTREEAN_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_log"), new BlockItem(STORTREEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_planks"), new BlockItem(STORTREEAN_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_pressure_plate"), new BlockItem(STORTREEAN_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_sapling"), new BlockItem(STORTREEAN_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), STORTREEAN_SIGN, STORTREEAN_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_slab"), new BlockItem(STORTREEAN_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_stairs"), new BlockItem(STORTREEAN_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_trapdoor"), new BlockItem(STORTREEAN_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stortreean_wood"), new BlockItem(STORTREEAN_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:stripped_almond_log"), new BlockItem(STRIPPED_ALMOND_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_almond_wood"), new BlockItem(STRIPPED_ALMOND_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_anameata_log"), new BlockItem(STRIPPED_ANAMEATA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_anameata_wood"), new BlockItem(STRIPPED_ANAMEATA_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_aquean_log"), new BlockItem(STRIPPED_AQUEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_aquean_wood"), new BlockItem(STRIPPED_AQUEAN_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_barshrookle_log"), new BlockItem(STRIPPED_BARSHROOKLE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_barshrookle_wood"), new BlockItem(STRIPPED_BARSHROOKLE_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_black_birch_log"), new BlockItem(STRIPPED_BLACK_BIRCH_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_black_birch_wood"), new BlockItem(STRIPPED_BLACK_BIRCH_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_cherry_log"), new BlockItem(STRIPPED_CHERRY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_cherry_wood"), new BlockItem(STRIPPED_CHERRY_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_cook_pine_log"), new BlockItem(STRIPPED_COOK_PINE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_cook_pine_wood"), new BlockItem(STRIPPED_COOK_PINE_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_crolood_log"), new BlockItem(STRIPPED_CROLOOD_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_crolood_wood"), new BlockItem(STRIPPED_CROLOOD_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_dark_crolood_log"), new BlockItem(STRIPPED_DARK_CROLOOD_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_dark_crolood_wood"), new BlockItem(STRIPPED_DARK_CROLOOD_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_ebony_log"), new BlockItem(STRIPPED_EBONY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_ebony_wood"), new BlockItem(STRIPPED_EBONY_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_fuchsitra_log"), new BlockItem(STRIPPED_FUCHSITRA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_fuchsitra_wood"), new BlockItem(STRIPPED_FUCHSITRA_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_funeranite_log"), new BlockItem(STRIPPED_FUNERANITE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_funeranite_wood"), new BlockItem(STRIPPED_FUNERANITE_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_ghoshroom_log"), new BlockItem(STRIPPED_GHOSHROOM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_ghoshroom_wood"), new BlockItem(STRIPPED_GHOSHROOM_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_peltogyne_log"), new BlockItem(STRIPPED_PELTOGYNE_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_peltogyne_wood"), new BlockItem(STRIPPED_PELTOGYNE_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_pin_cherry_log"), new BlockItem(STRIPPED_PIN_CHERRY_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_pin_cherry_wood"), new BlockItem(STRIPPED_PIN_CHERRY_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_plum_log"), new BlockItem(STRIPPED_PLUM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_plum_wood"), new BlockItem(STRIPPED_PLUM_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_purfunga_log"), new BlockItem(STRIPPED_PURFUNGA_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_purfunga_wood"), new BlockItem(STRIPPED_PURFUNGA_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_sproom_log"), new BlockItem(STRIPPED_SPROOM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_sproom_wood"), new BlockItem(STRIPPED_SPROOM_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_stortreean_log"), new BlockItem(STRIPPED_STORTREEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_stortreean_wood"), new BlockItem(STRIPPED_STORTREEAN_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_stroomean_log"), new BlockItem(STRIPPED_STROOMEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_stroomean_wood"), new BlockItem(STRIPPED_STROOMEAN_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_sunrise_fungus_log"), new BlockItem(STRIPPED_SUNRISE_FUNGUS_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_sunrise_fungus_wood"), new BlockItem(STRIPPED_SUNRISE_FUNGUS_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_teak_log"), new BlockItem(STRIPPED_TEAK_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_teak_wood"), new BlockItem(STRIPPED_TEAK_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_thundercloud_plum_log"), new BlockItem(STRIPPED_THUNDERCLOUD_PLUM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stripped_thundercloud_plum_wood"), new BlockItem(STRIPPED_THUNDERCLOUD_PLUM_WOOD, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_button"), new BlockItem(STROOMEAN_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_cap"), new BlockItem(STROOMEAN_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_door"), new BlockItem(STROOMEAN_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_fence"), new BlockItem(STROOMEAN_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_fence_gate"), new BlockItem(STROOMEAN_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_log"), new BlockItem(STROOMEAN_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_planks"), new BlockItem(STROOMEAN_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_pressure_plate"), new BlockItem(STROOMEAN_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_sapling"), new BlockItem(STROOMEAN_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_sign"), new BlockItem(STROOMEAN_SIGN, new Item.Settings().group(GENERAL).maxCount(16)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_slab"), new BlockItem(STROOMEAN_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_stairs"), new BlockItem(STROOMEAN_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_trapdoor"), new BlockItem(STROOMEAN_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:stroomean_wood"), new BlockItem(STROOMEAN_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_button"), new BlockItem(SUNRISE_FUNGUS_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_cap"), new BlockItem(SUNRISE_FUNGUS_CAP, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_door"), new BlockItem(SUNRISE_FUNGUS_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_fence"), new BlockItem(SUNRISE_FUNGUS_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_fence_gate"), new BlockItem(SUNRISE_FUNGUS_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_log"), new BlockItem(SUNRISE_FUNGUS_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_planks"), new BlockItem(SUNRISE_FUNGUS_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_pressure_plate"), new BlockItem(SUNRISE_FUNGUS_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_sapling"), new BlockItem(SUNRISE_FUNGUS_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), SUNRISE_FUNGUS_SIGN, SUNRISE_FUNGUS_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_slab"), new BlockItem(SUNRISE_FUNGUS_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_stairs"), new BlockItem(SUNRISE_FUNGUS_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_trapdoor"), new BlockItem(SUNRISE_FUNGUS_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sunrise_fungus_wood"), new BlockItem(SUNRISE_FUNGUS_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:teak_button"), new BlockItem(TEAK_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_door"), new BlockItem(TEAK_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_fence"), new BlockItem(TEAK_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_fence_gate"), new BlockItem(TEAK_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_leaves"), new BlockItem(TEAK_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_log"), new BlockItem(TEAK_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_planks"), new BlockItem(TEAK_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_pressure_plate"), new BlockItem(TEAK_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_sapling"), new BlockItem(TEAK_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), TEAK_SIGN, TEAK_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_slab"), new BlockItem(TEAK_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_stairs"), new BlockItem(TEAK_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_trapdoor"), new BlockItem(TEAK_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:teak_wood"), new BlockItem(TEAK_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_button"), new BlockItem(THUNDERCLOUD_PLUM_BUTTON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_door"), new BlockItem(THUNDERCLOUD_PLUM_DOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_fence"), new BlockItem(THUNDERCLOUD_PLUM_FENCE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_fence_gate"), new BlockItem(THUNDERCLOUD_PLUM_FENCE_GATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_leaves"), new BlockItem(THUNDERCLOUD_PLUM_LEAVES, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_log"), new BlockItem(THUNDERCLOUD_PLUM_LOG, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_planks"), new BlockItem(THUNDERCLOUD_PLUM_PLANKS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_pressure_plate"), new BlockItem(THUNDERCLOUD_PLUM_PRESSURE_PLATE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_sapling"), new BlockItem(THUNDERCLOUD_PLUM_SAPLING, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_sign"), new SignItem(new Item.Settings().group(GENERAL).maxCount(16), THUNDERCLOUD_PLUM_SIGN, THUNDERCLOUD_PLUM_WALL_SIGN));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_slab"), new BlockItem(THUNDERCLOUD_PLUM_SLAB, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_stairs"), new BlockItem(THUNDERCLOUD_PLUM_STAIRS, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_trapdoor"), new BlockItem(THUNDERCLOUD_PLUM_TRAPDOOR, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:thundercloud_plum_wood"), new BlockItem(THUNDERCLOUD_PLUM_WOOD, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:giant_violet"), new BlockItem(GIANT_VIOLET, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:giant_violet_leaf"), new BlockItem(GIANT_VIOLET_LEAF, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:giant_violet_petal"), new BlockItem(GIANT_VIOLET_PETAL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:giant_violet_pistil"), new BlockItem(GIANT_VIOLET_PISTIL, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:giant_violet_steam"), new BlockItem(GIANT_VIOLET_STEAM, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:cyan_bioluminescent_block"), new BlockItem(CYAN_BIOLUMINESCENT_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:green_bioluminescent_block"), new BlockItem(GREEN_BIOLUMINESCENT_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:light_blue_bioluminescent_block"), new BlockItem(LIGHT_BLUE_BIOLUMINESCENT_BLOCK, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:dritean"), new BlockItem(DRITEAN, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_block"), new BlockItem(GYLDELION_BLOCK, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:mosoil"), new BlockItem(MOSOIL, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:black_lily"), new BlockItem(BLACK_LILY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:blue_poppy"), new BlockItem(BLUE_POPPY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:blue_violet"), new BlockItem(BLUE_VIOLET, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:bonnet_spurge"), new BlockItem(BONNET_SPURGE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:bullthorn"), new BlockItem(BULLTHORN, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:chocolate_cosmos_flower"), new BlockItem(CHOCOLATE_COSMOS_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:cycawler"), new BlockItem(CYCAWLER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:garden_pinks"), new BlockItem(GARDEN_PINKS, new Item.Settings().group(GENERAL)));

		Registry.register(ITEM, new Identifier("deep_trenches:gyldelion_flower"), new BlockItem(GYLDELION_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lime_spurge"), new BlockItem(LIME_SPURGE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:lupin_flower"), new BlockItem(LUPIN_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:native_violet"), new BlockItem(NATIVE_VIOLET, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:opium_poppy"), new BlockItem(OPIUM_POPPY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:orange_lily"), new BlockItem(ORANGE_LILY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pink_braitor_flower"), new BlockItem(PINK_BRAITOR_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pink_rose"), new BlockItem(PINK_ROSE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:pink_rose_bush"), new BlockItem(PINK_ROSE_BUSH, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:poppy"), new BlockItem(POPPY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:purpround"), new BlockItem(PURPROUND, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_braitor_flower"), new BlockItem(RED_BRAITOR_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_chocolate_cosmos_flower"), new BlockItem(RED_CHOCOLATE_COSMOS_FLOWER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:red_rose"), new BlockItem(RED_ROSE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:reebloon"), new BlockItem(REEBLOON, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:spike_lavender"), new BlockItem(SPIKE_LAVENDER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sprinly"), new BlockItem(SPRINLY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sproom_spike"), new BlockItem(SPROOM_SPIKE, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:sweet_violet"), new BlockItem(SWEET_VIOLET, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:topped_lavender"), new BlockItem(TOPPED_LAVENDER, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:vaslame"), new BlockItem(VASLAME, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:velvet_lily"), new BlockItem(VELVET_LILY, new Item.Settings().group(GENERAL)));
		Registry.register(ITEM, new Identifier("deep_trenches:weepy_hollower"), new BlockItem(WEEPY_HOLLOWER, new Item.Settings().group(GENERAL)));

		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:sign"), BlockEntityTypes.SIGN);
		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:stasp_nest"), BlockEntityTypes.STASP_NEST);
	}
    
}
