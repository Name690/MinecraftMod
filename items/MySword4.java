package mymod.items;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSword;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class MySword4 extends LibItemSword {

	public MySword4(String registryName, ToolMaterial material) {
		super(registryName, material);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if(Conditions.isItemInInventory(playerIn, Items.FIRE_CHARGE)) {
			Actions.swingArm(playerIn);
			Actions.playSound(playerIn, SoundEvents.ENTITY_GHAST_SHOOT, 1, 10);
			RayTraceResult lookVec = Actions.getPlayerLookVec(playerIn, 10);
			
			if(lookVec.entityHit != null) {
				Actions.spawnParticleAtEntity(lookVec.entityHit, EnumParticleTypes.FLAME, 50, 1);
				Actions.chatAtPlayer(playerIn, "BURN");
				Actions.setFire(lookVec.entityHit, 3);
			}
			else {
				Actions.chatAtPlayer(playerIn, "BURN");
				Actions.spawnParticleAtPosition(worldIn, lookVec.getBlockPos(), EnumParticleTypes.FLAME, 50, 1);
				Actions.setBlockState(worldIn, lookVec.getBlockPos(), Blocks.NETHERRACK.getDefaultState());
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"a",
				"a",
				"s",
				
				'a', MyItems.my_item_3,
				's', Items.STICK
				
		);
	}
}
