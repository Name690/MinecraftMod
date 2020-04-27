package mymod.items;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSword;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;

public class MySword5 extends LibItemSword {

	public MySword5(String registryName, ToolMaterial material) {
		super(registryName, material);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(Conditions.isItemInInventory(attacker, Blocks.BEACON))
		target.setVelocity(0, 1.3F, 0);
		//Actions.spawnParticleAtEntity(target, EnumParticleTypes.FALLING_DUST, 20, 1);
		//Actions.castVindicatorFangs(attacker, target);
		Actions.clearWeather();
		Actions.spawnParticleAtEntity(attacker, EnumParticleTypes.EXPLOSION_NORMAL, 20, 1); 
		return super.hitEntity(stack, target, attacker);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"a",
				"a",
				"s",
				
				'a', MyItems.my_item_4,
				's', Items.STICK
				
		);
	}
}
