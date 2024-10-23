
package net.mcreator.aaedimensions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.aaedimensions.init.AaeDimensionsModTabs;
import net.mcreator.aaedimensions.init.AaeDimensionsModItems;

import java.util.List;

public class BloodBattleAxeItem extends AxeItem {
	public BloodBattleAxeItem() {
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
				return Ingredient.of(new ItemStack(AaeDimensionsModItems.BLOOD_BAR.get()));
			}
		}, 1, 8.5f, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("."));
	}
}
