package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.entities.projectiles.MyEntityProjectile1;
import mymod.library.LibRegistry;
import mymod.library.entities.projectile.LibEntityProjectile;
import mymod.library.items.LibItemProjectile;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyProjectile1 extends LibItemProjectile {

	public MyProjectile1(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setScale(0.5F);
	}

	@Override
	public Class<? extends LibEntityProjectile> getEntityProjectile() {
		return MyEntityProjectile1.class;
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"rrr",
				"rdr",
				"rrr",
				
				'r', Items.REDSTONE,
				'd', Blocks.DIRT
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.WHITE + "ewwwwwww");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}
