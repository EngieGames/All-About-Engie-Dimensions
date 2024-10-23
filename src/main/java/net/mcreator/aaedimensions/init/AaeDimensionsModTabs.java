
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaedimensions.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AaeDimensionsModTabs {
	public static CreativeModeTab TAB_AAE_DIMENSIONS;

	public static void load() {
		TAB_AAE_DIMENSIONS = new CreativeModeTab("tabaae_dimensions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.PURPLE_STAINED_GLASS);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
