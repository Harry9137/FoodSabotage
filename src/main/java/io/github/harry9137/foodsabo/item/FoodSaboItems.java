package io.github.harry9137.foodsabo.item;

import io.github.harry9137.foodsabo.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodSaboItems {

    public static PoisonItem cyanidePowder;
    public static PoisonItem poisonSac;

    public static void registerItems(){
        cyanidePowder = new ItemCyanidePowder();
        poisonSac = new ItemPoisonSac();

        GameRegistry.register(cyanidePowder);
        GameRegistry.register(poisonSac);
    }

    public static void registerRenderers(){
        registerRender(cyanidePowder);
        registerRender(poisonSac);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
