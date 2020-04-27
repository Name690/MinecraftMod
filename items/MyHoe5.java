package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class MyHoe5 extends LibItemHoe {

	public MyHoe5(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

}
