package mymod.proxies;

import mymod.Main;
import mymod.MyEntities;
import mymod.library.LibRegistry;
import mymod.library.common.IRegistryObject;
import mymod.library.common.Registry;
import mymod.library.gui.LibGUIHandler;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit() {
        LibRegistry.initialize(Main.MODID, Main.instance());
        MyEntities.preInit();
        MyEntities.registerEntitySpawns();
        LibRegistry.preInit();
    }

    public void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance(), new LibGUIHandler());
    }

    public void postInit() {
        // Initialize all recipes
        Registry.getRegisteredObjects().forEach(IRegistryObject::initRecipe);
    }

    public void registerGUI(Class<? extends TileEntity> tile, Class<? extends Container> container, String textureGUI) {
        LibGUIHandler.registerGUI(tile, container, textureGUI);
    }

}
