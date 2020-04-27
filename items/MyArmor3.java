package mymod.items;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemArmor;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MyArmor3 extends LibItemArmor {

	public MyArmor3(String registryName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(registryName, materialIn, equipmentSlotIn);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected String getArmorWrapTexture() {
		return "my_armor_3";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.CHEST && Conditions.secondsGoneBy(world, 1)) {
			Actions.addPotionEffect(player, MobEffects.FIRE_RESISTANCE, 40, 255, false);
			Actions.addPotionEffect(player, MobEffects.SPEED, 40, 1, false);
			Actions.setFire(player, 1);
		}
		super.onArmorTick(world, player, itemStack);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(MyItems.my_helmet_3, 1, 
				
				"aaa",
				"a a",
				"   ",
				
				'a', MyItems.my_item_3
				
		);
			LibRegistry.addShapedRecipe(MyItems.my_chestplate_3, 1, 
					
					"a a",
					"aaa",
					"aaa",
				
					'a', MyItems.my_item_3
				
			);
			LibRegistry.addShapedRecipe(MyItems.my_leggings_3, 1, 
					
					"aaa",
					"a a",
					"a a",
					
					'a', MyItems.my_item_3
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_boots_3, 1, 
					
					"   ",
					"a a",
					"a a",
					
					'a', MyItems.my_item_3
					
			);
		}
}
