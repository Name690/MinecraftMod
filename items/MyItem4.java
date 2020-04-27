package mymod.items;

import mymod.Main;
import mymod.MyBlocks;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSimple;

public class MyItem4 extends LibItemSimple {

	public MyItem4(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setScale(2.0F);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addSmeltingRecipe(this, 3, 5, MyBlocks.my_ore_4);
		super.initRecipe();
	}
}
