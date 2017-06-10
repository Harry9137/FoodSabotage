package io.github.harry9137.foodsabo.registry;

import io.github.harry9137.foodsabo.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodSaboTab extends CreativeTabs {

    public static CreativeTabs tab;

    public FoodSaboTab() {
        super(Reference.MODID);
    }

    public static void init(){
        tab = new FoodSaboTab();
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(FoodSaboItems.cyanidePowder);
    }
}
