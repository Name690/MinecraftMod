package mymod.biomes;

import mymod.entities.mobs.MyEntityMob1;
import mymod.library.biomes.LibBiome;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class MyBiome1 extends LibBiome {

	public MyBiome1(String registryName, BiomeProperties properties) {
		super(registryName, properties);
		
		 this.topBlock = Blocks.GRASS.getDefaultState();
		 this.fillerBlock = Blocks.PURPUR_BLOCK.getDefaultState();
		 
		 this.setGrassColor(0x000cff);
		 this.setSkyColor(0x960ce6);
		 this.setWaterColor(0x7100b3);
		 this.setFoliageColor(0x0009c2);
		 
		 this.decorator.treesPerChunk = 1;
		 this.decorator.reedsPerChunk = 5;
		 this.decorator.flowersPerChunk = 0;
		 this.decorator.gravelPatchesPerChunk = 0;
		 this.decorator.clayPerChunk = 0;
		 this.decorator.bigMushroomsPerChunk = 0;
		 
		 this.addCreatureSpawn(MyEntityMob1.class, 50, 3, 10);
		 this.addCreatureSpawn(EntityEnderman.class, 50, 1, 2);
		 
		 this.addMonsterSpawn(EntityVillager.class, 1, 7, 10);
		 this.addMonsterSpawn(EntityVindicator.class, 9, 2, 5);
		 this.addMonsterSpawn(MyEntityMob1.class, 40, 2, 3);
		 this.addMonsterSpawn(EntityEnderman.class, 40, 1, 1);
		 
		
	}

}
