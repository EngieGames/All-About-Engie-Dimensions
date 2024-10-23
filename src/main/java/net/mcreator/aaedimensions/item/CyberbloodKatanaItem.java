
package net.mcreator.aaedimensions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.aaedimensions.init.AaeDimensionsModTabs;
import net.mcreator.aaedimensions.init.AaeDimensionsModItems;

public class CyberbloodKatanaItem extends SwordItem {
	public CyberbloodKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 498f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeDimensionsModItems.CYBERBLOOD_BAR.get()));
			}
		}, 3, -3f, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS));
	}
}
