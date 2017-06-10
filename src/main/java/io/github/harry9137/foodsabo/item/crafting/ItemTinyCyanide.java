package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemTinyCyanide extends FoodSaboItem {
    public ItemTinyCyanide(){
        super();
        this.setRegistryName(Reference.MODID, "tiny_cyanide");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
