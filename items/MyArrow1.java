package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.entities.projectiles.MyEntityArrow1;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemArrow;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyArrow1 extends LibItemArrow {

	public MyArrow1(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	public Class<? extends EntityTippedArrow> getEntityProjectile() {
		return MyEntityArrow1.class;
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"a",
				"d",
				"c",
				
				'a', MyItems.my_item_1,
				'c', Items.CHORUS_FRUIT,
				'd', Items.DIAMOND
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "This is used to summon lightning upon hit");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
