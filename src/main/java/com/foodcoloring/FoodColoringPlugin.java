package com.foodcoloring;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Food Coloring"
)
public class FoodColoringPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private FoodColoringOverlay foodColoringOverlay;

	@Inject
	private Client client;

	@Inject
	private FoodColoringConfig config;

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(foodColoringOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(foodColoringOverlay);
	}

	@Provides
	FoodColoringConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FoodColoringConfig.class);
	}
}
