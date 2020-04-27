package mymod.blocks;

import mymod.Main;
import mymod.library.blocks.LibBlockOre;

public class MyOre5 extends LibBlockOre {

	public MyOre5(String registryName, String harvestTool, int harvestLevel) {
		super(registryName, harvestTool, harvestLevel);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

}
