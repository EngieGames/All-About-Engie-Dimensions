
package net.mcreator.aaedimensions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aaedimensions.init.AaeDimensionsModTabs;

public class BloodBarItem extends Item {
	public BloodBarItem() {
		super(new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
