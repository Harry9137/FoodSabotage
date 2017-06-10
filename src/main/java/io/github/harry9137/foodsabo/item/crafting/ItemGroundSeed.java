package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemGroundSeed extends FoodSaboItem {
    public ItemGroundSeed(){
        super();
        this.setRegistryName(Reference.MODID, "ground_seed");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
