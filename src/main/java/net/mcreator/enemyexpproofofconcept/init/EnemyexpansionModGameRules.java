
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnemyexpansionModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> TARANTULAREPLACEMENTRULE = GameRules.register("tarantulaReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> CINDERREPLACEMENTRULE = GameRules.register("cinderReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
}
