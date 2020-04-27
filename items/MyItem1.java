package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.library.items.LibItemSimple;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyItem1 extends LibItemSimple {

	public MyItem1(String registryName) {
		super(registryName);
		setCreativeTab(Main.my_creative_tab_1);
	}
	
	
@Override
public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
	tooltip.add(TextFormatting.LIGHT_PURPLE + "This is a piece of dust from " + TextFormatting.BOLD + "another universe");
	super.addInformation(stack, worldIn, tooltip, flagIn);
}


	
}
