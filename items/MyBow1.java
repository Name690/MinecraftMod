package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemBow;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyBow1 extends LibItemBow {

	public MyBow1(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected Item getAmmo() {
		
		return MyItems.my_arrow_1;
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				" ad",
				"a d",
				" ad",
				
				'a', MyItems.my_item_1,
				'd', Items.DIAMOND
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "This is used to lanch astral arrows");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
