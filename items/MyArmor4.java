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

public class MyArmor4 extends LibItemArmor {

	public MyArmor4(String registryName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(registryName, materialIn, equipmentSlotIn);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected String getArmorWrapTexture() {
		// TODO Auto-generated method stub
		return "my_armor_4";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.LEGS && Conditions.secondsGoneBy(world, 1)) {
			Actions.addPotionEffect(player, MobEffects.JUMP_BOOST, 40, 1, false);
			Actions.addPotionEffect(player, MobEffects.HASTE, 40, 0, false);
		}
		super.onArmorTick(world, player, itemStack);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(MyItems.my_helmet_4, 1, 
				
				"aaa",
				"a a",
				"   ",
				
				'a', MyItems.my_item_4
				
		);
			LibRegistry.addShapedRecipe(MyItems.my_chestplate_4, 1, 
					
					"a a",
					"aaa",
					"aaa",
				
					'a', MyItems.my_item_4
				
			);
			LibRegistry.addShapedRecipe(MyItems.my_leggings_4, 1, 
					
					"aaa",
					"a a",
					"a a",
					
					'a', MyItems.my_item_4
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_boots_4, 1, 
					
					"   ",
					"a a",
					"a a",
					
					'a', MyItems.my_item_4
					
			);
		}
}
