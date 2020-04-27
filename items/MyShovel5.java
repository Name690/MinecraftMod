package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemShovel;
import net.minecraft.item.Item.ToolMaterial;

public class MyShovel5 extends LibItemShovel {

	public MyShovel5(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

}
