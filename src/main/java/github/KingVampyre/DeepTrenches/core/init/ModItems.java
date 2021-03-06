package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.item.ModBoatItem;
import github.KingVampyre.DeepTrenches.common.item.TagFishBucketItem;
import github.KingVampyre.DeepTrenches.common.item.TagSpawnEggItem;
import github.KingVampyre.DeepTrenches.core.item.AdaiggerItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

import static github.KingVampyre.DeepTrenches.core.init.ItemGroups.GENERAL;
import static github.KingVampyre.DeepTrenches.core.init.ModFoodComponents.STORCEAN_FISH;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.item.FoodComponents.APPLE;
import static net.minecraft.item.FoodComponents.SWEET_BERRIES;

public class ModItems {

	public static final Item BARBELED_LOOSEJAW_BUCKET = new TagFishBucketItem(EntityTypes.ATLANTIC_BARBELED_LOOSEJAW, EntityTypeTags.BARBELED_LOOSEJAW, WATER,  new Settings().maxCount(1).group(GENERAL));
	public static final Item BETTA_BUCKET = new TagFishBucketItem(EntityTypes.BLUE_BETTA, EntityTypeTags.SPLENDIDENS_BETTA, WATER, new Settings().maxCount(1).group(GENERAL));
	public static final Item BLACK_LOOSEJAW_BUCKET = new TagFishBucketItem(EntityTypes.NORTHERN_BLACK_LOOSEJAW, EntityTypeTags.BLACK_LOOSEJAW, WATER, new Settings().maxCount(1).group(GENERAL));
	public static final Item DEEP_LAKE_BETTA_BUCKET = new TagFishBucketItem(EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA, WATER, new Settings().maxCount(1).group(GENERAL));
	public static final Item GIANT_HATCHETFISH_BUCKET = new TagFishBucketItem(EntityTypes.GIANT_HATCHETFISH,  EntityTypeTags.ARGYROPELECUS_GIGAS, WATER, new Settings().maxCount(1).group(GENERAL));
	public static final Item LIGHT_LOOSEJAW_BUCKET = new TagFishBucketItem(EntityTypes.BIGLAMP_LIGHT_LOOSEJAW, EntityTypeTags.LIGHT_LOOSEJAW, WATER, new Settings().maxCount(1).group(GENERAL));
	public static final Item SMALLTOOTH_DRAGONFISH_BUCKET = new TagFishBucketItem(EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON, WATER, new Settings().maxCount(1).group(GENERAL));

	public static final Item BARBELED_LOOSEJAW_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.ATLANTIC_BARBELED_LOOSEJAW, EntityTypeTags.BARBELED_LOOSEJAW, 921113, 15859744, new Settings().maxCount(1).group(GENERAL));
	public static final Item BETTA_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.BLUE_BETTA, EntityTypeTags.SPLENDIDENS_BETTA, 7347502, 9183521, new Settings().maxCount(1).group(GENERAL));
	public static final Item BLACK_LOOSEJAW_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.NORTHERN_BLACK_LOOSEJAW, EntityTypeTags.BLACK_LOOSEJAW,2102566, 11010053, new Settings().maxCount(1).group(GENERAL));
	public static final Item DEEP_LAKE_BETTA_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319, new Settings().maxCount(1).group(GENERAL));
	public static final Item GIANT_HATCHETFISH_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.GIANT_HATCHETFISH, EntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039, new Settings().maxCount(1).group(GENERAL));
	public static final Item LIGHT_LOOSEJAW_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.BIGLAMP_LIGHT_LOOSEJAW, EntityTypeTags.LIGHT_LOOSEJAW, 1643048, 4836351, new Settings().maxCount(1).group(GENERAL));
	public static final Item SMALLTOOTH_DRAGONFISH_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832, new Settings().maxCount(1).group(GENERAL));
	public static final Item STASP_SPAWN_EGG = new TagSpawnEggItem(EntityTypes.ORANGE_WINGED_STASP, EntityTypeTags.STASPS, 2695792, 5124510, new Settings().maxCount(1).group(GENERAL));

	public static final Item ADAIGGER = new AdaiggerItem(new Settings().group(GENERAL));
	public static final Item ALMOND = new Item(new Settings().group(GENERAL).food(SWEET_BERRIES));
	public static final Item ALMOND_BOAT = new ModBoatItem(WoodType.ALMOND, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item ALMOND_DRUPE = new Item(new Settings().group(GENERAL).food(SWEET_BERRIES));
	public static final Item ALMOND_STICK = new Item(new Settings().group(GENERAL));
	public static final Item ANAMEATA_BOAT = new ModBoatItem(WoodType.ANAMEATA, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item ANAMEATA_STICK = new Item(new Settings().group(GENERAL));
	public static final Item AQUEAN_BOAT = new ModBoatItem(WoodType.AQUEAN, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item AQUEAN_SAP = new Item(new Settings().group(GENERAL));
	public static final Item AQUEAN_STICK = new Item(new Settings().group(GENERAL));
	public static final Item BARBELED_LOOSEJAW = new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item BARSHROOKLE_BOAT = new ModBoatItem(WoodType.BARSHROOKLE, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item BARSHROOKLE_STICK = new Item(new Settings().group(GENERAL));
	public static final Item BETTA = new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item BLACK_BIRCH_BOAT = new ModBoatItem(WoodType.BLACK_BIRCH, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item BLACK_BIRCH_STICK = new Item(new Settings().group(GENERAL));
	public static final Item BLACK_LOOSEJAW = new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item BOTTLE_OF_AQUEAN_SAP = new Item(new Settings().group(GENERAL));
	public static final Item CHERRY = new Item(new Settings().group(GENERAL).food(SWEET_BERRIES));
	public static final Item CHERRY_BOAT = new ModBoatItem(WoodType.CHERRY, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item CHERRY_STICK = new Item(new Settings().group(GENERAL));
	public static final Item COOK_PINE_BOAT = new ModBoatItem(WoodType.COOK_PINE, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item COOK_PINE_STICK = new Item(new Settings().group(GENERAL));
	public static final Item COOKED_GIANT_HATCHETFISH = new Item(new Settings().group(GENERAL).food(ModFoodComponents.COOKED_GIANT_HATCHETFISH));
	public static final Item CROLOOD_BOAT = new ModBoatItem(WoodType.CROLOOD, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item CROLOOD_FRUIT = new Item(new Settings().group(GENERAL).food(APPLE));
	public static final Item CROLOOD_STICK = new Item(new Settings().group(GENERAL));
	public static final Item CYAN_BIOLUMINESCENT_GOO = new Item(new Settings().group(GENERAL));
	public static final Item DARK_CROLOOD_BOAT = new ModBoatItem(WoodType.DARK_CROLOOD, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item DARK_CROLOOD_FRUIT = new Item(new Settings().group(GENERAL).food(APPLE));
	public static final Item DARK_CROLOOD_STICK = new Item(new Settings().group(GENERAL));
	public static final Item DEEP_LAKE_BETTA = new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item EBONY_BOAT = new ModBoatItem(WoodType.EBONY, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item EBONY_STICK = new Item(new Settings().group(GENERAL));
	public static final Item FUCHSITRA_BOAT = new ModBoatItem(WoodType.FUCHSITRA, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item FUCHSITRA_STICK = new Item(new Settings().group(GENERAL));
	public static final Item FUNERANITE_BOAT = new ModBoatItem(WoodType.THUNDERCLOUD_PLUM, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item FUNERANITE_STICK = new Item(new Settings().group(GENERAL));
	public static final Item GHOSHROOM_BOAT = new ModBoatItem(WoodType.GHOSHROOM, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item GHOSHROOM_STICK = new Item(new Settings().group(GENERAL));
	public static final Item GIANT_HATCHETFISH = new Item(new Settings().group(GENERAL).food(ModFoodComponents.GIANT_HATCHETFISH));

	public static final Item GREEN_BIOLUMINESCENT_GOO = new Item(new Settings().group(GENERAL));
	public static final Item GYLDELION_DYE = new Item(new Settings().group(GENERAL));
	public static final Item GYLDELION_INGOT = new Item(new Settings().group(GENERAL));
	public static final Item GYLDELION_NUGGET = new Item(new Settings().group(GENERAL));
	public static final Item GYLDELION_STICK = new Item(new Settings().group(GENERAL));
	public static final Item LIGHT_BLUE_BIOLUMINESCENT_GOO = new Item(new Settings().group(GENERAL));
	public static final Item LIGHT_LOOSEJAW = new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item LOOSEJAW_TOOTH = new Item(new Settings().group(GENERAL));
	public static final Item PELTOGYNE_BOAT = new ModBoatItem(WoodType.PELTOGYNE, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item PELTOGYNE_STICK = new Item(new Settings().group(GENERAL));
	public static final Item PERSIMMON_FRUIT = new Item(new Settings().group(GENERAL).food(APPLE));
	public static final Item PIN_CHERRY = new Item(new Settings().group(GENERAL).food(SWEET_BERRIES));
	public static final Item PIN_CHERRY_BOAT = new ModBoatItem(WoodType.PIN_CHERRY, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item PIN_CHERRY_STICK = new Item(new Settings().group(GENERAL));
	public static final Item PLUM = new Item(new Settings().group(GENERAL).food(APPLE));
	public static final Item PLUM_BOAT = new ModBoatItem(WoodType.PLUM, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item PLUM_STICK = new Item(new Settings().group(GENERAL));
	public static final Item PURFUNGA_BOAT = new ModBoatItem(WoodType.PURFUNGA, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item PURFUNGA_STICK = new Item(new Settings().group(GENERAL));
	public static final Item SMALLTOOTH_DRAGONFISH =  new Item(new Settings().group(GENERAL).food(STORCEAN_FISH));

	public static final Item SPROOM_BOAT = new ModBoatItem(WoodType.SPROOM, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item SPROOM_STICK = new Item(new Settings().group(GENERAL));
	public static final Item STORTREEAN_BOAT = new ModBoatItem(WoodType.STORTREEAN, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item STORTREEAN_STICK = new Item(new Settings().group(GENERAL));
	public static final Item STROOMEAN_BOAT = new ModBoatItem(WoodType.STROOMEAN, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item STROOMEAN_STICK = new Item(new Settings().group(GENERAL));
	public static final Item SUNRISE_FUNGUS_BOAT = new ModBoatItem(WoodType.SUNRISE_FUNGUS, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item SUNRISE_FUNGUS_STICK = new Item(new Settings().group(GENERAL));
	public static final Item TEAK_BOAT = new ModBoatItem(WoodType.TEAK, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item TEAK_STICK = new Item(new Settings().group(GENERAL));
	public static final Item THUNDERCLOUD_PLUM = new Item(new Settings().group(GENERAL).food(APPLE));
	public static final Item THUNDERCLOUD_PLUM_BOAT = new ModBoatItem(WoodType.THUNDERCLOUD_PLUM, new Item.Settings().maxCount(1).group(GENERAL));
	public static final Item THUNDERCLOUD_PLUM_STICK = new Item(new Settings().group(GENERAL));
	
}
