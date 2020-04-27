package mymod.blocks.furnaces;

import java.util.List;

import mymod.Main;
import mymod.library.LibRegistry;
import mymod.library.blocks.LibBlockFurnace;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyFurnace1 extends LibBlockFurnace {

	public MyFurnace1(String registryName, Class<? extends TileEntity> tileEntityClass) {
		super(registryName, tileEntityClass);
		this.setCreativeTab(Main.my_creative_tab_1);
		this.setHardness(3.0F);
		this.setResistance(4);
	}
	@Override
	public void initRecipe() {
		LibRegistry.addShapedRecipe(this, 1, 
				
				"bpb",
				"b b",
				"bpb",
				
				'p', Blocks.PISTON,
				'b', Blocks.IRON_BLOCK
				
		);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.WHITE + "This uses coal to turn coal into diamonds and get astral dust");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
