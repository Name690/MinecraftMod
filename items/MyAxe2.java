package mymod.items;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemAxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;

public class MyAxe2 extends LibItemAxe {

	public MyAxe2(String registryName, float attackDamage, float attackSpeed, ToolMaterial toolMaterial) {
		super(registryName, attackDamage, attackSpeed, toolMaterial);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				" aa",
				" sa",
				" s ",
				
				'a', MyItems.my_item_2,
				's', Items.STICK
				
		);
	}
}
