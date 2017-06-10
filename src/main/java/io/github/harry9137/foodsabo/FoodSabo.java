package io.github.harry9137.foodsabo;

import io.github.harry9137.foodsabo.handlers.CraftingHandler;
import io.github.harry9137.foodsabo.handlers.EventHandler;
import io.github.harry9137.foodsabo.registry.FoodSaboCrafting;
import io.github.harry9137.foodsabo.registry.FoodSaboItems;
import io.github.harry9137.foodsabo.proxy.CommonProxy;
import io.github.harry9137.foodsabo.registry.FoodSaboTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FoodSabo {

    public static boolean teInstalled = false;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);

        FoodSaboTab.init();

        FoodSaboItems.registerItems();

        MinecraftForge.EVENT_BUS.register(new EventHandler());

        System.out.println("Pre Registered.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);

        //teInstalled = Loader.isModLoaded("ThermalExpansion");

        FoodSaboCrafting.registerRecipies();
    }
}
