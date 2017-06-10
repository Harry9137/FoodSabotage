package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemMortarPestle extends FoodSaboItem {
    public ItemMortarPestle(){
        super();
        this.setRegistryName(Reference.MODID, "mortar_pestle");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
