package mymod.blocks.furnaces;

import mymod.library.blocks.LibFurnaceTileEntity;
import mymod.library.gui.LibFurnaceContainer;
import mymod.library.gui.LibFurnaceContainer.AnimateDirection;
import mymod.library.inventory.LibSlotFuel;
import mymod.library.inventory.LibSlotIngredient;
import mymod.library.inventory.LibSlotOutput;
import net.minecraft.entity.player.InventoryPlayer;

public class MyFurnace1Container extends LibFurnaceContainer {

	public MyFurnace1Container(InventoryPlayer playerInventory, LibFurnaceTileEntity furnaceInventory) {
		super(playerInventory, furnaceInventory);
		this.addPlayerInventory(playerInventory);
		this.setGuiTitle("");
		
		this.addSlotToContainer(new LibSlotIngredient(furnaceInventory,  0, 78, 11));
		
		this.addSlotToContainer(new LibSlotFuel(furnaceInventory, 1, 36, 41));
		this.addSlotToContainer(new LibSlotFuel(furnaceInventory, 2, 120, 40));
		
		this.addSlotToContainer(new LibSlotOutput(furnaceInventory, 3, 78, 41));
		
		this.setArrowPosition(81, 28);
		this.setArrowOverlayPosition(87, 245);
		this.setArrowSize(10, 8);
		this.setArrowDirection(AnimateDirection.DOWN);
		
		this.setBurnPosition(53, 47);
		this.setBurnOverlayPosition(3, 249);
		this.setBurnSize(66, 4);
		this.setBurnDirection(AnimateDirection.DOWN);
	}

}
