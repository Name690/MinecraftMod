package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemSword;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;

public class MySword6 extends LibItemSword {

	public MySword6(String registryName, ToolMaterial material) {
		super(registryName, material);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(Conditions.isItemInInventory(attacker, Blocks.OBSIDIAN))
		Actions.spawnParticleAtEntity(target, EnumParticleTypes.BLOCK_DUST, 40, 1);
		Actions.castVindicatorFangs(attacker, target);
		return super.hitEntity(stack, target, attacker);
	}
}
