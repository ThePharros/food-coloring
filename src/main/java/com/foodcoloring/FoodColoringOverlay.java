package com.foodcoloring;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.gameval.ItemID;
import net.runelite.api.gameval.InterfaceID;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

@Slf4j
public class FoodColoringOverlay extends WidgetItemOverlay
{
	//in-game alpha for placeholder is 120/255, however, overlays are on top of in-game renders, so we dim it further
	static final float PLACEHOLDER_ALPHA = 0.18f;

	static final int ICON_OFFSET = 5;
	static final int ICON_DIMENSIONS = 22;

	final Map<String, Image> images = new HashMap<>();

	@Inject
	private FoodColoringConfig config;

	@Inject
	private FoodColoringOverlay()
	{
		this.showOnInventory();
		this.showOnBank();
		showAfterLayers(
				InterfaceID.Chatbox.MES_LAYER_SCROLLCONTENTS,
				//InterfaceID.DeathCoffer.DISPLAY, //doesn't work as this uses WidgetType.MODEL (Type=6)
				InterfaceID.DeathCofferSide.ITEMS,
				InterfaceID.Deathkeep.GRAVE,
				InterfaceID.Deathkeep.KEPT,
				InterfaceID.DeathOffice.ITEMS,
				InterfaceID.GeCollect.COLLECT_0,
				InterfaceID.GeCollect.COLLECT_1,
				InterfaceID.GeCollect.COLLECT_2,
				InterfaceID.GeCollect.COLLECT_3,
				InterfaceID.GeCollect.COLLECT_4,
				InterfaceID.GeCollect.COLLECT_5,
				InterfaceID.GeCollect.COLLECT_6,
				InterfaceID.GeCollect.COLLECT_7,
				InterfaceID.GeOffers.DETAILS,
				InterfaceID.GeOffers.DETAILS_COLLECT,
				InterfaceID.GeOffers.SETUP,
				InterfaceID.GeOffers.INDEX_0,
				InterfaceID.GeOffers.INDEX_1,
				InterfaceID.GeOffers.INDEX_2,
				InterfaceID.GeOffers.INDEX_3,
				InterfaceID.GeOffers.INDEX_4,
				InterfaceID.GeOffers.INDEX_5,
				InterfaceID.GeOffers.INDEX_6,
				InterfaceID.GeOffers.INDEX_7,
				InterfaceID.GePricechecker.ITEMS,
				InterfaceID.GravestoneGeneric.FREEITEMS,
				InterfaceID.GravestoneGeneric.PAYITEMS,
				InterfaceID.InvoverlayNoops.ITEMS //also used for bankpin screen
		);
	}

	@Override
	public void renderItemOverlay(final Graphics2D graphics, final int id, final WidgetItem widget)
	{           //fishies
		if (shouldRenderItemOverlay(config.recolorGiantKrill(), id, ItemID.GIANT_KRILL) ||
				shouldRenderItemOverlay(config.recolorHaddock(), id, ItemID.HADDOCK) ||
				shouldRenderItemOverlay(config.recolorYellowfin(), id, ItemID.YELLOWFIN) ||
				shouldRenderItemOverlay(config.recolorHalibut(), id, ItemID.HALIBUT) ||
				shouldRenderItemOverlay(config.recolorBluefin(), id, ItemID.BLUEFIN) ||
				shouldRenderItemOverlay(config.recolorMarlin(), id, ItemID.MARLIN) ||
				//shouldRenderItemOverlay(config.recolorSwordtipSquid(), id, ItemID.SWORDTIP_SQUID) ||
				//shouldRenderItemOverlay(config.recolorJumboSquid(), id, ItemID.JUMBO_SQUID) ||

				//raw fishies
				shouldRenderItemOverlay(config.recolorRawMarlin(), id, ItemID.RAW_MARLIN) ||
				/*
				shouldRenderItemOverlay( config.recolorRawGiantKrill(), id, ItemID.RAW_GIANT_KRILL) ||
				shouldRenderItemOverlay(config.recolorRawHaddock(), id, ItemID.RAW_HADDOCK) ||
				shouldRenderItemOverlay(config.recolorRawYellowfin(), id, ItemID.RAW_YELLOWFIN) ||
				shouldRenderItemOverlay(config.recolorRawHalibut(), id, ItemID.RAW_HALIBUT) ||
				shouldRenderItemOverlay(config.recolorRawBluefin(), id, ItemID.RAW_BLUEFIN) ||
				shouldRenderItemOverlay(config.recolorRawMarlin(), id, ItemID.RAW_MARLIN) ||
				shouldRenderItemOverlay(config.recolorRawSwordtipSquid(), id, ItemID.RAW_SWORDTIP_SQUID) ||
				shouldRenderItemOverlay(config.recolorRawJumboSquid(), id, ItemID.RAW_JUMBO_SQUID) ||
				 */

				//hunter meats
				shouldRenderItemOverlay(config.recolorWildKebbit(), id, ItemID.WILDKEBBIT_COOKED) ||
				shouldRenderItemOverlay(config.recolorLarupia(), id, ItemID.LARUPIA_COOKED) ||
				shouldRenderItemOverlay(config.recolorBarbed(), id, ItemID.BARBKEBBIT_COOKED) ||
				shouldRenderItemOverlay(config.recolorGraahk(), id, ItemID.GRAAHK_COOKED) ||
				shouldRenderItemOverlay(config.recolorKyatt(), id, ItemID.KYATT_COOKED) ||
				shouldRenderItemOverlay(config.recolorPyreFox(), id, ItemID.FENNECFOX_COOKED) ||
				shouldRenderItemOverlay(config.recolorSunlightAntelope(), id, ItemID.ANTELOPESUN_COOKED) ||
				shouldRenderItemOverlay(config.recolorDashingKebbit(), id, ItemID.DASHINGKEBBIT_COOKED) ||
				shouldRenderItemOverlay(config.recolorMoonlightAntelope(), id, ItemID.ANTELOPEMOON_COOKED)

				//raw hunter meats
				/*
				shouldRenderItemOverlay(config.recolorRawWildKebbit(), id, ItemID.HUNTINGBEAST_WILD_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawLarupia(), id, ItemID.HUNTING_LARUPIA_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawBarbed(), id, ItemID.HUNTINGBEAST_BARBED_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawGraahk(), id, ItemID.HUNTING_GRAAHK_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawKyatt(), id, ItemID.HUNTING_KYATT_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawPyreFox(), id, ItemID.HUNTING_FENNECFOX_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawSunlightAntelope(), id, ItemID.HUNTING_ANTELOPESUN_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawDashingKebbit(), id, ItemID.HUNTINGBEAST_SPEEDY2_MEAT) ||
				shouldRenderItemOverlay(config.recolorRawMoonlightAntelope(), id, ItemID.HUNTING_ANTELOPEMOON_MEAT)
				 */
		)
		{
			renderCorrectItemOverlay(graphics, id, widget);
		}
	}


	private boolean shouldRenderItemOverlay(boolean configEnabled, int id, int itemId)
	{
		return configEnabled && (id >= itemId) && (id <= itemId + 2);
	}


	private void renderCorrectItemOverlay(final Graphics2D graphics, final int id, final WidgetItem widget)
	{
		final Rectangle bounds = widget.getCanvasBounds();
		final double x = bounds.getX();
		final double y = bounds.getY();
		Image iconImage = this.getReplacementIcon(id);

		//item icon
		if (iconImage != null)
		{
			graphics.drawImage(iconImage, (int) x, (int) y, null);
			return;
		}

		//banknote icon
		iconImage = this.getReplacementIcon(id-1);
		if (iconImage != null)
		{
			Graphics2D g2d = (Graphics2D) graphics.create();
			final int w = iconImage.getWidth(null);
			final int h = iconImage.getHeight(null);
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g2d.drawImage(iconImage, (int) x + ICON_OFFSET, (int) y + ICON_OFFSET, ICON_DIMENSIONS, ICON_DIMENSIONS, null);
			g2d.dispose();
			return;
		}

		//placeholder icon
		iconImage = this.getReplacementIcon(id-2);
		if (iconImage != null)
		{
			Graphics2D g2d = (Graphics2D) graphics.create();
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, PLACEHOLDER_ALPHA));
			g2d.drawImage(iconImage, (int) x, (int) y + 1, null);
			g2d.dispose();
			return;
		}

		log.debug("Food Coloring plugin could not find image resource for item id: " + id);
	}


	private Image getReplacementIcon(final int id)
	{
		final String key = Integer.toString(id);
		if (!this.images.containsKey(key))
		{
			final URL resourceUrl = FoodColoringPlugin.class.getClassLoader().getResource(key + ".png");
			if (resourceUrl == null)
			{
				return null;
			}
			this.images.put(key, new ImageIcon(resourceUrl).getImage());
		}
		return this.images.get(key);
	}


	private void showAfterLayers(int... ids) {
		Arrays.stream(ids).forEach(this::drawAfterLayer);
	}
}