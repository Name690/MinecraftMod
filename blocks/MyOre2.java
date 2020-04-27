package mymod.blocks;

import mymod.Main;
import mymod.library.blocks.LibBlockOre;

public class MyOre2 extends LibBlockOre {
	public MyOre2(String registryName, String harvestTool, int harvestLevel) {
		super(registryName, harvestTool, harvestLevel);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setHardness(4.0F);
		this.setResistance(0);
	}
}
