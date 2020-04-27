package mymod.items;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemHoe;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;

public class MyHoe3 extends LibItemHoe {

	public MyHoe3(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				" aa",
				" s ",
				" s ",
				
				'a', MyItems.my_item_3,
				's', Items.STICK
				
		);
	}
}
