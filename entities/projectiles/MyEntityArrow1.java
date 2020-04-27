package mymod.entities.projectiles;

import mymod.MyItems;
import mymod.library.entities.projectile.LibEntityArrow;
import mymod.library.util.Actions;
import net.minecraft.item.Item;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class MyEntityArrow1 extends LibEntityArrow {

	public MyEntityArrow1(World world) {
		super(world);
		this.setDamage(5);
		this.setKnockbackStrength(1);
	}

	@Override
	public Item getItemProjectile() {
		return MyItems.my_arrow_1;
	}

	
	@Override
	protected void onHit(RayTraceResult raytraceResultIn) {
		if (raytraceResultIn.entityHit != null) {
			raytraceResultIn.entityHit.setVelocity(0, 0.3F, 0);
			raytraceResultIn.entityHit.setCustomNameTag("Astralified");
			Actions.summonLightningAtEntity(raytraceResultIn.entityHit, -1);
			super.onHit(raytraceResultIn);
		}
	}
	
	
}
