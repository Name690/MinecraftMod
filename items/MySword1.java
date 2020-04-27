package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSword;
import mymod.library.util.Actions;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MySword1 extends LibItemSword {

	public MySword1(String registryName, ToolMaterial material) {
		super(registryName, material);
		
		this.setCreativeTab(Main.my_creative_tab_1);
		
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		target.setGlowing(true);
		target.setCustomNameTag("Astralified");
		target.setVelocity(0, 1, 0);
		attacker.setGlowing(true);
		Actions.summonLightningAtEntity(target, -1);
		Actions.teleportEntityToEntity(attacker, target);
		return super.hitEntity(stack, target, attacker);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"a",
				"a",
				"d",
				
				'a', MyItems.my_item_1,
				'd', Items.DIAMOND
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "This dimensional sword will call lightning upon your foes");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
}
