package mymod.entities.vehicles;

import mymod.library.entities.vehicles.LibEntityVehicle;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class MyEntityVehicle1 extends LibEntityVehicle {

	public MyEntityVehicle1(World worldIn) {
		super(worldIn);
		this.setSize(3.0F, 5.0F);
		this.setRelativePassengerPosition(0.0F, 4.3F, -0.6F);
		//this.setAirVehicle();
		//this.setCanHover(false);
		this.setGroundVehicle();
		this.stepHeight = 5.5F;
		
		this.addParticles(0.0F, 0.0F, .0F, EnumParticleTypes.EXPLOSION_LARGE, 10, 5);
	}

	@Override
	public float getVehicleSpeed() {
		return 0.2F;
	}
	

}
