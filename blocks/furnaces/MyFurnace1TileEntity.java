package mymod.blocks.furnaces;

import mymod.MyBlocks;
import mymod.MyItems;
import mymod.library.blocks.LibFurnaceTileEntity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;

public class MyFurnace1TileEntity extends LibFurnaceTileEntity {

	public MyFurnace1TileEntity() {
		this.initializeSlots(1, 2, 1);
		this.setCookTimePerItem(200);
		this.setCookingParticle(EnumParticleTypes.EXPLOSION_NORMAL, 2, 1);
		
		//Astral Dust
		this.addFueledRecipe(new ItemStack(MyItems.my_item_1, 1), Items.COAL, 20, MyBlocks.my_ore_1);
		this.addFueledRecipe(new ItemStack(MyItems.my_item_1, 1), Blocks.COAL_BLOCK, 190, MyBlocks.my_ore_1);
		//Diamond
		this.addFueledRecipe(new ItemStack(Items.DIAMOND, 1), Items.COAL, 9, Items.COAL);
		this.addFueledRecipe(new ItemStack(Items.DIAMOND, 1), Blocks.COAL_BLOCK, 81, Items.COAL);
		//Hay Block
		this.addFueledRecipe(new ItemStack(Blocks.HAY_BLOCK, 1), Items.COAL, 10, Items.WHEAT);
		this.addFueledRecipe(new ItemStack(Blocks.HAY_BLOCK, 1), Blocks.COAL_BLOCK, 90, Items.WHEAT);
		
		//Atomic Poop
		this.addFueledRecipe(new ItemStack(MyItems.my_projectile_1, 1), Items.COAL, 10, Blocks.DIRT);
		this.addFueledRecipe(new ItemStack(MyItems.my_projectile_1, 1), Blocks.COAL_BLOCK, 90, Blocks.DIRT);
		
		//Iron Plate
	}

}
