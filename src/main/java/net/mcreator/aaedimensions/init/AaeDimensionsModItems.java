
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaedimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aaedimensions.item.CyberbloodKatanaItem;
import net.mcreator.aaedimensions.item.CyberbloodItem;
import net.mcreator.aaedimensions.item.CyberbloodBattleAxeItem;
import net.mcreator.aaedimensions.item.CyberbloodBarItem;
import net.mcreator.aaedimensions.item.CyberKatanaItem;
import net.mcreator.aaedimensions.item.CyberItem;
import net.mcreator.aaedimensions.item.CyberBarItem;
import net.mcreator.aaedimensions.item.BloodItem;
import net.mcreator.aaedimensions.item.BloodBattleAxeItem;
import net.mcreator.aaedimensions.item.BloodBarItem;
import net.mcreator.aaedimensions.AaeDimensionsMod;

public class AaeDimensionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AaeDimensionsMod.MODID);
	public static final RegistryObject<Item> PROTOGEN_SPAWN_EGG = REGISTRY.register("protogen_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeDimensionsModEntities.PROTOGEN, -16737793, -16750951, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS)));
	public static final RegistryObject<Item> CYBER_ORE = block(AaeDimensionsModBlocks.CYBER_ORE, AaeDimensionsModTabs.TAB_AAE_DIMENSIONS);
	public static final RegistryObject<Item> CYBER_BAR = REGISTRY.register("cyber_bar", () -> new CyberBarItem());
	public static final RegistryObject<Item> CYBER_KATANA = REGISTRY.register("cyber_katana", () -> new CyberKatanaItem());
	public static final RegistryObject<Item> BLOODY_ENGI_SPAWN_EGG = REGISTRY.register("bloody_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeDimensionsModEntities.BLOODY_ENGI, -6750208, -10092544, new Item.Properties().tab(AaeDimensionsModTabs.TAB_AAE_DIMENSIONS)));
	public static final RegistryObject<Item> BLOOD_ORE = block(AaeDimensionsModBlocks.BLOOD_ORE, AaeDimensionsModTabs.TAB_AAE_DIMENSIONS);
	public static final RegistryObject<Item> CYBER_ARMOR_HELMET = REGISTRY.register("cyber_armor_helmet", () -> new CyberItem.Helmet());
	public static final RegistryObject<Item> CYBER_ARMOR_CHESTPLATE = REGISTRY.register("cyber_armor_chestplate", () -> new CyberItem.Chestplate());
	public static final RegistryObject<Item> CYBER_ARMOR_LEGGINGS = REGISTRY.register("cyber_armor_leggings", () -> new CyberItem.Leggings());
	public static final RegistryObject<Item> CYBER_ARMOR_BOOTS = REGISTRY.register("cyber_armor_boots", () -> new CyberItem.Boots());
	public static final RegistryObject<Item> BLOOD_BAR = REGISTRY.register("blood_bar", () -> new BloodBarItem());
	public static final RegistryObject<Item> BLOOD_HELMET = REGISTRY.register("blood_helmet", () -> new BloodItem.Helmet());
	public static final RegistryObject<Item> BLOOD_CHESTPLATE = REGISTRY.register("blood_chestplate", () -> new BloodItem.Chestplate());
	public static final RegistryObject<Item> BLOOD_LEGGINGS = REGISTRY.register("blood_leggings", () -> new BloodItem.Leggings());
	public static final RegistryObject<Item> BLOOD_BOOTS = REGISTRY.register("blood_boots", () -> new BloodItem.Boots());
	public static final RegistryObject<Item> CYBERBLOOD_BAR = REGISTRY.register("cyberblood_bar", () -> new CyberbloodBarItem());
	public static final RegistryObject<Item> CYBERBLOOD_KATANA = REGISTRY.register("cyberblood_katana", () -> new CyberbloodKatanaItem());
	public static final RegistryObject<Item> CYBERBLOOD_HELMET = REGISTRY.register("cyberblood_helmet", () -> new CyberbloodItem.Helmet());
	public static final RegistryObject<Item> CYBERBLOOD_CHESTPLATE = REGISTRY.register("cyberblood_chestplate", () -> new CyberbloodItem.Chestplate());
	public static final RegistryObject<Item> CYBERBLOOD_LEGGINGS = REGISTRY.register("cyberblood_leggings", () -> new CyberbloodItem.Leggings());
	public static final RegistryObject<Item> CYBERBLOOD_BOOTS = REGISTRY.register("cyberblood_boots", () -> new CyberbloodItem.Boots());
	public static final RegistryObject<Item> CYBERBLOOD_BATTLE_AXE = REGISTRY.register("cyberblood_battle_axe", () -> new CyberbloodBattleAxeItem());
	public static final RegistryObject<Item> CYBER_STRUCTURE_SPAWNER = block(AaeDimensionsModBlocks.CYBER_STRUCTURE_SPAWNER, null);
	public static final RegistryObject<Item> BLOOD_BATTLE_AXE = REGISTRY.register("blood_battle_axe", () -> new BloodBattleAxeItem());
	public static final RegistryObject<Item> BLOOD_BLOCK = block(AaeDimensionsModBlocks.BLOOD_BLOCK, AaeDimensionsModTabs.TAB_AAE_DIMENSIONS);
	public static final RegistryObject<Item> CYBER_BLOCK = block(AaeDimensionsModBlocks.CYBER_BLOCK, AaeDimensionsModTabs.TAB_AAE_DIMENSIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
