package com.foodcoloring;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(FoodColoringConfig.GROUP)
public interface FoodColoringConfig extends Config
{
	String GROUP = "foodcoloring";

	@ConfigSection(
		name = "Fish",
		description = "Recolorable fish.",
		position = 0,
		closedByDefault = false
	)
	String fishSection = "fish";

	@ConfigSection(
		name = "Hunter meat",
		description = "Recolorable hunter meats.",
		position = 1,
		closedByDefault = false
	)
	String hunterMeatSection = "Hunter meat";

	@ConfigSection(
		name = "Other",
		description = "Other recolorable item options.",
		position = 2,
		closedByDefault = false
	)
	String otherSection = "other";

	//=== Fish Section ===

	@ConfigItem(
			position = 0,
			keyName = "recolorGiantKrill",
			name = "Giant Krill",
			description = "Recoloring of cooked giant krill.",
			section = fishSection
	)
	default boolean recolorGiantKrill()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "recolorHaddock",
			name = "Haddock",
			description = "Recoloring of cooked haddock.",
			section = fishSection
	)
	default boolean recolorHaddock()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "recolorYellowfin",
			name = "Yellowfin",
			description = "Recoloring of cooked yellowfin.",
			section = fishSection
	)
	default boolean recolorYellowfin()
	{
		return true;
	}
/*
	@ConfigItem(
			position = 3,
			keyName = "recolorHalibut",
			name = "Halibut",
			description = "Recoloring of cooked halibut.",
			section = fishSection
	)
	default boolean recolorHalibut()
	{
		return true;
	}
*/
	@ConfigItem(
			position = 4,
			keyName = "recolorBluefin",
			name = "Bluefin",
			description = "Recoloring of cooked bluefin.",
			section = fishSection
	)
	default boolean recolorBluefin()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "recolorRawMarlin",
			name = "Raw Marlin",
			description = "Recoloring of raw marlin that adds a yellow stripe.",
			section = fishSection
	)
	default boolean recolorRawMarlin()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "recolorMarlin",
			name = "Marlin",
			description = "Recoloring of cooked marlin.",
			section = fishSection
	)
	default boolean recolorMarlin()
	{
		return true;
	}

/*	@ConfigItem(
			position = 7,
			keyName = "recolorSwordtipSquid",
			name = "Swordtip Squid",
			description = "Recoloring of cooked swordtip squid.",
			section = fishSection
	)
	default boolean recolorSwordtipSquid()
	{
		return true;
	}

	@ConfigItem(
			position = 8,
			keyName = "recolorJumboSquid",
			name = "Jumbo Squid",
			description = "Recoloring of cooked jumbo squid.",
			section = fishSection
	)
	default boolean recolorJumboSquid()
	{
		return true;
	}*/

	@ConfigItem(
			position = 9,
			keyName = "recolorHalibut",
			name = "Halibut",
			description = "Recoloring of cooked halibut, with multiple choices.",
			section = fishSection
	)
	default HalibutType recolorHalibut()
	{
		return HalibutType.LIGHT;
	}

	//=== Hunter Meats Section ===

	@ConfigItem(
			position = 0,
			keyName = "recolorWildKebbit",
			name = "Wild Kebbit",
			description = "Recoloring of cooked wild kebbit.",
			section = hunterMeatSection
	)
	default boolean recolorWildKebbit()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "recolorLarupia",
			name = "Larupia",
			description = "Recoloring of cooked larupia meat.",
			section = hunterMeatSection
	)
	default boolean recolorLarupia()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "recolorBarbed",
			name = "Barb-Tailed Kebbit",
			description = "Recoloring of cooked barb-tailed kebbit meat.",
			section = hunterMeatSection
	)
	default boolean recolorBarbed()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "recolorGraahk",
			name = "Graahk",
			description = "Recoloring of cooked graahk meat.",
			section = hunterMeatSection
	)
	default boolean recolorGraahk()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "recolorKyatt",
			name = "Kyatt",
			description = "Recoloring of cooked Kyatt meat.",
			section = hunterMeatSection
	)
	default boolean recolorKyatt()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "recolorPyreFox",
			name = "Pyre Fox",
			description = "Recoloring of cooked pyre fox meat.",
			section = hunterMeatSection
	)
	default boolean recolorPyreFox()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "recolorSunlightAntelope",
			name = "Sunlight Antelope",
			description = "Recoloring of cooked sunlight antelope meat.",
			section = hunterMeatSection
	)
	default boolean recolorSunlightAntelope()
	{
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "recolorDashingKebbit",
			name = "Dashing Kebbit",
			description = "Recoloring of cooked dashing kebbit meat.",
			section = hunterMeatSection
	)
	default boolean recolorDashingKebbit()
	{
		return true;
	}

	@ConfigItem(
			position = 8,
			keyName = "recolorMoonlightAntelope",
			name = "Moonlight Antelope",
			description = "Recoloring of cooked moonlight antelope meat.",
			section = hunterMeatSection
	)
	default boolean recolorMoonlightAntelope()
	{
		return true;
	}

	//=== Other Section ===

	@ConfigItem(
			position = 0,
			keyName = "recolorSunlightMothMix",
			name = "Sunlight Moth Mix",
			description = "Recolors sunlight moth mix to show a sunlight moth.",
			section = otherSection
	)
	default boolean recolorSunlightMothMix()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "recolorMoonlightMothMix",
			name = "Moonlight Moth Mix",
			description = "Recolors moonlight moth mix to show a moonlight moth.",
			section = otherSection
	)
	default boolean recolorMoonlightMothMix()
	{
		return true;
	}

}
