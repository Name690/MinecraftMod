package mymod.proxies;

import mymod.Main;
import mymod.MyEntities;
import mymod.library.LibRegistry;
import mymod.library.common.BakedModelLoader;
import mymod.library.gui.LibFurnaceGUI;
import mymod.library.gui.LibGUIHandler;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();

        OBJLoader.INSTANCE.addDomain(Main.MODID);

        ModelLoaderRegistry.registerLoader(new BakedModelLoader());
        MyEntities.registerEntityModels();
        LibRegistry.registerEntityModels();
    }

    @Override
    public void registerGUI(Class<? extends TileEntity> tile, Class<? extends Container> container, String textureGUI) {
        super.registerGUI(tile, container, textureGUI);
        LibGUIHandler.lookupTileToGUI.put(tile, LibFurnaceGUI.class);
    }
}
