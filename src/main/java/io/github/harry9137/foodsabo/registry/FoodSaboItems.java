package io.github.harry9137.foodsabo.registry;

import io.github.harry9137.foodsabo.item.*;
import io.github.harry9137.foodsabo.item.crafting.*;
import io.github.harry9137.foodsabo.item.poison.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodSaboItems {

    public static FoodSaboItem cyanidePowder;
    public static FoodSaboItem venomBottle;

    public static FoodSaboItem appleSeed;
    public static FoodSaboItem mortarPestle;
    public static FoodSaboItem carvingTools;
    public static FoodSaboItem groundAppleSeed;
    public static FoodSaboItem tinyCyanide;
    public static FoodSaboItem poisonSac;
    public static FoodSaboItem venomDroplet;

    public static void registerItems(){
        cyanidePowder = new ItemCyanidePowder();
        venomBottle = new ItemVenomBottle();

        appleSeed = new ItemAppleSeed();
        mortarPestle = new ItemMortarPestle();
        carvingTools = new ItemCarvingTools();
        groundAppleSeed = new ItemGroundSeed();
        tinyCyanide = new ItemTinyCyanide();
        poisonSac = new ItemPoisonSac();
        venomDroplet = new ItemVenomDroplet();

        GameRegistry.register(cyanidePowder);
        GameRegistry.register(venomBottle);

        GameRegistry.register(appleSeed);
        GameRegistry.register(mortarPestle);
        GameRegistry.register(carvingTools);
        GameRegistry.register(groundAppleSeed);
        GameRegistry.register(tinyCyanide);
        GameRegistry.register(poisonSac);
        GameRegistry.register(venomDroplet);
    }

    public static void registerRenderers(){
        registerRender(cyanidePowder);
        registerRender(poisonSac);
        registerRender(venomDroplet);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
