package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;
import io.github.harry9137.foodsabo.item.IPoisonItem;

public class ItemPoisonSac extends FoodSaboItem {
    public ItemPoisonSac(){
        super();
        this.setRegistryName(Reference.MODID, "poison_sac");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
