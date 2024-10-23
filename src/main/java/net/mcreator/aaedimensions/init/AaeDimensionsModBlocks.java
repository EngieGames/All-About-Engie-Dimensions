
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaedimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.aaedimensions.block.CyberStructureSpawnerBlock;
import net.mcreator.aaedimensions.block.CyberOreBlock;
import net.mcreator.aaedimensions.block.CyberBlockBlock;
import net.mcreator.aaedimensions.block.BloodOreBlock;
import net.mcreator.aaedimensions.block.BloodBlockBlock;
import net.mcreator.aaedimensions.AaeDimensionsMod;

public class AaeDimensionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AaeDimensionsMod.MODID);
	public static final RegistryObject<Block> CYBER_ORE = REGISTRY.register("cyber_ore", () -> new CyberOreBlock());
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", () -> new BloodOreBlock());
	public static final RegistryObject<Block> CYBER_STRUCTURE_SPAWNER = REGISTRY.register("cyber_structure_spawner", () -> new CyberStructureSpawnerBlock());
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", () -> new BloodBlockBlock());
	public static final RegistryObject<Block> CYBER_BLOCK = REGISTRY.register("cyber_block", () -> new CyberBlockBlock());
}
