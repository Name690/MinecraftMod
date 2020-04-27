package mymod;

import mymod.blocks.MyBlock1;
import mymod.blocks.MyCrop1;
import mymod.blocks.MyOre1;
import mymod.blocks.MyOre2;
import mymod.blocks.MyOre3;
import mymod.blocks.MyOre4;
import mymod.blocks.MyOre5;
import mymod.blocks.furnaces.MyFurnace1;
import mymod.blocks.furnaces.MyFurnace1Container;
import mymod.blocks.furnaces.MyFurnace1TileEntity;
import mymod.library.LibRegistry;
import mymod.library.blocks.LibItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * DECLARE BLOCKS =================================================
 */
@Mod.EventBusSubscriber
public class MyBlocks {

	// Astral Ore
	public static MyOre1 my_ore_1;

	// Astral Rock
	public static Block my_crop_1;

	// Compressor
	public static MyFurnace1 my_furnace_1;

	// Poop Carlos Raiser
	public static Block my_block_1;

	// Water Shards
	public static Block my_ore_2;

	// Fire Shards
	public static Block my_ore_3;

	// Air Shards
	public static Block my_ore_4;

	// Earth Shards
	public static Block my_ore_5;

	/**
	 * REGISTER BLOCKS =================================================
	 */
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {

		// Astral Ore
		my_ore_1 = new MyOre1("my_ore_1", "pickaxe", 0);
		event.getRegistry().register(my_ore_1);

		// Astral Rock
		my_crop_1 = new MyCrop1("my_crop_1");
		event.getRegistry().register(my_crop_1);

		// Compressor
		my_furnace_1 = new MyFurnace1("my_furnace_1", MyFurnace1TileEntity.class);
		event.getRegistry().register(my_furnace_1);
		LibRegistry.registerGUI(MyFurnace1TileEntity.class, MyFurnace1Container.class,
				"blocks/my_furnace_1/my_furnace_1_gui.png");

		// Poop Carlos Raiser
		my_block_1 = new MyBlock1("my_block_1");
		event.getRegistry().register(my_block_1);

		// Water Shards
		my_ore_2 = new MyOre2("my_ore_2", "pickaxe", 3);
		event.getRegistry().register(my_ore_2);

		// Fire Shards
		my_ore_3 = new MyOre3("my_ore_3", "pickaxe", 3);
		event.getRegistry().register(my_ore_3);

		// Fire Shards
		my_ore_4 = new MyOre4("my_ore_4", "pickaxe", 3);
		event.getRegistry().register(my_ore_4);

		// Fire Shards
		my_ore_5 = new MyOre5("my_ore_5", "pickaxe", 3);
		event.getRegistry().register(my_ore_5);

	}

	/**
	 * REGISTER BLOCK ITEMS =================================================
	 */
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		// Astral Ore
		event.getRegistry().register(new LibItemBlock(my_ore_1));

		// Astral Rock
		event.getRegistry().register(new LibItemBlock(my_crop_1));

		// Compressor
		event.getRegistry().register(new LibItemBlock(my_furnace_1));

		// Poop Carlos Raiser
		event.getRegistry().register(new LibItemBlock(my_block_1));

		// Water Shards
		event.getRegistry().register(new LibItemBlock(my_ore_2));

		// Fire Shards
		event.getRegistry().register(new LibItemBlock(my_ore_3));

		// Air Shards
		event.getRegistry().register(new LibItemBlock(my_ore_4));

		// Earth Shards
		event.getRegistry().register(new LibItemBlock(my_ore_5));
	}

	/**
	 * GENERATE ORE =================================================
	 */
	public static void init(FMLInitializationEvent event) {

		// Astral Ore
		LibRegistry.registerOreGen(my_ore_1.getDefaultState(), 100, 75, 100, 11, 1);

		// Astral Rock
		LibRegistry.registerOreGen(my_crop_1.getDefaultState(), 50, 75, 200, 2, 1);

		// Water Shards
		LibRegistry.registerOreGen(my_ore_2.getDefaultState(), 100, 3, 25, 5, 2);

		// Fire Shards
		LibRegistry.registerOreGen(my_ore_3.getDefaultState(), 100, 3, 25, 5, 2);

		// Air Shards
		LibRegistry.registerOreGen(my_ore_4.getDefaultState(), 100, 3, 25, 5, 2);
		
		// Earth Shards
		LibRegistry.registerOreGen(my_ore_5.getDefaultState(), 100, 3, 25, 5, 2);

	}

}
