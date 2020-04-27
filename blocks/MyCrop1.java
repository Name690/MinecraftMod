package mymod.blocks;

import mymod.Main;
import mymod.MyItems;
import mymod.library.blocks.LibBlockCrops;
import net.minecraft.item.Item;

public class MyCrop1 extends LibBlockCrops {

	public MyCrop1(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected int getGrowthDelay() {
		return 600;
	}

	@Override
	protected Item getSeed() {
		return MyItems.my_seeds_1;
	}

	@Override
	protected Item getCrop() {
		return MyItems.my_item_1;
	}

}
