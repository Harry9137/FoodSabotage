package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemAppleSeed extends FoodSaboItem {
    public ItemAppleSeed(){
        super();
        this.setRegistryName(Reference.MODID, "apple_seed");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
