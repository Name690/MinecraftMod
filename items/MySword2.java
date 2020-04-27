package mymod.items;

import java.util.List;

import mymod.Main;
import mymod.MyItems;
import mymod.library.LibRegistry;
import mymod.library.items.LibItemSword;
import mymod.library.util.Actions;
import net.minecraft.client.util.ITooltipFlag;
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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MySword2 extends LibItemSword {

	public MySword2(String registryName, ToolMaterial material) {
		super(registryName, material);
	this.setCreativeTab(Main.my_creative_tab_1);
	this.setScale(1.5F);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		Actions.swingArm(playerIn);
		Actions.playSound(playerIn, SoundEvents.ENTITY_WITHER_SPAWN, 1, 1);
		
		RayTraceResult lookVec = Actions.getPlayerLookVec(playerIn, 50);
		
		if(lookVec.entityHit != null) {
			Actions.teleportEntityToEntity(playerIn, lookVec.entityHit);
			Actions.spawnParticleAtEntity(lookVec.entityHit, EnumParticleTypes.DRAGON_BREATH, 300, 3);
			Actions.summonLightningAtEntity(lookVec.entityHit, -1);
			Actions.spawnParticleBeamToEntity(playerIn, lookVec.entityHit, EnumParticleTypes.DRAGON_BREATH, 50);
		}
		else if(Actions.getBlock(worldIn, lookVec.getBlockPos()) == Blocks.AIR) {
			Actions.teleportEntityToPosition(playerIn, lookVec.getBlockPos());
			Actions.spawnParticleAtPosition(worldIn, lookVec.getBlockPos(), EnumParticleTypes.DRAGON_BREATH, 300, 3);
			Actions.summonLightningAtPosition(worldIn, lookVec.getBlockPos(), -1);
		}
		else {
			Actions.teleportEntityToPosition(playerIn, lookVec.getBlockPos());
			Actions.spawnParticleAtPosition(worldIn, lookVec.getBlockPos(), EnumParticleTypes.DRAGON_BREATH, 300, 3);
			Actions.summonLightningAtPosition(worldIn, lookVec.getBlockPos(), -1);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
		
		
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"aaa",
				"ada",
				" d ",
				
				'a', MyItems.my_item_1,
				'd', Items.DIAMOND
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + "This staff will take you through demnsions to teleport");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
