package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemArmor;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyArmor1 extends LibItemArmor {

	public MyArmor1(String registryName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(registryName, materialIn, equipmentSlotIn);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected String getArmorWrapTexture() {

		return "my_armor_1";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.HEAD) {
			Actions.addPotionEffect(player, MobEffects.NIGHT_VISION, 49, 5, false);
		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.CHEST && Conditions.secondsGoneBy(world, 2)) {
			Actions.addPotionEffect(player, MobEffects.INVISIBILITY, 59, 0, false);
			Actions.addPotionEffect(player, MobEffects.FIRE_RESISTANCE, 59, 255, false);
			Actions.addPotionEffect(player, MobEffects.REGENERATION, 59, 1, false);
		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.LEGS) {
			Actions.addPotionEffect(player, MobEffects.JUMP_BOOST, 59, 1, false);
		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.FEET) {
			Actions.addPotionEffect(player, MobEffects.SPEED, 59, 1, false);

		}
		super.onArmorTick(world, player, itemStack);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(MyItems.my_helmet_1, 1, 
				
				"aaa",
				"a a",
				"   ",
				
				'a', MyItems.my_item_1
				
		);
			LibRegistry.addShapedRecipe(MyItems.my_chestplate_1, 1, 
					
					"a a",
					"aaa",
					"aaa",
					
					'a', MyItems.my_item_1
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_leggings_1, 1, 
					
					"aaa",
					"a a",
					"a a",
					
					'a', MyItems.my_item_1
					
			);
			LibRegistry.addShapedRecipe(MyItems.my_boots_1, 1, 
					
					"   ",
					"a a",
					"a a",
					
					'a', MyItems.my_item_1
					
			);
		}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "Woven from dust from another planet and worn by many great warriors");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	}

