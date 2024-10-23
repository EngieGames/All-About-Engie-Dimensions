package net.mcreator.aaedimensions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.aaedimensions.init.AaeDimensionsModBlocks;

public class NothingOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), AaeDimensionsModBlocks.CYBER_STRUCTURE_SPAWNER.get().defaultBlockState(), 3);
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 20);
	}
}
