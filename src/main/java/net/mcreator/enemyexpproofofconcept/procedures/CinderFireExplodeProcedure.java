package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

public class CinderFireExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}
