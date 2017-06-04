package io.github.harry9137.foodsabo.proxy;

import net.minecraftforge.fml.common.event.*;

public abstract class CommonProxy {
    public abstract void preInit(FMLPreInitializationEvent event);
    public abstract void init(FMLInitializationEvent event);
    public abstract void postInit(FMLPostInitializationEvent event);
    public abstract void serverStarting(FMLServerStartingEvent event);
    public abstract void serverStopping(FMLServerStoppingEvent event);
}
