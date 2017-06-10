package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemCarvingTools extends FoodSaboItem {
    public ItemCarvingTools(){
        super();
        this.setRegistryName(Reference.MODID, "carving_tools");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
