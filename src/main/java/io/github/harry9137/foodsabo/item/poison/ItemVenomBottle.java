package io.github.harry9137.foodsabo.item.poison;

import io.github.harry9137.foodsabo.Reference;
import io.github.harry9137.foodsabo.item.FoodSaboItem;
import io.github.harry9137.foodsabo.item.IPoisonItem;

public class ItemVenomBottle extends FoodSaboItem implements IPoisonItem {
    public ItemVenomBottle(){
        super();
        this.setRegistryName(Reference.MODID, "venom_bottle");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
