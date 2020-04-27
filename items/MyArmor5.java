package mymod.items;

import mymod.Main;
import mymod.library.items.LibItemArmor;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MyArmor5 extends LibItemArmor {

	public MyArmor5(String registryName, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(registryName, materialIn, equipmentSlotIn);
		this.setCreativeTab(Main.my_creative_tab_1);
	}

	@Override
	protected String getArmorWrapTexture() {
		// TODO Auto-generated method stub
		return "my_armor_5";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.FEET && Conditions.secondsGoneBy(world, 3)) {
			Actions.addPotionEffect(player, MobEffects.STRENGTH, 120, 1, false);
		}
		super.onArmorTick(world, player, itemStack);
	}
}
