package mymod;

import mymod.biomes.MyBiome1;
import mymod.library.LibRegistry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class MyBiomes {

	public static void init(FMLInitializationEvent event) {

		/**
		 * DECLARE BIOMES =================================================
		 */
		//Astral Biome
		Biome my_biome_1; 
 
		//Astral Biome Properties
		Biome.BiomeProperties my_biome_1_properties;

		/**
		 * REGISTER BIOMES =================================================
		 */
		
		//Astral Biome Properties
		my_biome_1_properties = new Biome.BiomeProperties("Demnsional Cliffs");
		my_biome_1_properties.setBaseHeight(3.5F);
		my_biome_1_properties.setHeightVariation(1.5F);
		my_biome_1_properties.setTemperature(0.5F);
		my_biome_1_properties.setRainfall(0.8F);

		
		//Astral Biome
		my_biome_1 = new MyBiome1("my_biome_1", my_biome_1_properties);
		LibRegistry.registerBiome(my_biome_1, 50);
		
		//Replace all biomes with my biomes
		//LibRegistry.replaceAllBiomesWith(my_biome_1);
	}

}