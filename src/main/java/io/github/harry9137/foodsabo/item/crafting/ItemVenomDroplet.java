package io.github.harry9137.foodsabo.item.crafting;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;

public class ItemVenomDroplet extends FoodSaboItem {
    public ItemVenomDroplet(){
        super();
        this.setRegistryName(Reference.MODID, "venom_droplet");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
