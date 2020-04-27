package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSeeds;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MySeeds1 extends LibItemSeeds {

	public MySeeds1(String registryName, Block crops) {
		super(registryName, crops);
	this.setCreativeTab(Main.my_creative_tab_1);
	}
	
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"aaa",
				"ada",
				"aaa",
				
				'a', MyItems.my_item_1,
				'd', Items.DIAMOND
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "These seeds seem to be aleins from outer space");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
