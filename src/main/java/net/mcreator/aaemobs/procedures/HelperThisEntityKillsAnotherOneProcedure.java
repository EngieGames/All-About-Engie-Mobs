package net.mcreator.aaemobs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.aaemobs.init.AaeMobsModEntities;
import net.mcreator.aaemobs.entity.PunisherEntity;
import net.mcreator.aaemobs.entity.EngieGamesHimselfEntity;

public class HelperThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof PunisherEntity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new EngieGamesHimselfEntity(AaeMobsModEntities.ENGIE_GAMES_HIMSELF.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (!sourceentity.level.isClientSide())
				sourceentity.discard();
		}
	}
}
