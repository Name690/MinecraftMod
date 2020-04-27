package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemSimple;

public class MyItem5 extends LibItemSimple {

	public MyItem5(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setScale(2.0F);
	}

}
