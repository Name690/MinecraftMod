package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class MyAxe5 extends LibItemAxe {

	public MyAxe5(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

}
