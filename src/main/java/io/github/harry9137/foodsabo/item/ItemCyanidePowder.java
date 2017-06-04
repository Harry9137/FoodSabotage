package io.github.harry9137.foodsabo.item;

import io.github.harry9137.foodsabo.Reference;

public class ItemCyanidePowder extends PoisonItem {
    public ItemCyanidePowder(){
        super();
        this.setRegistryName(Reference.MODID, "cyanide_powder");
        this.setUnlocalizedName(this.getRegistryName().toString());
    }
}
