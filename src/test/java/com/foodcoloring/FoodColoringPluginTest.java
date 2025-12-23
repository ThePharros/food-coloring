package com.foodcoloring;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FoodColoringPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FoodColoringPlugin.class);
		RuneLite.main(args);
	}
}