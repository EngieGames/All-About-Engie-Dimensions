
package net.mcreator.aaedimensions.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaedimensions.init.AaeDimensionsModTabs;
import net.mcreator.aaedimensions.init.AaeDimensionsModItems;

public abstract class CyberItem extends ArmorItem {
	public CyberItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{350, 350, 350, 350}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeDimensionsModItems.CYBER_BAR.get()));
			}

			@Override
			public String getName() {
				return "cyber_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CyberItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_dimensions:textures/models/armor/cyber_layer_1.png";
		}
	}

	public static class Chestplate extends CyberItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_dimensions:textures/models/armor/cyber_layer_1.png";
		}
	}

	public static class Leggings extends CyberItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_dimensions:textures/models/armor/cyber_layer_2.png";
		}
	}

	public static class Boots extends CyberItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_dimensions:textures/models/armor/cyber_layer_1.png";
		}
	}
}
