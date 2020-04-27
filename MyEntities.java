package mymod;

import java.lang.reflect.Constructor;

import mymod.entities.mobs.MyEntityMob1;
import mymod.entities.mobs.MyEntityMob2;
import mymod.entities.projectiles.MyEntityArrow1;
import mymod.entities.projectiles.MyEntityProjectile1;
import mymod.entities.vehicles.MyEntityVehicle1;
import mymod.library.LibRegistry;
import mymod.library.entities.LibRenderMob;
import mymod.library.entities.mobs.models.LibModelMutantCreeper;
import mymod.library.entities.mobs.models.LibModelTitan;
import mymod.library.entities.vehicles.LibModelMech;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyEntities {

	/**
	 * REGISTER ENTITIES =================================================
	 */
	public static void preInit() {

		/** VEHICLES */
		
		//Mech
		registerEntity("my_vehicle_1",MyEntityVehicle1.class , 0xC0C0C0	, 0xD3D3D3);

		/** PROJECTILES */
		//Astral Arrow
		registerEntity("my_arrow_1", MyEntityArrow1.class);
		//Atomic Poop
		registerEntity("my_projectile_1", MyEntityProjectile1.class);

		/** MOBS */
		//Astral Hunter
		registerEntity("my_mob_1", MyEntityMob1.class, 0x7c0bcf, 0xffffff);
		
		//Poop Carlos
		registerEntity("my_mob_2", MyEntityMob2.class, 0xD2B48C, 0xA52A2A);

	}
	

	/**
	 * REGISTER ENTITY MODELS =================================================
	 */
	@SideOnly(Side.CLIENT)
	public static void registerEntityModels() {

		/** VEHICLES */
		
		//Mech
		LibRegistry.registerVehicleModel(MyEntityVehicle1.class, LibModelMech.class, 1.0F);
		
		/** PROJECTILES */
		
		//Astral Arrow
		LibRegistry.registerProjectileModel(MyEntityArrow1.class);
		
		//Atomic Poop
		LibRegistry.registerProjectileSprite(MyEntityProjectile1.class, 1.0F);
		
		/** MOBS */
		
		//Astral Hunter
		LibRegistry.registerMobModel(MyEntityMob1.class, LibModelMutantCreeper.class, 2.0F);
		
		//Poop Carlos
		LibRegistry.registerMobModel(MyEntityMob2.class, LibModelTitan.class, 0.3F);
		
	}
	

	/**
	 * REGISTER ENTITY SPAWNS =================================================
	 */
	public static void registerEntitySpawns() {

	}
	public static void registerEntity(String name, Class<? extends Entity> entityClass, int eggPrimary, int eggSecondary) {
        EntityRegistry.registerModEntity(new ResourceLocation("mymod", name),
                entityClass, name, mobID++, Main.instance(), 64, 3, true, eggPrimary, eggSecondary);

    }
	private static int mobID = 0;
	 public static void registerEntity(String name, Class<? extends Entity> entityClass) {
	        EntityRegistry.registerModEntity(new ResourceLocation("mymod", name),
	                entityClass, name, mobID++, Main.instance(), 64, 3, true);
	    }
	 @SideOnly(Side.CLIENT)
	    private static void registerEntityModelCategory(Class<? extends EntityLiving> entityClass,
	                                                    Class<? extends ModelBase> modelClass,
	                                                    String category,
	                                                    float scale) {
	        if (EntityRegistry.getEntry(entityClass) != null) {
	            registerEntityModelTexture(entityClass, modelClass, "textures/entities/" + category + "/" + EntityRegistry.getEntry(entityClass).getName() + ".png", scale);
	        } else {
	            System.out.println("Error trying to register renderer for " + entityClass + ", you probably haven't registered the entity yet!");
	        }
	    }
	 @SideOnly(Side.CLIENT)
	    private static void registerEntityModelTexture(Class<? extends EntityLiving> entityClass,
	                                                   Class<? extends ModelBase> modelClass,
	                                                   String texture,
	                                                   float scale) {

	        try {
	            Constructor constructor = modelClass.getConstructor();
	            ModelBase model = (ModelBase) constructor.newInstance();

	            RenderingRegistry.registerEntityRenderingHandler(entityClass, manager -> {
	                return new LibRenderMob(manager, entityClass, model)
	                        .setTexture(new ResourceLocation(Main.instance(), texture))
	                        .setScale(scale);
	            });
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	    }

}
