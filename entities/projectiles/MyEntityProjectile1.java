package mymod.entities.projectiles;

import mymod.library.entities.projectile.LibEntityProjectile;
import mymod.library.util.Actions;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class MyEntityProjectile1 extends LibEntityProjectile {

	public MyEntityProjectile1(World worldIn) {
		super(worldIn);
		
	}
@Override
protected void onImpact(RayTraceResult result) {
	if (result.entityHit != null) {
		//Actions.summonLightningAtEntity(this, 3);
		//Actions.teleportEntityToEntity(this.getThrower(), this.getPosition());
		Actions.spawnParticleAtEntity(this, EnumParticleTypes.EXPLOSION_LARGE, 1, 1);
		Actions.createExplosion(world, this.getPosition(), 3);
	}
	else {
		//Actions.summonLightningAtEntity(this, 3);
		//Actions.teleportEntityToEntity(this.getThrower(), this.getPosition());
		Actions.spawnParticleAtEntity(this, EnumParticleTypes.EXPLOSION_LARGE, 1, 1);
		Actions.createExplosion(world, this.getPosition(), 10);
	}
	Actions.destroyEntity(this);
		
}
}
