package io.github.harry9137.foodsabo.item;

import io.github.harry9137.foodsabo.Reference;

public class ItemPoisonSac extends PoisonItem {
    public ItemPoisonSac(){
        super();
        this.setRegistryName(Reference.MODID, "poison_sac");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
