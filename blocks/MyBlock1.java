package mymod.blocks;

import java.util.List;

import mymod.Main;
import mymod.MyBlocks;
import mymod.entities.mobs.MyEntityMob2;
import mymod.library.LibRegistry;
import mymod.library.blocks.LibBlockMultisided;
import mymod.library.util.Actions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMaterialMatcher;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyBlock1 extends LibBlockMultisided {

	public MyBlock1(String registryName) {
		super(registryName);
		this.setCreativeTab(Main.my_creative_tab_1);
	}
	
	private BlockPattern bossPattern;
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		this.replacePatternWithEntity(getBossPattern(), worldIn, pos, MyEntityMob2.class);
		super.onBlockAdded(worldIn, pos, state);
		Actions.playSound(worldIn, pos, SoundEvents.BLOCK_WOOD_BREAK, 0.7F, 1000);
	}
	
	protected BlockPattern getBossPattern()
    {
        if (this.bossPattern == null)
        {
            this.bossPattern = FactoryBlockPattern.start().aisle("a a",
            														"ddd",
            														"ada")
            		.where('d', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.DIRT)))
            		.where('b', BlockWorldState.hasState(BlockStateMatcher.forBlock(MyBlocks.my_block_1)))
            		.where('a', BlockWorldState.hasState(BlockMaterialMatcher.forMaterial(Material.AIR)))
            		.build();
        }

        return this.bossPattern;
    }
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"ddd",
				"ddd",
				"ddd",
				
				'd', Blocks.DIRT
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.BLUE + "If you place this on top of a t-shaped dirt it will summon the POOP CARLOS.");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
