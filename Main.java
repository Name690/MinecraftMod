package mymod;

import mymod.proxies.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

/**
 * MOD INFO =================================================
 */
@Mod(modid = "mymod", name = "", version = "")
@Mod.EventBusSubscriber


/**
 * DECLARE =================================================
 */
public class Main {

	// ID
	public static final String MODID = "mymod";

	// Creative Tabs
	public static CreativeTabs my_creative_tab_1;
	

	/**
	 * REGISTER =================================================
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();

		// Creative Tabs
		my_creative_tab_1 = new CreativeTabs("my_creative_tab_1") {
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MyItems.my_item_1);
			}
		};

	}
	

	/**
	 * PROXIES =================================================
	 */
	@Mod.Instance
	private static Main instance;

	public static Main instance() {
		return instance;
	}
	

	@SidedProxy(clientSide = "mymod.proxies.ClientProxy", serverSide = "mymod.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		MyBlocks.init(event);
		MyBiomes.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

}
