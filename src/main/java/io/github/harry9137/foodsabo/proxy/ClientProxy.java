package io.github.harry9137.foodsabo.proxy;

import io.github.harry9137.foodsabo.item.FoodSaboItems;
import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        FoodSaboItems.registerRenderers();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {

    }

    @Override
    public void serverStopping(FMLServerStoppingEvent event) {

    }
}
