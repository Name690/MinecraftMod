package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class MyPickaxe5 extends LibItemPickaxe {

	public MyPickaxe5(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

}
