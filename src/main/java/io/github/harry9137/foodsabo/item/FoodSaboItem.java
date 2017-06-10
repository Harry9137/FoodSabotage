package io.github.harry9137.foodsabo.item;

import io.github.harry9137.foodsabo.registry.FoodSaboTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodSaboItem extends Item {
    public FoodSaboItem(){
        super();
        this.setCreativeTab(FoodSaboTab.tab);
    }
}
