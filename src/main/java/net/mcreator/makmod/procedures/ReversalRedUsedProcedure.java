package net.mcreator.makmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.makmod.init.MakModModEntities;
import net.mcreator.makmod.entity.RedEntity;

import java.util.Comparator;

public class ReversalRedUsedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = MakModModEntities.RED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if (((Entity) world.getEntitiesOfClass(RedEntity.class, AABB.ofSize(new Vec3((entity.getY()), (entity.getY()), (entity.getZ())), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf((entity.getY()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)) instanceof Mob _entity)
			_entity.getNavigation().moveTo((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 25);
	}
}
