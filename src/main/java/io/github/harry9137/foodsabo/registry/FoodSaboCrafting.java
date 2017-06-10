package io.github.harry9137.foodsabo.registry;

import io.github.harry9137.foodsabo.handlers.CraftingHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodSaboCrafting {
    public static void registerRecipies(){
        //GameRegistry.addRecipe();

        GameRegistry.addRecipe(new CraftingHandler());
    }
}
