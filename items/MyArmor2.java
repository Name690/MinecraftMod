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

public class MyArmor2 extends LibItemArmor {

	public MyArmor2(String registryName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(registryName, materialIn, equipmentSlotIn);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected String getArmorWrapTexture() {
		// TODO Auto-generated method stub
		return "my_armor_2";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(this.getEquipmentSlot() == EntityEquipmentSlot.HEAD && Conditions.secondsGoneBy(world, 10)) {
			Actions.addPotionEffect(player, MobEffects.WATER_BREATHING, 150, 255, false);
			Actions.addPotionEffect(player, MobEffects.NIGHT_VISION, 1000, 1000, false);
		}
		super.onArmorTick(world, player, itemStack);
	}
	
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(MyItems.my_helmet_2, 1, 
				
				"aaa",
				"a a",
				"   ",
				
				'a', MyItems.my_item_2
				
		);
			LibRegistry.addShapedRecipe(MyItems.my_chestplate_2, 1, 
					
					"a a",
					"aaa",
					"aaa",
				
					'a', MyItems.my_item_2
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_leggings_2, 1, 
					
					"aaa",
					"a a",
					"a a",
					
					'a', MyItems.my_item_2
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_boots_2, 1, 
					
					"   ",
					"a a",
					"a a",
					
					'a', MyItems.my_item_2
					
			);
		}
	
}
