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

/*	@ConfigSection(
		name = "Other",
		description = "Other recolorable item options.",
		position = 2,
		closedByDefault = false
	)
	String otherSection = "other";*/

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

/*
	@ConfigItem(
		position = 9,
		keyName = "recolorRawGiantKrill",
		name = "Raw Giant Krill",
		description = "Recoloring of raw giant krill.",
		section = fishSection
	)
	default boolean recolorRawGiantKrill()
	{
		return true;
	}

	@ConfigItem(
			position = 10,
			keyName = "recolorRawHaddock",
			name = "Raw Haddock",
			description = "Recoloring of raw haddock.",
			section = fishSection
	)
	default boolean recolorRawHaddock()
	{
		return true;
	}

	@ConfigItem(
			position = 11,
			keyName = "recolorRawYellowfin",
			name = "Raw Yellowfin",
			description = "Recoloring of raw yellowfin.",
			section = fishSection
	)
	default boolean recolorRawYellowfin()
	{
		return true;
	}

	@ConfigItem(
			position = 12,
			keyName = "recolorRawHalibut",
			name = "Raw Halibut",
			description = "Recoloring of raw halibut.",
			section = fishSection
	)
	default boolean recolorRawHalibut()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "recolorRawBluefin",
			name = "Raw Bluefin",
			description = "Recoloring of raw bluefin.",
			section = fishSection
	)
	default boolean recolorRawBluefin()
	{
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "recolorRawMarlin",
			name = "Raw Marlin",
			description = "Recoloring of raw marlin.",
			section = fishSection
	)
	default boolean recolorRawMarlin()
	{
		return true;
	}

	@ConfigItem(
			position = 15,
			keyName = "recolorRawSwordtipSquid",
			name = "Raw Swordtip Squid",
			description = "Recoloring of raw swordtip squid.",
			section = fishSection
	)
	default boolean recolorRawSwordtipSquid()
	{
		return true;
	}

	@ConfigItem(
			position = 16,
			keyName = "recolorRawJumboSquid",
			name = "Raw Jumbo Squid",
			description = "Recoloring of raw jumbo squid.",
			section = fishSection
	)
	default boolean recolorRawJumboSquid()
	{
		return true;
	}
 */

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

	/*
	@ConfigItem(
			position = 9,
			keyName = "recolorRawWildKebbit",
			name = "Raw Wild Kebbit",
			description = "Recoloring of raw wild kebbit.",
			section = hunterMeatSection
	)
	default boolean recolorRawWildKebbit()
	{
		return true;
	}

	@ConfigItem(
			position = 10,
			keyName = "recolorRawLarupia",
			name = "Raw Larupia",
			description = "Recoloring of raw larupia meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawLarupia()
	{
		return true;
	}

	@ConfigItem(
			position = 11,
			keyName = "recolorRawBarbed",
			name = "Raw Barb-Tailed Kebbit",
			description = "Recoloring of raw barb-tailed kebbit meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawBarbed()
	{
		return true;
	}

	@ConfigItem(
			position = 12,
			keyName = "recolorRawGraahk",
			name = "Raw Graahk",
			description = "Recoloring of raw graahk meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawGraahk()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "recolorRawKyatt",
			name = "Raw Kyatt",
			description = "Recoloring of raw kyatt meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawKyatt()
	{
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "recolorRawPyreFox",
			name = "Raw Pyre Fox",
			description = "Recoloring of raw pyre fox meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawPyreFox()
	{
		return true;
	}

	@ConfigItem(
			position = 15,
			keyName = "recolorRawSunlightAntelope",
			name = "Raw Sunlight Antelope",
			description = "Recoloring of raw sunlight antelope meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawSunlightAntelope()
	{
		return true;
	}

	@ConfigItem(
			position = 16,
			keyName = "recolorRawDashingKebbit",
			name = "Raw Dashing Kebbit",
			description = "Recoloring of raw dashing kebbit meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawDashingKebbit()
	{
		return true;
	}

	@ConfigItem(
			position = 17,
			keyName = "recolorRawMoonlightAntelope",
			name = "Raw Moonlight Antelope",
			description = "Recoloring of raw moonlight antelope meat.",
			section = hunterMeatSection
	)
	default boolean recolorRawMoonlightAntelope()
	{
		return true;
	}
	 */

	//=== Other Section ===

}
