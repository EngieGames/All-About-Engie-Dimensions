
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaedimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.aaedimensions.world.features.ores.CyberOreFeature;
import net.mcreator.aaedimensions.world.features.ores.BloodOreFeature;
import net.mcreator.aaedimensions.world.features.NothingFeature;
import net.mcreator.aaedimensions.world.features.CyberHouseFeature;
import net.mcreator.aaedimensions.AaeDimensionsMod;

@Mod.EventBusSubscriber
public class AaeDimensionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AaeDimensionsMod.MODID);
	public static final RegistryObject<Feature<?>> CYBER_ORE = REGISTRY.register("cyber_ore", CyberOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLOOD_ORE = REGISTRY.register("blood_ore", BloodOreFeature::feature);
	public static final RegistryObject<Feature<?>> CYBER_HOUSE = REGISTRY.register("cyber_house", CyberHouseFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING = REGISTRY.register("nothing", NothingFeature::feature);
}
