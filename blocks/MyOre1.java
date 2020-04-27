package mymod.blocks;

import mymod.Main;
import mymod.library.blocks.LibBlockOre;

public class MyOre1 extends LibBlockOre {

	public MyOre1(String registryName, String harvestTool, int harvestLevel) {
		super(registryName, harvestTool, harvestLevel);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setHardness(3.5F);
		this.setResistance(100000);
		this.setLightLevel(0.5F);
	}

}
